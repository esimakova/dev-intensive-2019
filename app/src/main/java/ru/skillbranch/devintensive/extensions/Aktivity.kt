package ru.skillbranch.devintensive.extensions

import android.app.Activity
import android.content.Context
import android.graphics.Rect
import android.view.inputmethod.InputMethodManager




fun Activity.hideKeyboard(){
    val inputManager: InputMethodManager =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputManager.hideSoftInputFromWindow(currentFocus?.windowToken, InputMethodManager.SHOW_FORCED)
}

fun Activity.isKeyboardOpen() : Boolean{
    val r = Rect()
    val rootview = this.getWindow().getDecorView() // this = activity
    rootview.getWindowVisibleDisplayFrame(r)
    val keyboardHeight = rootview.getHeight() - r.bottom
    return keyboardHeight >= 0
}

fun Activity.isKeyboardClosed() : Boolean{
    val r = Rect()
    val rootview = this.getWindow().getDecorView() // this = activity
    rootview.getWindowVisibleDisplayFrame(r)
    val keyboardHeight = rootview.getHeight() - r.top
    return keyboardHeight >= 0
}