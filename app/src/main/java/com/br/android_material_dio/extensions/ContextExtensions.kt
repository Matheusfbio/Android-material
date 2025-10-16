package com.br.android_material_dio.extensions

import android.content.Context
import android.os.Message
import android.widget.Toast

fun Context.toast(message: String, duration: Int  = Toast.LENGTH_SHORT)  {
    Toast.makeText(this, message, duration).show()
}