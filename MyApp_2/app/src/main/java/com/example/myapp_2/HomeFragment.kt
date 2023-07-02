package com.example.myapp_2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {

    lateinit var opt_button : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Получаем ссылку на кнопку из макета
        val myButton = view.findViewById<Button>(R.id.opt_button)

        // Устанавливаем слушатель нажатия на кнопку
        myButton.setOnClickListener {
            val snackbar = Snackbar.make(it,"Вызван из страницы \"Home\"", Snackbar.LENGTH_LONG).show()
            val newFragment = OptionalFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.container1, newFragment)
                .commit()
        }
        return view
    }

}