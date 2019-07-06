package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.format(pattern: String="HH:mm:ss dd.MM.yy") : String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND) : Date{
    var time = this.time

    time += when(units){
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }

    this.time = time
    return this
}

enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY;

    fun plural(number : Int) : String {
        when(this){
            SECOND -> if (number == 1) return "$number секунду"
            else if (number.toString().contains2to4()) return "$number секунды"
            else return "$number секунд"
            MINUTE -> if (number == 1) return "$number минуту"
            else if (number.toString().contains2to4()) return "$number минуты"
            else return "$number минут"
            HOUR -> if (number == 1) return "$number час"
            else if (number.toString().contains2to4()) return "$number часа"
            else return "$number часов"
            DAY -> if (number == 1) return "$number день"
        else if (number.toString().contains2to4()) return "$number дня"
        else return "$number дней"
        }
        }
    }

public fun Date.humanizeDiff(date: Date = Date()): String {

    //TODO
    return ""

}
