package com.procore.hackathon.labourlink.ui.details

import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.procore.hackathon.labourlink.databinding.FragmentJobsDetailsBinding
import com.procore.hackathon.labourlink.ui.jobs.placeholder.PlaceholderContent

@Suppress("DEPRECATION")
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
        val item = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable("item", PlaceholderContent.PlaceholderItem::class.java)
        }
        else{
            arguments?.getParcelable("item")!!
        }

        val from = arguments?.getInt("from")

        if(from == 1){
            binding.btn.text = "Cancel Application"
        }

        with(item!!){
            with(binding){
                tvJobTitle.text = jobTitle
                tvCompany.text = company
                tvDuration.text = duration
                tvJobType.text = type
                tvLocation.text = location
                tvDescription.text = description
                tvResponsibilities.text = responsibilities.replace("\\n", System.lineSeparator())
                tvRequirements.text = requirements.replace("\\n", System.lineSeparator())
            }
        }
    }

    private fun setListeners(){
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btn.setOnClickListener {
            if(arguments?.getInt("from") == 0){
                Toast.makeText(context, "Application Sent", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(context, "Application Cancelled", Toast.LENGTH_SHORT).show()
            }
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}