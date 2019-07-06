package ru.skillbranch.devintensive.models

import src.main.java.ru.skillbranch.devintensive.models.User

class Chat(
    val id : String,
    val members : MutableList<User> = mutableListOf(),
    val messages : MutableList<BaseMessage> = mutableListOf()
) {
}