package com.riseup.whatsappui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.riseup.whatsappui.domain.ChatListDataObject
import com.riseup.whatsappui.domain.Message
import com.riseup.whatsappui.domain.MessageDeliveryStatus
import com.riseup.whatsappui.domain.MessageType
import com.riseup.whatsappui.ui.theme.HighlightLightGreen

@Composable
fun UserDetails(chatData: ChatListDataObject) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        MessageHeader(chatData)
        MessageSubSection(chatData)
    }
}

@Preview(showBackground = true)
@Composable
fun UserDetailsPreview() {
    UserDetails(
        chatData = ChatListDataObject(
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

}

@Composable
fun MessageHeader(chatData: ChatListDataObject) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            modifier = Modifier.weight(1f),
            value = chatData.userNames,
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        TextComponent(
            value = chatData.message.timeStamp,
            fontSize = 12.sp,
            color = if ((chatData.message.unreadCount ?: 0) > 0) HighlightLightGreen else Color.Gray,
            modifier = null
        )
    }
}

@Composable
fun MessageSubSection(chatData: ChatListDataObject) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            modifier = Modifier.weight(1f),
            value = chatData.message.content,
            fontSize = 16.sp,
            color = Color.Gray
        )
        chatData.message.unreadCount?.also {
            CircularCount(
                unreadCount = it.toString(),
                backgroundColor = HighlightLightGreen,
                textColor = Color.White
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MessageHeaderPreview() {
    MessageHeader(
        chatData = ChatListDataObject(
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
}

@Preview
@Composable
fun MessageSubSectionPreview() {
    MessageSubSection(
        chatData = ChatListDataObject(
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
}