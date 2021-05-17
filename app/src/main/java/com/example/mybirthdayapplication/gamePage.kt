package com.example.mybirthdayapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class gamePage : AppCompatActivity() {
    companion object{
        const val MODEOFPLAY =0
        const val TOSSWINNER =0
        const val Player1Sym ='X'
        const val Player2Sym ='O'
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        val gridButton1 = findViewById(R.id.gridButton_1) as Button
        val gridButton2 = findViewById(R.id.gridButton_2) as Button
        val gridButton3 = findViewById(R.id.gridButton_3) as Button
        val gridButton4 = findViewById(R.id.gridButton_4) as Button
        val gridButton5 = findViewById(R.id.gridButton_5) as Button
        val gridButton6 = findViewById(R.id.gridButton_6) as Button
        val gridButton7 = findViewById(R.id.gridButton_7) as Button
        val gridButton8 = findViewById(R.id.gridButton_8) as Button
        val gridButton9 = findViewById(R.id.gridButton_9) as Button
        var countOfXO = 0
        gridButton1.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton1.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton1.setBackgroundResource(R.drawable.cross)
                    matrix[0][0] = Player1Sym
                }
                else{
                    gridButton1.setBackgroundResource(R.drawable.zero)
                    matrix[0][0] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton2.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton2.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton2.setBackgroundResource(R.drawable.cross)
                    matrix[1][0] = Player1Sym
                }
                else{
                    gridButton2.setBackgroundResource(R.drawable.zero)
                    matrix[1][0] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton3.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton3.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton3.setBackgroundResource(R.drawable.cross)
                    matrix[2][0] = Player1Sym
                }
                else{
                    gridButton3.setBackgroundResource(R.drawable.zero)
                    matrix[2][0] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton4.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton4.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton4.setBackgroundResource(R.drawable.cross)
                    matrix[0][1] = Player1Sym
                }
                else{
                    gridButton4.setBackgroundResource(R.drawable.zero)
                    matrix[0][1] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton5.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton5.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton5.setBackgroundResource(R.drawable.cross)
                    matrix[1][1] = Player1Sym
                }
                else{
                    gridButton5.setBackgroundResource(R.drawable.zero)
                    matrix[1][1] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton6.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton6.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton6.setBackgroundResource(R.drawable.cross)
                    matrix[2][1] = Player1Sym
                }
                else{
                    gridButton6.setBackgroundResource(R.drawable.zero)
                    matrix[2][1] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton7.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton7.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton7.setBackgroundResource(R.drawable.cross)
                    matrix[0][2] = Player1Sym
                }
                else{
                    gridButton7.setBackgroundResource(R.drawable.zero)
                    matrix[0][2] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton8.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton8.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton8.setBackgroundResource(R.drawable.cross)
                    matrix[1][2] = Player1Sym
                }
                else{
                    gridButton8.setBackgroundResource(R.drawable.zero)
                    matrix[1][2] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
        gridButton9.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton9.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton9.setBackgroundResource(R.drawable.cross)
                    matrix[2][2] = Player1Sym
                }
                else{
                    gridButton9.setBackgroundResource(R.drawable.zero)
                    matrix[2][2] = Player2Sym
                }
                countOfXO++
                check()
            }
        }
//
    }
    var count :Int =0;
    var matrix = arrayOf(
        arrayOf('_','_','_'),
        arrayOf('_','_','_'),
        arrayOf('_','_','_')
    )
    fun gameclick(view: View) {
        count++
        if(count%2==0){
            val toast = Toast.makeText(applicationContext,"Player 1 clicked", Toast.LENGTH_SHORT)
            toast.show()
        }
        else{
            val toast = Toast.makeText(applicationContext,"Player 2 clicked", Toast.LENGTH_SHORT)
            toast.show()
        }
        if(count==9){
            val toast = Toast.makeText(applicationContext,"Game Ended", Toast.LENGTH_SHORT)
            toast.show()

        }

    }
    fun check(){
        var text =""
        for (array in matrix) {
            for (value in array) {
                text+=value
            }
            text+=" "
        }
        val toast = Toast.makeText(applicationContext,text, Toast.LENGTH_LONG)
        toast.show()
    }

    fun checking():Boolean{
        return(rowChecked()||colchecked()||daigonalchecked())
    }

    private fun daigonalchecked(): Boolean {
        if(matrix[0][0]==matrix[1][1]&&matrix[1][1]==matrix[2][2]&&matrix[0][0]!='_'){
            return true
        }
        else if(matrix[0][2]==matrix[1][1]&&matrix[1][1]==matrix[2][0]&&matrix[1][0]!='_'){
            return true
        }

        return false
    }

    private fun colchecked(): Boolean {
        if(matrix[0][0]==matrix[1][0]&&matrix[1][0]==matrix[2][0]&&matrix[0][0]!='_'){
            return true
        }
        else if(matrix[0][1]==matrix[1][1]&&matrix[1][1]==matrix[2][1]&&matrix[0][1]!='_'){
            return true
        }
        else if(matrix[0][2]==matrix[1][2]&&matrix[1][2]==matrix[2][2]&&matrix[0][2]!='_'){
            return true
        }
        return false
    }

    private fun rowChecked(): Boolean {
        if(matrix[0][0]==matrix[0][1]&&matrix[0][1]==matrix[0][2]&&matrix[0][0]!='_'){
            return true
        }
        else if(matrix[1][0]==matrix[1][1]&&matrix[1][1]==matrix[1][2]&&matrix[1][0]!='_'){
            return true
        }
        else if(matrix[2][0]==matrix[2][1]&&matrix[2][1]==matrix[2][2]&&matrix[2][0]!='_'){
            return true
        }
        return false
    }
}