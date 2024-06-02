package com.skyd.anivu.ui.fragment.feed

import com.skyd.anivu.base.mvi.MviSingleEvent
import com.skyd.anivu.model.bean.FeedBean

sealed interface FeedEvent : MviSingleEvent {
    sealed interface InitFeetListResultEvent : FeedEvent {
        data class Failed(val msg: String) : InitFeetListResultEvent
    }

    sealed interface AddFeedResultEvent : FeedEvent {
        data object Success : AddFeedResultEvent
        data class Failed(val msg: String) : AddFeedResultEvent
    }

    sealed interface EditFeedResultEvent : FeedEvent {
        data class Success(val feed: FeedBean) : EditFeedResultEvent
        data class Failed(val msg: String) : EditFeedResultEvent
    }

    sealed interface RemoveFeedResultEvent : FeedEvent {
        data object Success : RemoveFeedResultEvent
        data class Failed(val msg: String) : RemoveFeedResultEvent
    }

    sealed interface RefreshFeedResultEvent : FeedEvent {
        data object Success : RefreshFeedResultEvent
        data class Failed(val msg: String) : RefreshFeedResultEvent
    }

    sealed interface CreateGroupResultEvent : FeedEvent {
        data object Success : CreateGroupResultEvent
        data class Failed(val msg: String) : CreateGroupResultEvent
    }

    sealed interface DeleteGroupResultEvent : FeedEvent {
        data object Success : DeleteGroupResultEvent
        data class Failed(val msg: String) : DeleteGroupResultEvent
    }

    sealed interface MoveFeedsToGroupResultEvent : FeedEvent {
        data object Success : MoveFeedsToGroupResultEvent
        data class Failed(val msg: String) : MoveFeedsToGroupResultEvent
    }
}