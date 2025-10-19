package com.br.android_material_dio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.br.android_material_dio.databinding.ActivitySnackBarBinding
import com.google.android.material.snackbar.Snackbar

class SnackBarActivity: AppCompatActivity() {
    private val binding by lazy { ActivitySnackBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.showing.setOnClickListener {
            Snackbar.make(binding.root, "Show button clicked", Snackbar.LENGTH_SHORT).show()
        }

        binding.action.setOnClickListener {
            Snackbar.make(it, "Action button clicked", Snackbar.LENGTH_SHORT)
                .setAction("Undo") {
                    Log.e("TAG", "Undo button clicked")
//                    Snackbar.make(binding.root, "Undone", Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }

    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, SnackBarActivity::class.java)
    }

}
