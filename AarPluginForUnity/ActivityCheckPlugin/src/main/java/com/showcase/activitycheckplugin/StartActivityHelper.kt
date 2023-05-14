package com.showcase.activitycheckplugin

import android.content.Context
import android.content.Intent

object StartActivityHelper {                                                // синглтон
    fun openActivity(context: Context) {

        var needActivity = ActivityStringResources::class.java;             // берем ссылку на активити которую хотим запустить
        val intent = Intent(context, needActivity)                          // обертка для открытия активити
        context.startActivity(intent)                                       // запуск
    }
}