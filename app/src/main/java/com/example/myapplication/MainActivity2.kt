package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




        btnGetResult.setOnClickListener {

            val weight = edtWeight.text.toString()
            val height = edtHeight.text.toString()
            var result: Int? = 0

            if (weight != "" || height != "") {
                Log.e("hzm", "${weight}")
                Log.e("hzm", "${height}")

                if (rdMale.isChecked) {
                    result = height.toInt() - 100   //

                    if (result == weight.toInt()) {
                        txtResult.text = "normal"
                    } else if (result.toInt() > weight.toInt()) {
                        txtResult.text = "Overweight"
                    } else {
                        txtResult.text = "underweight"
                    }

                } else if ((rdFemale.isChecked)) {

                    result = height.toInt() - 110

                    if (result == weight.toInt()) {
                        txtResult.text = "normal"
                    } else if (result.toInt() > weight.toInt()) {
                        txtResult.text = "Overweight"
                    } else {
                        txtResult.text = "underweight"

                    }
                } else {
                    txtResult.text = "ادخل الجنس"
                }

            } else {
                txtResult.text = "ادخل جميع القيم"


            }
        }
    }
}