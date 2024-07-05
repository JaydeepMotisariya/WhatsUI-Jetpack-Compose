package com.riseup.whatsappui.domain

import com.riseup.whatsappui.R

data class ChatListDataObject(
    val chatId: Int,
    val message: Message,
    val userNames: String,
    val userImage: Int = R.drawable.ic_user
)

data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp: String,
    val unreadCount: Int?=null
)

enum class MessageDeliveryStatus {
    PENDING,
    DELIVERED,
    READ,
    ERROR
}

enum class MessageType {
    TEXT,
    IMAGE,
    VIDEO,
    AUDIO
}
