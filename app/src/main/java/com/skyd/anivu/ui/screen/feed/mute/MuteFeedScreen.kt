package com.skyd.anivu.ui.screen.feed.mute

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.VolumeOff
import androidx.compose.material.icons.automirrored.outlined.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.skyd.anivu.R
import com.skyd.anivu.base.mvi.MviEventListener
import com.skyd.anivu.base.mvi.getDispatcher
import com.skyd.anivu.ext.plus
import com.skyd.anivu.model.bean.feed.FeedBean
import com.skyd.anivu.ui.component.CircularProgressPlaceholder
import com.skyd.anivu.ui.component.ErrorPlaceholder
import com.skyd.anivu.ui.component.PodAuraTopBar
import com.skyd.anivu.ui.component.PodAuraTopBarStyle
import com.skyd.anivu.ui.component.TipSettingsItem
import com.skyd.anivu.ui.component.dialog.WaitingDialog
import com.skyd.anivu.ui.screen.article.FeedIcon
import com.skyd.anivu.ui.screen.feed.mute.MuteFeedState.ListState


const val MUTE_FEED_SCREEN_ROUTE = "muteFeedScreen"

@Composable
fun MuteFeedScreen(viewModel: MuteFeedViewModel = hiltViewModel()) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    val snackbarHostState = remember { SnackbarHostState() }

    val uiState by viewModel.viewState.collectAsStateWithLifecycle()
    val dispatcher = viewModel.getDispatcher(startWith = MuteFeedIntent.Init)

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = {
            PodAuraTopBar(
                style = PodAuraTopBarStyle.Small,
                scrollBehavior = scrollBehavior,
                title = { Text(text = stringResource(R.string.mute_feed_screen_name)) },
            )
        }
    ) { paddingValues ->
        FeedList(
            contentPadding = paddingValues,
            listState = uiState.listState,
            dispatcher = dispatcher,
        )

        MviEventListener(viewModel.singleEvent) { event ->
            when (event) {
                is MuteFeedEvent.MuteResultEvent.Failed ->
                    snackbarHostState.showSnackbar(event.msg)
            }
        }

        WaitingDialog(visible = uiState.loadingDialog)
    }
}

@Composable
private fun FeedList(
    contentPadding: PaddingValues,
    listState: ListState,
    dispatcher: (MuteFeedIntent) -> Unit,
) {
    val lazyListState = rememberLazyListState()
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        state = lazyListState,
        contentPadding = contentPadding + PaddingValues(vertical = 6.dp),
    ) {
        item { TipSettingsItem(text = stringResource(R.string.mute_feed_screen_tip)) }
        when (listState) {
            is ListState.Failed -> item { ErrorPlaceholder(listState.msg) }
            ListState.Init -> item { CircularProgressPlaceholder() }
            is ListState.Success -> items(listState.dataList, key = { it.url }) { item ->
                MuteFeedItem(
                    feed = item,
                    onMute = { dispatcher(MuteFeedIntent.Mute(item.url, it)) },
                )
            }
        }
    }
}

@Composable
private fun MuteFeedItem(
    feed: FeedBean,
    onMute: (Boolean) -> Unit,
) {
    val interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    Row(
        modifier = Modifier
            .toggleable(
                value = !feed.mute,
                interactionSource = interactionSource,
                indication = LocalIndication.current,
                role = Role.Switch,
                onValueChange = { onMute(!it) },
            )
            .padding(horizontal = 16.dp, vertical = 6.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        FeedIcon(data = feed, size = 36.dp)
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = feed.title.orEmpty(),
            modifier = Modifier.weight(1f),
            style = MaterialTheme.typography.titleMedium,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(modifier = Modifier.width(10.dp))
        Switch(
            checked = !feed.mute,
            onCheckedChange = { onMute(!it) },
            thumbContent = {
                Icon(
                    imageVector = if (feed.mute) Icons.AutoMirrored.Outlined.VolumeOff else Icons.AutoMirrored.Outlined.VolumeUp,
                    contentDescription = stringResource(if (feed.mute) R.string.feed_screen_feed_muted else R.string.feed_screen_feed_unmuted),
                    modifier = Modifier.size(SwitchDefaults.IconSize),
                )
            },
            interactionSource = interactionSource,
        )
    }
}