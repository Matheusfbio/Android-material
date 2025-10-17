package com.br.android_material_dio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.br.android_material_dio.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(binding.root)

        insertListeners()

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }

    private fun insertListeners() {
        binding.cvButtons.setOnClickListener {
            startActivity(ButtonsActivity.createIntent(this))
        }
        binding.cvBottomSheets.setOnClickListener {
            ModalBottonSheet.start(supportFragmentManager)
        }
        binding.cvTextFields.setOnClickListener {
            startActivity(TextFieldActivity.createIntent(this))
        }
        binding.cvTopAppBar.setOnClickListener {
            startActivity(TopAppBarActivity.createIntent(this))
        }
        binding.cvBottomNavigation.setOnClickListener {
            startActivity(BottomNavigationActivity.createIntent(this))
        }
    }
}