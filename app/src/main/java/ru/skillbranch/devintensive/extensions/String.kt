package ru.skillbranch.devintensive.extensions

fun String.endsWith2to4() : Boolean = this.endsWith("2")
        || this.endsWith("3") || this.endsWith("4")

fun String?.isEmptyOrBlank() : Boolean = this?.isEmpty() == true || this?.isBlank() == true