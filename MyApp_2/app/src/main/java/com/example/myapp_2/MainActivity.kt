package com.example.myapp_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    lateinit var bottom_nav : BottomNavigationView
    val homeFragment: HomeFragment = HomeFragment()
    val servicesFragment: ServicesFragment = ServicesFragment()
    val messageFragment: MessageFragment = MessageFragment()
    val addPhotofragment: Add_PhotoFragment = Add_PhotoFragment()
    val settingFragment: SettingFragment = SettingFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav = findViewById(R.id.button_navigation)


        supportFragmentManager.beginTransaction().replace(R.id.container,homeFragment).addToBackStack(null).commit()

        bottom_nav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId)
            {
                R.id.home ->{
                    supportFragmentManager.beginTransaction().replace(R.id.container,homeFragment).addToBackStack(null).commit()
                    true
                }
                R.id.services ->{
                    supportFragmentManager.beginTransaction().replace(R.id.container,servicesFragment).addToBackStack(null).commit()
                    true
                }
                R.id.message ->{
                    supportFragmentManager.beginTransaction().replace(R.id.container,messageFragment).addToBackStack(null).commit()
                    true
                }
                R.id.add_photo ->{
                    supportFragmentManager.beginTransaction().replace(R.id.container,addPhotofragment).addToBackStack(null).commit()
                    true
                }
                R.id.setting ->{
                    supportFragmentManager.beginTransaction().replace(R.id.container,settingFragment).addToBackStack(null).commit()
                    true
                }
                else -> false
            }

        }



    }
}