package com.example.mybirthdayapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun createBirthdayCard(view: View) {
////       Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
//          val name = inputName.editableText.toString()
//          val intent = Intent(this,BirthdayGreetingActivity::class.java)
//          intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
//          startActivity(intent)
//    }

    fun goToToss(view: View) {
        val intent = Intent(this,tossPage::class.java)
        startActivity(intent)
    }
}