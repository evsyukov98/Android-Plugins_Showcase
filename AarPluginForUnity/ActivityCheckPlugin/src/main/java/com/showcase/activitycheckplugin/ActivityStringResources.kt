package com.showcase.activitycheckplugin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class ActivityStringResources : Activity() {                 // Класс активити
    override fun onCreate(savedInstanceState: Bundle?) {     // Стартовый класс активити

        super.onCreate(savedInstanceState)                   // альтернатива base.

        val textView = TextView(this)                 // Создаем экземпляр TextView
        textView.setText(R.string.message)       // Устанавливаем текст из R - Resources, string - strings.xml

        setContentView(textView)                             // Отображаем TextView в активити
    }
}