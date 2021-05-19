package com.example.mybirthdayapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {
    companion object{
        const val MODEOFPLAY =0
        const val TOSSWINNER =0
        const val Player1Sym ='X'
        const val Player2Sym ='O'
        const val TOSS_WINNER = ""
        const val TOSS_LOOSER = ""
    }
    var countOfXO = 0
    var toss_win = ""
    var toss_los = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        val tossWinner = intent.getStringExtra(TOSS_WINNER)
       // val tossLooser = intent.getStringExtra(TOSS_LOOSER)
        if (tossWinner != null) {
            toss_win = tossWinner
        }


        player_name.text = "$tossWinner make first move"


        val gridButton1 = findViewById(R.id.gridButton_1) as ImageButton
        val gridButton2 = findViewById(R.id.gridButton_2) as ImageButton
        val gridButton3 = findViewById(R.id.gridButton_3) as ImageButton
        val gridButton4 = findViewById(R.id.gridButton_4) as ImageButton
        val gridButton5 = findViewById(R.id.gridButton_5) as ImageButton
        val gridButton6 = findViewById(R.id.gridButton_6) as ImageButton
        val gridButton7 = findViewById(R.id.gridButton_7) as ImageButton
        val gridButton8 = findViewById(R.id.gridButton_8) as ImageButton
        val gridButton9 = findViewById(R.id.gridButton_9) as ImageButton

        gridButton1.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton1.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton1.setImageResource(R.drawable.crossy)
                    matrix[0][0] = Player1Sym
                }
                else{
                    gridButton1.setImageResource(R.drawable.zeroy)
                    matrix[0][0] = Player2Sym
                }
                gridButton1.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton2.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton2.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton2.setImageResource(R.drawable.crossy)
                    matrix[1][0] = Player1Sym
                }
                else{
                    gridButton2.setImageResource(R.drawable.zeroy)
                    matrix[1][0] = Player2Sym
                }
                gridButton2.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton3.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton3.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton3.setImageResource(R.drawable.crossy)
                    matrix[2][0] = Player1Sym
                }
                else{
                    gridButton3.setImageResource(R.drawable.zeroy)
                    matrix[2][0] = Player2Sym
                }
                gridButton3.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton4.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton4.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton4.setImageResource(R.drawable.crossy)
                    matrix[0][1] = Player1Sym
                }
                else{
                    gridButton4.setImageResource(R.drawable.zeroy)
                    matrix[0][1] = Player2Sym
                }
                gridButton4.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton5.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton5.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton5.setImageResource(R.drawable.crossy)
                    matrix[1][1] = Player1Sym
                }
                else{
                    gridButton5.setImageResource(R.drawable.zeroy)
                    matrix[1][1] = Player2Sym
                }
                gridButton5.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton6.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton6.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton6.setImageResource(R.drawable.crossy)
                    matrix[2][1] = Player1Sym
                }
                else{
                    gridButton6.setImageResource(R.drawable.zeroy)
                    matrix[2][1] = Player2Sym
                }
                gridButton6.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton7.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton7.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton7.setImageResource(R.drawable.crossy)
                    matrix[0][2] = Player1Sym
                }
                else{
                    gridButton7.setImageResource(R.drawable.zeroy)
                    matrix[0][2] = Player2Sym
                }
                gridButton7.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton8.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton8.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton8.setImageResource(R.drawable.crossy)
                    matrix[1][2] = Player1Sym
                }
                else{
                    gridButton8.setImageResource(R.drawable.zeroy)
                    matrix[1][2] = Player2Sym
                }
                gridButton8.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
        gridButton9.setOnClickListener {

            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            if(gridButton9.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton9.setImageResource(R.drawable.crossy)

                    matrix[2][2] = Player1Sym
                }
                else{
                    gridButton9.setImageResource(R.drawable.zeroy)
                    matrix[2][2] = Player2Sym
                }
                gridButton9.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
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
            text+=" \n $count"
        }
        val toast = Toast.makeText(applicationContext,text, Toast.LENGTH_LONG)
        toast.show()
    }

    fun checking():Boolean{
        return(rowChecked()||colchecked()||daigonalchecked())
    }
    fun sendResult(){
        val intent = Intent(this,resultPage::class.java)
        //val tossLooser = intent.getStringExtra(TOSS_LOOSER)
//        val tossLooser  = intent.getStringExtra(TOSS_LOOSER)
//        val tossW = intent.getStringExtra(TOSS_WINNER)
        var temp = ""
        var flag = 0
        if(toss_win == "Player 1"){
            temp = "Player 2"
        }
        else{
            temp = "Player 1"
        }

        if(countOfXO%2==0){
            flag = 1
            intent.putExtra(resultPage.RESULT, temp)
        }
        else if(countOfXO%2!=0){
            flag = 1
            intent.putExtra(resultPage.RESULT, toss_win)
        }
        else {
            intent.putExtra(resultPage.RESULT,"Draw")
        }
        startActivity(intent)
    }

    private fun daigonalchecked(): Boolean {
        if(matrix[0][0]==matrix[1][1]&&matrix[1][1]==matrix[2][2]&&matrix[0][0]!='_'){
            return true
        }
        else if(matrix[0][2]==matrix[1][1]&&matrix[1][1]==matrix[2][0]&&matrix[2][0]!='_'){
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