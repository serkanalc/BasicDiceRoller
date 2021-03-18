package com.serkanalc.zaruygulamas

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sallaButton:Button=findViewById(R.id.sallaButton)
        val temizleButton:Button=findViewById(R.id.temizleButton)

        sallaButton.setOnClickListener{

            val rastgele1= (1..6).random()
            val rastgele2= (1..6).random()

            when(rastgele1){

                1-> zarImage.setImageResource(R.drawable.dice_1)
                2-> zarImage.setImageResource(R.drawable.dice_2)
                3-> zarImage.setImageResource(R.drawable.dice_3)
                4-> zarImage.setImageResource(R.drawable.dice_4)
                5-> zarImage.setImageResource(R.drawable.dice_5)
                else-> zarImage.setImageResource(R.drawable.dice_6)

            }
            when(rastgele2){

                1-> zarImage2.setImageResource(R.drawable.dice_1)
                2-> zarImage2.setImageResource(R.drawable.dice_2)
                3-> zarImage2.setImageResource(R.drawable.dice_3)
                4-> zarImage2.setImageResource(R.drawable.dice_4)
                5-> zarImage2.setImageResource(R.drawable.dice_5)
                else-> zarImage2.setImageResource(R.drawable.dice_6)

            }
        }
        temizleButton.setOnClickListener{

            zarImage.setImageResource(R.drawable.dice_0)
            zarImage2.setImageResource(R.drawable.dice_0)
        }
    }
}