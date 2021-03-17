package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.button)
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)
        rollButton.setOnClickListener {

            rollDice()
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

        }
        val cleanerButton:Button=findViewById(R.id.cleanerButton)
        cleanerButton.setOnClickListener {

            diceImage.setImageResource(R.drawable.dice_8)
            diceImage2.setImageResource(R.drawable.dice_7)

            val toast = Toast.makeText(this, "Game Over!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun rollDice() {
        val dice = Dice1(6)
        val dice2 = Dice2(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice2.roll()

        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)


        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        when (diceRoll2) {
            1 -> diceImage2.setImageResource(R.drawable.dice_1)
            2 -> diceImage2.setImageResource(R.drawable.dice_2)
            3 -> diceImage2.setImageResource(R.drawable.dice_3)
            4 -> diceImage2.setImageResource(R.drawable.dice_4)
            5 -> diceImage2.setImageResource(R.drawable.dice_5)
            6 -> diceImage2.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice1(val numSide:Int){

    fun roll():Int{
        return(1..numSide).random()
    }
}
class Dice2(val numSide:Int){

    fun roll():Int{
        return(1..numSide).random()
    }
}