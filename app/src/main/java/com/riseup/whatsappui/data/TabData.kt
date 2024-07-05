package com.riseup.whatsappui.data

data class TabData(
    val title: String,
    val unReadCount: Int?

    )

val tabs = listOf(
    TabData(title = Tabs.CHATS.value, unReadCount = 2),
    TabData(title = Tabs.STATUS.value, unReadCount = null),
    TabData(title = Tabs.CALLS.value, unReadCount = 4)
)

enum class Tabs(val value:String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}

const val INITIAL_SCREEN_INDEX = 0