package com.app1.androidsmallfeatures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sign

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener{
            startActivity(Intent(this@MainActivity, Login_activity::class.java))
            Animatoo.animateZoom(this@MainActivity)

        }
        signup.setOnClickListener{
            startActivity(Intent(this@MainActivity, Login_activity::class.java))
            Animatoo.animateZoom(this@MainActivity)

        }

    }
}
