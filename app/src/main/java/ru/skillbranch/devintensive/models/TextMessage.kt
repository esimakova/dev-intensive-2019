package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.humanizeDiff
import src.main.java.ru.skillbranch.devintensive.models.User
import java.util.*

class TextMessage(
    from : User?,
    chat : Chat,
    isIncoming : Boolean = false,
    date : Date = Date(),
    var text : String?
) : BaseMessage(from, chat, isIncoming, date) {

    override fun formatMessage(): String = "${from?.firstName} " +
            "${if(isIncoming) "получил" else "отправил"} сообщение \"$text\" ${date.humanizeDiff()}"
}