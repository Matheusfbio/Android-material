package com.br.android_material_dio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment // Corrected import
import com.br.android_material_dio.databinding.ActivityBottonNavigationBinding
import com.br.android_material_dio.fragments.HomeFragment
import com.br.android_material_dio.fragments.StarsFragment

class BottomNavigationActivity: AppCompatActivity() {
    private val binding by lazy { ActivityBottonNavigationBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Set the default fragment
        if (savedInstanceState == null) {
            openFragment(HomeFragment.newInstance())
            binding.bottomNavigation.selectedItemId = R.id.home
        }

        binding.bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    openFragment(HomeFragment.newInstance())
                    true
                }
                R.id.stars -> {
                    openFragment(StarsFragment.newInstance())
                    true
                }
                else -> false
            }
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, BottomNavigationActivity::class.java)
    }
}
