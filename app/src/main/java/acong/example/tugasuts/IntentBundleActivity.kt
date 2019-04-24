package acong.example.tugasuts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val NAMA=intent.getStringExtra("NAMA")
        val NPM=intent.getStringExtra("NPM")
        val KELAS=intent.getStringExtra("KELAS")
        val FOTO=intent.getStringExtra("FOTO")
        val EMAIL=intent.getStringExtra("EMAIL")

        tvNamaku.text = NAMA
        tvNpm.text = NPM
        tvKelas.text = KELAS
        tvEmail.text = EMAIL

    }
}
