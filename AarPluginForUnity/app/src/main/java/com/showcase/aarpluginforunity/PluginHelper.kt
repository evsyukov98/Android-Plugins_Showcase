package com.showcase.aarpluginforunity

import android.content.Context
import android.content.Intent

object PluginHelper {                                               // синглтон
    fun openActivity(context: Context) {

        var needActivity = PluginActivity::class.java;              // берем ссылку на активити которую хотим запустить
        val intent = Intent(context, needActivity)                  // обертка для открытия активити
        context.startActivity(intent)                               // запуск
    }
}
