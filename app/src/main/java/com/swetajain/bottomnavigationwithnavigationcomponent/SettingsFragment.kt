package com.swetajain.bottomnavigationwithnavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.swetajain.bottomnavigationwithnavigationcomponent.databinding.FragmentSettingsBinding

/**
 * A simple [Fragment] subclass.
 */
class SettingsFragment : Fragment() {
    private lateinit var binding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}