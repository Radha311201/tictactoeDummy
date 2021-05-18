package com.example.mybirthdayapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result_page.*

class resultPage : AppCompatActivity() {
    companion object{
        const val RESULT = "Result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)
        val res = intent.getStringExtra(RESULT)
        if(res.equals("Draw")){
            matchResult.text="Game is draw"
        }
        else{
            matchResult.text="Match has won by $res"
        }
    }

    fun tostart(view: View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}