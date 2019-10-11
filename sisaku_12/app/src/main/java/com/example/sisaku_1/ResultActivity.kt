package com.example.sisaku_1

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

        btn.setOnClickListener {
            //ボタンがクリックされたらAPIを叩く。
        }
    }
    //後からここにinner classを作ります。
}