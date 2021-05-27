package com.example.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList

fun getRandomLottoNumber(): Int{
    return Random().nextInt(45)+1
}

fun getRandomLottoNumbers(): MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()

    while (true) {
        val number = getRandomLottoNumber()
        var flag_exist = 0;

        if (lottoNumbers.size < 1) {
            lottoNumbers.add(number)
            continue
        } else {
            for (j in 0 until lottoNumbers.size) {
                if (number == lottoNumbers[j]) {
                    flag_exist = 1
                    break
                }
            }
            if (flag_exist == 0)
                lottoNumbers.add(number)
            if (lottoNumbers.size >= 6)
                break
        }
    }
        return lottoNumbers
    }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cardConstell = findViewById<CardView>(R.id.cardConstell)
        val cardName = findViewById<CardView>(R.id.CardViewName)
        val cardRandom = findViewById<CardView>(R.id.cardRandom)

        cardConstell.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))

        }
        cardRandom.setOnClickListener{
            startActivity(Intent(this@MainActivity, ResultActivity::class.java))
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            //getShuffledLottoNumbers()
            startActivity(intent)
        }
        cardName.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))

        }
        val numbers = { listOf(1,2,3,4)}
        /*println(numbers)
        numbers.forEach{numbers -> println(numbers)}
        numbers.forEach{numbers -> println(number)}
        numbers.forEach{println(it)}
        val mutableNumbers = mutableListOf<Int>(5,6,7,8)*/
    }

    


}