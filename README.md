<div align="center">
    <div>
        <img src="doc/image/AniVu.svg" style="height: 210px"/>
    </div>
    <h1>🥰 AniVu</h1>
    <p>(<b>A</b> <b>N</b>ew <b>I</b>ntegration <b>View</b>)</p>
    <p>
        <a href="https://github.com/SkyD666/AniVu/actions" style="text-decoration:none">
            <img src="https://img.shields.io/github/actions/workflow/status/SkyD666/AniVu/pre_release.yml?branch=master&style=for-the-badge" alt="GitHub Workflow Status"  />
        </a>
        <a href="https://github.com/SkyD666/AniVu/releases/latest" style="text-decoration:none">
            <img src="https://img.shields.io/github/v/release/SkyD666/AniVu?display_name=release&style=for-the-badge" alt="GitHub release (latest by date)"/>
        </a>
        <a href="https://f-droid.org/packages/com.skyd.anivu/" style="text-decoration:none">
            <img src="https://img.shields.io/f-droid/v/com.skyd.anivu?style=for-the-badge&logo=F-Droid&color=1976d2" alt="F-Droid Version"/>
        </a>
        <a href="https://github.com/SkyD666/AniVu/releases/latest" style="text-decoration:none" >
            <img src="https://img.shields.io/github/downloads/SkyD666/AniVu/total?style=for-the-badge" alt="GitHub all downloads"/>
        </a>
        <a href="https://www.android.com/versions/nougat-7-0" style="text-decoration:none" >
            <img src="https://img.shields.io/badge/Android 7.0+-brightgreen?style=for-the-badge&logo=android&logoColor=white" alt="Support platform"/>
        </a>
        <a href="https://github.com/SkyD666/AniVu/blob/master/LICENSE" style="text-decoration:none" >
            <img src="https://img.shields.io/github/license/SkyD666/AniVu?style=for-the-badge" alt="GitHub license"/>
        </a>
        <a href="https://t.me/SkyD666Chat" style="text-decoration:none" >
            <img src="https://img.shields.io/badge/Telegram-2CA5E0?logo=telegram&logoColor=white&style=for-the-badge" alt="Telegram"/>
        </a>
        <a href="https://discord.gg/pEWEjeJTa3" style="text-decoration:none" >
            <img src="https://img.shields.io/discord/982522006819991622?color=5865F2&label=Discord&logo=discord&logoColor=white&style=for-the-badge" alt="Discord"/>
        </a>
    </p>
    <p>
        An <b>all-in-one Podcast tool</b> for <b>RSS subscription and updates</b>, <b>media downloads</b> and <b>playback</b>.
    </p>
    <p>
        AniVu utilizes the <b><a href="https://developer.android.com/topic/architecture#recommended-app-arch">MVI</a></b> architecture and fully adopts the <b><a href="https://m3.material.io/">Material You</a></b> design style. All pages are developed using <b>Jetpack Compose</b>.
    </p>
    <p>
        <b><a href="doc/readme/README-zh-rCN.md">简体中文</a></b>&nbsp&nbsp&nbsp|&nbsp&nbsp&nbsp<b><a href="doc/readme/README-zh-rTW.md">正體中文</a></b>&nbsp&nbsp&nbsp|&nbsp&nbsp&nbsp<b><a href="https://crowdin.com/project/anivu">Help us translate</a></b>
    </p>
</div>

<a href="https://f-droid.org/packages/com.skyd.anivu"><img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png" alt="Get it on F-Droid" height="80"></a>

## 💡 Features

1. **Subscribe to RSS**, Update RSS, **Read** RSS
2. **Automatically update RSS** subscriptions
3. **Download** enclosures (enclosure tags) in RSS articles, also supports **torrent or magnet links**
4. **Seeding** downloaded files
5. **Play media enclosures or downloaded videos**
6. Support variable playback **speed**, setup **audio track**, **subtitle track**, etc
7. **Double-finger** gesture to **rotate and zoom** video, **long press** to speed up playback
8. **Swipe** on the video to **control volume**, **brightness**, and **playback position**
9. **Searching** existing **RSS subscription content**
10. **Play other videos on the phone**
11. Support **custom MPV player**
12. Support Android **Picture in Picture**
13. Support **import and export** subscriptions via **OPML**
14. Support **dark mode**
15. ......

## 🤩 Screenshots

<img src="doc/image/en/ic_rss_screen.jpg" alt="ic_rss_screen" style="zoom:80%;" /> <img src="doc/image/en/ic_rss_screen_edit.jpg" alt="ic_rss_screen_edit" style="zoom:80%;" />
<img src="doc/image/en/ic_article_screen.jpg" alt="ic_article_screen" style="zoom:80%;" /> <img src="doc/image/en/ic_read_screen.jpg" alt="ic_read_screen" style="zoom:80%;" />
<img src="doc/image/en/ic_media_screen.jpg" alt="ic_media_screen" style="zoom:80%;" /> <img src="doc/image/en/ic_download_screen.jpg" alt="ic_download_screen" style="zoom:80%;" />
<img src="doc/image/en/ic_setting_screen.jpg" alt="ic_setting_screen" style="zoom:80%;" /> <img src="doc/image/en/ic_appearance_screen.jpg" alt="ic_appearance_screen" style="zoom:80%;" />
<img src="doc/image/en/ic_rss_config_screen.jpg" alt="ic_rss_config_screen" style="zoom:80%;" /> <img src="doc/image/en/ic_about_screen.jpg" alt="ic_about_screen" style="zoom:80%;" />
<img src="doc/image/en/ic_player_activity.jpg" alt="ic_player_activity" style="zoom:80%;" />

## 🌏 Translation

If you are interested, please help us **translate**, thank you.

<a title="Crowdin" target="_blank" href="https://crowdin.com/project/anivu"><img src="https://badges.crowdin.net/anivu/localized.svg"></a>

## 🛠 Primary technology stack

- **MVI** Architecture
- Jetpack **Compose**
- Kotlin ﻿**Coroutines and Flow**
- **Material You**
- **ViewModel**
- **Room**
- **Paging 3**
- **Hilt**
- **MPV**
- **WorkManager**
- **DataStore**
- Splash Screen
- Navigation
- Coil

## ✨ Star History

[![Star History Chart](https://api.star-history.com/svg?repos=SkyD666/AniVu)](https://star-history.com/?repos=SkyD666/AniVu#SkyD666/AniVu&Date)

## 🎈 Other works

<table>
<thead>
  <tr>
    <th>Work</th>
    <th>Description</th>
    <th>Link</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td><img src="doc/image/Rays.svg" style="height: 100px"/></td>
    <td><b>Rays (Record All Your Stickers)</b>, A tool to <b>record, search and manage stickers</b> on your phone. 🥰 Are you still struggling with <b>too many stickers on your phone</b> and having trouble finding the ones you want? This tool will help you <b>manage your stickers</b>! 😋</td>
    <td><a href="https://github.com/SkyD666/Rays-Android">https://github.com/SkyD666/Rays-Android</a></td>
  </tr>
  <tr>
    <td><img src="doc/image/Raca.svg" style="height: 100px"/></td>
    <td><b>Raca (Record All Classic Articles)</b>, a tool to <b>record and search abstract passages and mini-essays</b> in the comments section locally. 🤗 Are you still having trouble remembering the content of your mini-essay and facing the embarrassing situation of forgetting the front, middle and back? Using this tool will help you <b>record the mini-essays</b> you come across and never worry about forgetting them again! 😋</td>
    <td><a href="https://github.com/SkyD666/Raca-Android">https://github.com/SkyD666/Raca-Android</a></td>
  </tr>
  <tr>
    <td><img src="doc/image/NightScreen.svg" style="height: 100px"/></td>
    <td><b>NightScreen</b>, when you <b>use your phone at night</b> 🌙, Night Screen can help you <b>reduce the brightness</b> of the screen and <b>reduce the damage to your eyes</b>.</td>
    <td><a href="https://github.com/SkyD666/NightScreen">https://github.com/SkyD666/NightScreen</a></td>
  </tr>
</tbody>
</table>

## 📃 License

This software code is available under the following **license**

[**GNU General Public License v3.0**](LICENSE)
