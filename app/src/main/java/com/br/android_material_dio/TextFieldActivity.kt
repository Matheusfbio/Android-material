package com.br.android_material_dio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.br.android_material_dio.databinding.ActivityTextFieldsBinding

class TextFieldActivity: AppCompatActivity() {
    private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.inputError.error = "Campo obrigatorio"
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, TextFieldActivity::class.java)
    }
}
