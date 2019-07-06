package ru.skillbranch.devintensive.extensions

fun String.contains2to4() : Boolean = this.contains("2")
        || this.contains("3") || this.contains("4")

fun String?.isEmptyOrBlank() : Boolean = this?.isEmpty() == true || this?.isBlank() == true