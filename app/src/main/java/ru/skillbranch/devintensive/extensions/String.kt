package ru.skillbranch.devintensive.extensions

fun String.endsWith2to4() : Boolean = this.endsWith("2")
        || this.endsWith("3") || this.endsWith("4")

fun String?.isEmptyOrBlank() : Boolean = this?.isEmpty() == true || this?.isBlank() == true

fun String?.truncate(digits : Int = 16) : String? {
    val trimmedString = this?.trim()
    val length = trimmedString?.length
    var truncatedString : String? = trimmedString
    val placeholder = "..."

    if (length != null && length > digits) {
        if(length > digits)
        truncatedString = this?.substring(0, digits)

            if (truncatedString?.get(digits-1)?.isWhitespace()!!){
                truncatedString = truncatedString?.trim()
                truncatedString += placeholder
            }

            else if (length > digits){
                truncatedString += placeholder
                return truncatedString
            }
    }

    else if (length != null && length <= digits){
        truncatedString = this?.trim()
    }

    return truncatedString
}

fun String?.stripHtml() : String? {
    val pattern = "<.*?>".toRegex()
    val pattern2 = "[^A-ZА-Яa-zа-я0-9 \\- ]".toRegex()
    var noHtml = this?.replace(pattern, "")
    noHtml = noHtml?.replace(pattern2, "")
    noHtml = noHtml?.replace("nbsp", "")
    noHtml = removeWhiteSpaces(noHtml)
    noHtml = noHtml?.trim()
    return noHtml
}

fun String?.removeWhiteSpaces(value : String?) : String? {
    var result = ""
    var prevChar = ""
    if (value != null) {
        for (char in value){
            if(!(prevChar == " " && char == ' ')){
                result += char
            }
            prevChar = char.toString()
        }
    }
    return result
}