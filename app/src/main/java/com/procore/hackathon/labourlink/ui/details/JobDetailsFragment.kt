package com.procore.hackathon.labourlink.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.procore.hackathon.labourlink.databinding.FragmentJobsDetailsBinding

class JobDetailsFragment : Fragment() {

    private var _binding: FragmentJobsDetailsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentJobsDetailsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        init()
        setListeners()

        return root
    }

    private fun init(){

    }

    private fun setListeners(){
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}