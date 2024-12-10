package com.procore.hackathon.labourlink.ui.jobs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.procore.hackathon.labourlink.R
import com.procore.hackathon.labourlink.databinding.FragmentJobsBinding
import com.procore.hackathon.labourlink.ui.job_filters.JobListDialogFragment
import com.procore.hackathon.labourlink.ui.jobs.placeholder.PlaceholderContent

class JobsFragment : Fragment() {

    private var _binding: FragmentJobsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentJobsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        init()
        setListeners()
        return root
    }

    private fun init(){
        with(binding.list) {
            layoutManager = LinearLayoutManager(context)
            adapter = MyJobItemRecyclerViewAdapter(PlaceholderContent.ITEMS){
                val bundle = bundleOf("item" to it, "from" to 0)
                activity?.findNavController(R.id.nav_host_fragment_activity_main)!!.navigate(R.id.navigation_job_details, bundle)
            }
        }
    }

    private fun setListeners(){
        binding.ivFilters.setOnClickListener {
            val bottomSheetJobFilters = JobListDialogFragment()
            bottomSheetJobFilters.show(parentFragmentManager, bottomSheetJobFilters.tag)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}