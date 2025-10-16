package com.br.android_material_dio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.br.android_material_dio.databinding.ActivityTopAppBarBinding
import com.br.android_material_dio.extensions.toast

class TopAppBarActivity: AppCompatActivity( ) {
    private val binding by lazy { ActivityTopAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.topAppBar.setNavigationOnClickListener {
            toast("Clicou no menu")
        }

        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.favorite -> {
                    toast("favorite")
                    true
                }
                R.id.about -> {
                    toast("about")
                    true
                }
                R.id.settings -> {
                    toast("settings")
                    true
                }
                else -> false
            }
        }
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, TopAppBarActivity::class.java)
    }
}


