package com.example.mybirthdayapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class gamePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        val gridButton1 = findViewById(R.id.gridButton_1) as Button
        val gridButton2 = findViewById(R.id.gridButton_2) as Button
        val gridButton3 = findViewById(R.id.gridButton_3) as Button
//        val gridButton_4 = findViewById(R.id.gridButton_4) as Button
//        val gridButton_5 = findViewById(R.id.gridButton_5) as Button
//        val gridButton_6 = findViewById(R.id.gridButton_6) as Button
//        val gridButton_7 = findViewById(R.id.gridButton_7) as Button
//        val gridButton_8 = findViewById(R.id.gridButton_8) as Button
//        val gridButton_9 = findViewById(R.id.gridButton_9) as Button
        var countOfXO = 0
        gridButton1.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton1.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton1.setBackgroundResource(R.drawable.cross)
                }
                else{
                    gridButton1.setBackgroundResource(R.drawable.zero)
                }
                countOfXO++
            }
        }
        gridButton2.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton2.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton2.setBackgroundResource(R.drawable.cross)
                }
                else{
                    gridButton2.setBackgroundResource(R.drawable.zero)
                }
                countOfXO++
            }
        }
        gridButton3.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton3.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton3.setBackgroundResource(R.drawable.cross)
                }
                else{
                    gridButton3.setBackgroundResource(R.drawable.zero)
                }
                countOfXO++
            }
        }
//        gridButton_1.setOnClickListener {
//
//            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
//            if(gridButton_1.isPressed){
//                gridButton_1.setBackgroundResource(R.drawable.cupbg)
//            }
//        }
//        gridButton_1.setOnClickListener {
//
//            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
//            if(gridButton_1.isPressed){
//                gridButton_1.setBackgroundResource(R.drawable.cupbg)
//            }
//        }
//        gridButton_1.setOnClickListener {
//
//            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
//            if(gridButton_1.isPressed){
//                gridButton_1.setBackgroundResource(R.drawable.cupbg)
//            }
//        }
//        gridButton_1.setOnClickListener {
//
//            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
//            if(gridButton_1.isPressed){
//                gridButton_1.setBackgroundResource(R.drawable.cupbg)
//            }
//        }
//        gridButton_1.setOnClickListener {
//
//            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
//            if(gridButton_1.isPressed){
//                gridButton_1.setBackgroundResource(R.drawable.cupbg)
//            }
//        }
//        gridButton_1.setOnClickListener {
//
//            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
//            if(gridButton_1.isPressed){
//                gridButton_1.setBackgroundResource(R.drawable.cupbg)
//            }
//        }
    }
}