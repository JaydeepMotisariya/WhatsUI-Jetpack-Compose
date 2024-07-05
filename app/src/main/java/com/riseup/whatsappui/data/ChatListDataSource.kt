package com.riseup.whatsappui.data

import com.riseup.whatsappui.domain.ChatListDataObject
import com.riseup.whatsappui.domain.Message
import com.riseup.whatsappui.domain.MessageDeliveryStatus
import com.riseup.whatsappui.domain.MessageType

val chatList = listOf(
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 2
        ),
        userNames = "Jaydeep Motisariya"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "How are you?",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = null
        ),
        userNames = "Alice Johnson"
    ),
    ChatListDataObject(
        chatId = 3,
        message = Message(
            content = "Meeting at 10 AM",
            timeStamp = "27/02/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userNames = "Bob Smith"
    ),
    ChatListDataObject(
        chatId = 4,
        message = Message(
            content = "Lunch plans?",
            timeStamp = "27/02/2024",
            type = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.ERROR,
            unreadCount = 6
        ),
        userNames = "Clara Adams"
    ),
    ChatListDataObject(
        chatId = 5,
        message = Message(
            content = "Project deadline",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userNames = "David Brown"
    ),
    ChatListDataObject(
        chatId = 6,
        message = Message(
            content = "Can we reschedule?",
            timeStamp = "27/02/2024",
            type = MessageType.VIDEO,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userNames = "Eve Thompson"
    ),
    ChatListDataObject(
        chatId = 7,
        message = Message(
            content = "Happy Birthday!",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userNames = "Frank White"
    ),
    ChatListDataObject(
        chatId = 8,
        message = Message(
            content = "See you soon",
            timeStamp = "27/02/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.ERROR
        ),
        userNames = "Grace Green"
    ),
    ChatListDataObject(
        chatId = 9,
        message = Message(
            content = "Call me back",
            timeStamp = "27/02/2024",
            type = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userNames = "Henry Walker"
    ),
    ChatListDataObject(
        chatId = 10,
        message = Message(
            content = "Good night",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userNames = "Ivy Hall"
    )
)