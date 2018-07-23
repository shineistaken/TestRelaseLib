package com.example.com.testrelaselib

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    companion object {
        fun enterFooLib(ctx: Context) {
            ctx.startActivity(Intent(ctx, MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setText("from foo lib")
    }
}
