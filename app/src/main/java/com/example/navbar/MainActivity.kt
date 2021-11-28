package com.example.navbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnsubmit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController= findNavController(R.id.container_fragment)
        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        bottomNavigationView.setupWithNavController(navController)


    }

    private fun init() {
        btnsubmit = findViewById(R.id.btnsubmit)
        btnsubmit.setOnClickListener(this)


        btnsubmit.setOnClickListener() {
            submit()
        }


    }

    private fun submit() {
        Toast.makeText(this, "პრომო კოდი გააქტიურებულია", Toast.LENGTH_SHORT).show()
    }



    override fun onClick(v: View?) {

    }

}