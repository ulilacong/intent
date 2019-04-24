package acong.example.tugasuts

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_implisit_intent.*
import kotlinx.android.synthetic.main.activity_main.*

class ImplisitIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implisit_intent)
        val nama=intent.getStringExtra("Username")
        val password=intent.getIntExtra("password",0)
        tv_data_received.setText("User Name ="+ nama + ",\nPassword ="+password)
    }
}

