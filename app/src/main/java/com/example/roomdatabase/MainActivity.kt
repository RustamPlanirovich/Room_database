package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.roomdatabase.MyApp.Companion.datavase


var button: Button? = null
var texts: TextView? = null
var textSumm: TextView? = null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        texts = findViewById(R.id.textt)
        textSumm = findViewById(R.id.textView)

        button?.setOnClickListener {

            datavase?.getCatDAO()?.add(Cat(0, "Hello", 7, "World"))
            datavase?.getCatDAO()?.add(Cat(0, "Васька", 5, "Мейнкун"))

            val cats: List<Cat> = datavase?.getCatDAO()?.getAllCat()!!

            texts?.text = cats[1].name

            datavase?.getSummDAO()?.add(Summ(0,"Кофе", 1000))

            val sums: List<Summ> = datavase?.getSummDAO()?.getAllSumm()!!

            textSumm?.text = sums[0].categoty
        }

        /*button?.setOnClickListener {
            MyApp.datavase
                ?.getCatDAO()
                ?.getAllCatsRx()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe {
                        listOfCat -> texts?.text = listOfCat.get(2).name
                }
        }*/
    }
}