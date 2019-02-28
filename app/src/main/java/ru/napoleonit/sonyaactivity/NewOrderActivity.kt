package ru.napoleonit.sonyaactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_new_order.*

class NewOrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_order)

        supportActionBar?.title = "Оформление заказа"

        val categories = listOf("КТ", "МРТ", "Рентген")
        categoryView.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)

        val bodyParts = listOf("Голова", "Живот", "Рука")
        bodyView.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, bodyParts)
    }
}
