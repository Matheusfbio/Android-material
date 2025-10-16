package com.br.android_material_dio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.br.android_material_dio.databinding.ActivityBottonNavigationBinding

class BottomNavigationActivity: AppCompatActivity() {
    private val binding by lazy { ActivityBottonNavigationBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
    companion object {
        fun createIntent(context: Context): Intent = Intent(context, BottomNavigationActivity::class.java)
    }
}


