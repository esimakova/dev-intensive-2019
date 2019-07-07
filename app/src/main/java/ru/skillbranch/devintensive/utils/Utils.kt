package ru.skillbranch.devintensive.utils

import ru.skillbranch.devintensive.extensions.isEmptyOrBlank

object Utils {
    fun parseFullName(fullName : String?) : Pair<String?, String?>{

        val newFullName = removeExtraWhiteSpaces(fullName)?.trim()
        val parts : List<String>? = newFullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        if(firstName.isEmptyOrBlank()) firstName = null
        if(lastName.isEmptyOrBlank()) lastName = null

        //return Pair(firstName, secondName)
        return firstName to lastName
    }

    fun removeExtraWhiteSpaces(value : String?) : String? {
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

    fun transliteration(payload: String, divider: String = " "): String {

            var name : String = ""
            var nn : String = ""
            var div : CharArray = divider.toCharArray()


                for (s in payload) {
                    when (s) {
                        'а' -> name = "a"
                        'б' -> name = "b"
                        'в' -> name = "v"
                        'г' -> name = "g"
                        'д' -> name = "d"
                        'е' -> name = "e"
                        'ё' -> name = "e"
                        'ж' -> name = "zh"
                        'з' -> name = "z"
                        'и' -> name = "i"
                        'й' -> name = "i"
                        'к' -> name = "k"
                        'л' -> name = "l"
                        'м' -> name = "m"
                        'н' -> name = "n"
                        'о' -> name = "o"
                        'п' -> name = "p"
                        'р' -> name = "r"
                        'с' -> name = "s"
                        'т' -> name = "t"
                        'у' -> name = "u"
                        'ф' -> name = "f"
                        'х' -> name = "h"
                        'ц' -> name = "c"
                        'ч' -> name = "ch"
                        'ш' -> name = "sh"
                        'щ' -> name = "sh'"
                        'ъ' -> name = ""
                        'ы' -> name = "i"
                        'ь' -> name = ""
                        'э' -> name = "e"
                        'ю' -> name = "yu"
                        'я' -> name = "ya"

                        'А' -> name = "a".capitalize()
                        'Б' -> name = "b".capitalize()
                        'В' -> name = "v".capitalize()
                        'Г' -> name = "g".capitalize()
                        'Д' -> name = "d".capitalize()
                        'Е' -> name = "e".capitalize()
                        'Ё' -> name = "e".capitalize()
                        'Ж' -> name = "zh".capitalize()
                        'З' -> name = "z".capitalize()
                        'И' -> name = "i".capitalize()
                        'Й' -> name = "i".capitalize()
                        'К' -> name = "k".capitalize()
                        'Л' -> name = "l".capitalize()
                        'М' -> name = "m".capitalize()
                        'Н' -> name = "n".capitalize()
                        'О' -> name = "o".capitalize()
                        'П' -> name = "p".capitalize()
                        'Р' -> name = "r".capitalize()
                        'С' -> name = "s".capitalize()
                        'Т' -> name = "t".capitalize()
                        'У' -> name = "u".capitalize()
                        'Ф' -> name = "f".capitalize()
                        'Х' -> name = "h".capitalize()
                        'Ц' -> name = "c".capitalize()
                        'Ч' -> name = "ch".capitalize()
                        'Ш' -> name = "sh".capitalize()
                        'Щ' -> name = "sh'".capitalize()
                        'Ъ' -> name = "".capitalize()
                        'Ы' -> name = "i".capitalize()
                        'Ь' -> name = "".capitalize()
                        'Э' -> name = "e".capitalize()
                        'Ю' -> name = "yu".capitalize()
                        'Я' -> name = "ya".capitalize()

                        'a' -> name = "a"
                        'b' -> name = "b"
                        'v' -> name = "v"
                        'g' -> name = "g"
                        'd' -> name = "d"
                        'e' -> name = "e"
                        'z' -> name = "z"
                        "zh".toCharArray()[0] -> name = "zh"
                        'i' -> name = "i"
                        'k' -> name = "k"
                        'l' -> name = "l"
                        'm' -> name = "m"
                        'n' -> name = "n"
                        'o' -> name = "o"
                        'p' -> name = "p"
                        'r' -> name = "r"
                        's' -> name = "s"
                        't' -> name = "t"
                        'u' -> name = "u"
                        'f' -> name = "f"
                        'h' -> name = "h"
                        'c' -> name = "c"
                        "ch".toCharArray()[0] -> name = "ch"
                        "sh".toCharArray()[0] -> name = "sh"
                        "sh'".toCharArray()[0] -> name = "sh'"
                        "yu".toCharArray()[0] -> name = "yu"
                        "ya".toCharArray()[0] -> name = "ya"

                        'A' -> name = "a".capitalize()
                        'B' -> name = "b".capitalize()
                        'V' -> name = "v".capitalize()
                        'G' -> name = "g".capitalize()
                        'D' -> name = "d".capitalize()
                        'E' -> name = "e".capitalize()
                        "Zh".toCharArray()[0] -> name = "zh".capitalize()
                        "ZH".toCharArray()[0] -> name = "zh".capitalize()
                        'Z' -> name = "z".capitalize()
                        'I' -> name = "i".capitalize()
                        'K' -> name = "k".capitalize()
                        'L' -> name = "l".capitalize()
                        'M' -> name = "m".capitalize()
                        'N' -> name = "n".capitalize()
                        'O' -> name = "o".capitalize()
                        'P' -> name = "p".capitalize()
                        'R' -> name = "r".capitalize()
                        'S' -> name = "s".capitalize()
                        'T' -> name = "t".capitalize()
                        'U' -> name = "u".capitalize()
                        'F' -> name = "f".capitalize()
                        'H' -> name = "h".capitalize()
                        'C' -> name = "c".capitalize()
                        "Ch".toCharArray()[0] -> name = "ch".capitalize()
                        "CH".toCharArray()[0] -> name = "ch".capitalize()
                        "Sh".toCharArray()[0] -> name = "sh".capitalize()
                        "SH".toCharArray()[0] -> name = "sh".capitalize()
                        "Sh''".toCharArray()[0] -> name = "sh'".capitalize()
                        "SH''".toCharArray()[0] -> name = "sh'".capitalize()
                        "Yu".toCharArray()[0] -> name = "yu".capitalize()
                        "YU".toCharArray()[0] -> name = "yu".capitalize()
                        "Ya".toCharArray()[0] -> name = "ya".capitalize()
                        "YA".toCharArray()[0] -> name = "ya".capitalize()
                        '1' -> name = "1"
                        '2' -> name = "2"
                        '3' -> name = "3"
                        '!' -> name = "!"
                        ',' -> name = ","
                        '^' -> name = "^"
                        '-' -> name = "-"
                        '=' -> name = "="
                        '+' -> name = "+"
                        '>' -> name = ">"
                        '<' -> name = "<"
                        ' ' -> name = divider

                    }
                    nn += name


                }

        return nn
        }



    fun toInitials(firstName: String?, lastName: String?): String? {

        var firstName = firstName?.trim(' ')
        var lastName = lastName?.trim(' ')

        if (firstName?.length != 0 && lastName?.length != 0) {

                val firstLetter = firstName?.get(0)?.toUpperCase()
                val secondLetter = lastName?.get(0)?.toUpperCase()
                if (!firstName.isNullOrBlank() && !lastName.isNullOrBlank()) return "$firstLetter$secondLetter"
                else if (firstName.isNullOrBlank() && lastName.isNullOrBlank()) return null
                else if (firstName.isNullOrBlank()) return "$secondLetter"
                else if (lastName.isNullOrBlank()) return "$firstLetter"
                else return null

        }
        if (firstName.isEmptyOrBlank() || lastName.isEmptyOrBlank()){
            if(!firstName.isEmptyOrBlank() && !firstName.equals(null)){
                val firstLetter = firstName?.get(0)?.toUpperCase()
                return "$firstLetter"
            }
            else if (!lastName.isEmptyOrBlank() && !lastName.equals(null)){
                val secondLetter = lastName?.get(0)?.toUpperCase()
                return "$secondLetter"
            }
            else return null

        }
        return null
    }
}

