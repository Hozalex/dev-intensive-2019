package ru.skillbranch.devintensive.extensions

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager

/**
 * Created by A.Khozyainov on 17.07.19
 */
fun Activity.hideKeyboard(context: Context) {
    var im: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    im.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS)
}