package com.br.android_material_dio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.br.android_material_dio.databinding.BottonSheetModalBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ModalBottonSheet : BottomSheetDialogFragment() {
    private val binding by lazy {
        BottonSheetModalBinding.inflate(LayoutInflater.from(requireContext()))
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        saved: Bundle?
    ): View {
        return binding.root
    }

    companion object {
        private const val TAG = "ModalBottomSheet"

        fun start(manager: FragmentManager) {
            ModalBottonSheet().show(manager, TAG)
        }
    }
}

//private fun LayoutInflater.from(requireContext: android.content.Context): android.view.LayoutInflater {}
