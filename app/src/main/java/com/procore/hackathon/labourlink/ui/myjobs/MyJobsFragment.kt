package com.procore.hackathon.labourlink.ui.myjobs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.procore.hackathon.labourlink.R
import com.procore.hackathon.labourlink.databinding.FragmentMyJobsBinding
import com.procore.hackathon.labourlink.ui.jobs.MyJobItemRecyclerViewAdapter
import com.procore.hackathon.labourlink.ui.jobs.placeholder.PlaceholderContent

class MyJobsFragment : Fragment() {

    private var _binding: FragmentMyJobsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMyJobsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        init()

        return root
    }

    private fun init(){
        with(binding.list) {
            layoutManager = LinearLayoutManager(context)

            val list = ArrayList<PlaceholderContent.PlaceholderItem>()
            list.add(PlaceholderContent.ITEMS[7])
            list.add(PlaceholderContent.ITEMS[16])
            list.add(PlaceholderContent.ITEMS[19])


            adapter = MyActivityItemRecyclerViewAdapter(list){
                val bundle = bundleOf("item" to it, "from" to 1)
                activity?.findNavController(R.id.nav_host_fragment_activity_main)!!.navigate(R.id.navigation_job_details, bundle)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}