package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str = 0

        n9.setOnClickListener {
//            var str = n9.text.toString()!!.toInt()
//            if (str == 0){
            if (num.text.toString() == "0"){
                num.setText("9")
            }else {
                var str9 = num.text.toString().plus( 9)
                num.setText(str9)
            }
        }

        n8.setOnClickListener {
//            var str8 = n8.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("8")
            } else {
                var str8 = num.text.toString().plus(8)
                num.setText(str8)
            }
        }

        n7.setOnClickListener {
//            var str7 = n7.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("7")
            } else {
                var str7 = num.text.toString().plus(7)
                num.setText(str7)
            }
        }

        n6.setOnClickListener {
//            var str6 = n6.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("6")
            } else {
                var str6 = num.text.toString().plus(6)
                num.setText(str6)
            }
        }

        n5.setOnClickListener {
//            var str5 = n5.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("5")
            } else {
                var str5 = num.text.toString().plus(5)
                num.setText(str5)
            }
        }

        n4.setOnClickListener {
//            var str4 = n4.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("4")
            } else {
                var str4 = num.text.toString().plus(4)
                num.setText(str4)
            }
        }

        n3.setOnClickListener {
//            var str3 = n3.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("3")
            } else {
                var str3 = num.text.toString().plus(3)
                num.setText(str3)
            }
        }

        n2.setOnClickListener {
//            var str2 = n2.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("2")
            } else {
                var str2 = num.text.toString().plus(2)
                num.setText(str2)
            }
        }

        n1.setOnClickListener {
//            var str1 = n1.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("1")
            } else {
                var str1 = num.text.toString().plus(1)
                num.setText(str1)
            }
        }

        n0.setOnClickListener {
//            var str0 = n0.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText("0")
            } else {
                var str0 = num.text.toString().plus(0)
                num.setText(str0)
            }
        }

        dot.setOnClickListener {
//            var str0 = n0.text.toString()!!.toInt()
            if (num.text.toString() == "0"){
                num.setText(".")
            } else {
                var dot = num.text.toString().plus(".")
                num.setText(dot)
            }
        }

        clear.setOnClickListener {
            num.setText("")
        }

        delete.setOnClickListener {
            if (num.text.toString().length >= 0 && num.text.toString().length != 0){
                num.setText("0")
            } else {
                var del = num.text.toString().dropLast(1)
            }
        }

    }
}