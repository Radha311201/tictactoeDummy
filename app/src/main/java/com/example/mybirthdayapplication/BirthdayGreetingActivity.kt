package com.example.mybirthdayapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
       const val  NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday $name"
        val state_button = findViewById(R.id.state_button) as Button

        state_button.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(state_button.isPressed){
                state_button.setBackgroundResource(R.drawable.cupbg)
            }
        }
        val intent = Intent(this,gamePage::class.java)
        startActivity(intent)
    }


}