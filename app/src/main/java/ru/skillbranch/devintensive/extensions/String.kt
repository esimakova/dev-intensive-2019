package ru.skillbranch.devintensive.extensions

fun String.endsWith2to4() : Boolean = this.endsWith("2")
        || this.endsWith("3") || this.endsWith("4")

fun String.endsWith12to14() : Boolean = this.endsWith("12")
        || this.endsWith("13") || this.endsWith("14")

fun String?.isEmptyOrBlank() : Boolean = this?.isEmpty() == true || this?.isBlank() == true

fun String?.truncate(digits : Int = 16) : String? {
    var trimmedString = this?.trim(' ')
    val length = trimmedString?.length
    var truncatedString : String? = trimmedString
    val placeholder = "..."

    if (length != null && length > digits) {
        if(length > digits)
        truncatedString = trimmedString?.substring(0, digits)

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
    //val pattern2 = "[^A-ZА-Яa-zа-я0-9 \\- ]".toRegex()
    val pattern3 = "[!@#\$%^&*]".toRegex()
    var noHtml = this?.replace(pattern, "")
    //noHtml = noHtml?.replace(pattern2, "")
    noHtml = noHtml?.replace("&nbsp;", "")
    noHtml = noHtml?.replace("&amp;", "")
    noHtml = noHtml?.replace("&lt;", "")
    noHtml = noHtml?.replace("&gt;", "")
    noHtml = noHtml?.replace("&#39;", "")
    noHtml = noHtml?.replace("&quot;", "")
    noHtml = removeWhiteSpaces(noHtml)
    //noHtml = noHtml?.trim()
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