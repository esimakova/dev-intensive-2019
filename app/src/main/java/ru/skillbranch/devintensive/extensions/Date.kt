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
            else if (number.toString().endsWith2to4()) return "$number секунды"
            else return "$number секунд"
            MINUTE -> if (number == 1) return "$number минуту"
            else if (number.toString().endsWith2to4()) return "$number минуты"
            else return "$number минут"
            HOUR -> if (number == 1) return "$number час"
            else if (number.toString().endsWith2to4()) return "$number часа"
            else return "$number часов"
            DAY -> if (number == 1) return "$number день"
        else if (number.toString().endsWith2to4()) return "$number дня"
        else return "$number дней"
        }
        }
    }

fun Date.humanizeDiff(date: Date = Date()): String {

    val difference : Long = this.time - date.time
    val seconds : Long = difference/1000
    var minutes : Long = difference/60000
    var hours : Long = difference/3600000
    var days : Long = difference/86400000
    if(seconds >= -1 && seconds < 1){
        return "только что"
    }
    //future
    if (seconds in -45..0){
        return "несколько секунд назад"
    }
    if (seconds in -74..-44){
        return "минуту назад"
    }
    if (minutes >= -45 && seconds <= -75){
        minutes *= (-1)
        if(minutes == 1L){
            return "$minutes минуту назад"
        }
        else if(minutes.toString().endsWith2to4()){
            return "$minutes минуты назад"
        }
        else return "$minutes минут назад"
    }
    if (minutes in -74..-44){
        return "час назад"
    }
    if (hours > -22 && minutes <= -75){
        hours *= (-1)
        if (hours == 1L){
            return "$hours час назад"
        }
        else if (hours.toString().endsWith2to4()){
            return "$hours часа назад"
        }
        else return "$hours часов назад"
    }
    if (hours in -26..-22){
        return "день назад"
    }
    if (days >= -360 && hours < -26){
        days *= (-1)
        if (days == 1L){
            return "$days день назад"
        }
        else if (days.toString().endsWith2to4()){
            return "$days дня назад"
        }
        else return "$days дней назад"
    }
    //past
    if (seconds in 1..44){
        return "через несколько секунд"
    }
    if (seconds in 45..74){
        return "через минуту"
    }
    if (seconds >= 75 && minutes < 45){
        if(minutes == 1L){
            return "через $minutes минуту"
        }
        else if (minutes.toString().endsWith2to4()) {
            return "через $minutes минуты"
        }
        else return "через $minutes минут"
    }
    if (minutes in 45..74){
        return "через час"
    }
    if (minutes >= 75 && hours < 22){
        if (hours.toString().endsWith2to4()){
            return "через $hours часа"
        }
        else return "через $hours часов"
    }
    if (hours in 22..25){
        return "через день"
    }
    if (hours >= 26 && days < 360){
        if(days.toString().endsWith2to4()){
            return "через $days дня"
        }
        else return "через $days дней"
    }
    if (days >= 360){
        return "более чем через год"
    }
    else
        return "более года назад"


}
