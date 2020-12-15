package com.saito.takumi.sealedclasssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musicList: MutableList<Music> = mutableListOf(
                Music.Default(1, "Default title", "Default artist"),
                Music.Ringtone(2, "Ringtone title", "Ringtone artist"),
                Music.Alarm(3, "Alarm title", "Alarm artist")
        )
        musicList.forEach {
            Log.d("saito", "replace befpre class ${it::class.java.simpleName} music id ${it.id}")
        }

        findViewById<Button>(R.id.button_replace).setOnClickListener {
            val item = Music.Ringtone(99, "Ringtone replace title", "Ringtone replace artist")
            musicList.replace(item) {
                it is Music.Ringtone
            }.forEach {
                Log.d("saito", "33 replace after class ${it::class.java.simpleName} music id ${it.id}")
            }

            musicList.forEach {
                Log.d("saito", "replace after class ${it::class.java.simpleName} music id ${it.id}")
            }
        }
    }
}
