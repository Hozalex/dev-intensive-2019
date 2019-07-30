package ru.skillbranch.devintensive

import android.app.Application
import android.content.Context

/**
 * Created by A.Khozyainov on 28.07.19
 */

class App : Application() {

    companion object {
        private var instance: App? = null
        fun applicationContext(): Context {
            return instance!!.applicationContext
        }

    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()

    }

}