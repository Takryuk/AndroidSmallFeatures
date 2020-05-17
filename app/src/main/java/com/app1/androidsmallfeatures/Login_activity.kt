package com.app1.androidsmallfeatures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Login_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@Login_activity, MainActivity::class.java))
        Animatoo.animateZoom(this@Login_activity)


    }
}
