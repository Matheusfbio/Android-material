package com.br.android_material_dio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TopAppBarActivity: AppCompatActivity( ) {
    private val binding by lazy { ActivityTopAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}


