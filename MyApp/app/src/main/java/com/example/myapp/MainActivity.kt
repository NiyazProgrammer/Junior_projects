package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name_text: EditText = findViewById(R.id.name_text)
        val age_text: EditText = findViewById(R.id.age_text)
        val height_text: EditText = findViewById(R.id.height_text)
        val weight_text: EditText = findViewById(R.id.weight_text)
        val main_buttom: Button = findViewById(R.id.main_button)
        val result_text : TextView = findViewById(R.id.result_text)

        main_buttom.setOnClickListener {
            val age = age_text.text.toString()
            val name = name_text.text.toString()
            val height = height_text.text.toString()
            val weight = weight_text.text.toString()
            if (name.length == 0 || age.length == 0
                || height.length == 0 || weight.length == 0)
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            else if(age.toInt() > 150 || age.toInt() <= 0)
                Toast.makeText(this, "Значение в поле \"Возраст\" должно состовлять от 0 до 150 ", Toast.LENGTH_LONG).show()
            else if((height.toInt()  <= 0 || height.toInt() > 250) || (weight.toDouble() <= 0 || weight.toDouble() > 250 ))
                Toast.makeText(this, "Поля \"Рост\" и \"Вес\" должны быть от 0 до 250" , Toast.LENGTH_LONG).show()
            else
                result_text.text = "Норма: " + (88.362 + (13.397 * weight.toDouble()) + (4.799 * height.toInt()) - (5.677 * age.toInt())).toInt().toString() + "каллорий"

        }



    }
}