package com.procore.hackathon.labourlink.ui.profile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.procore.hackathon.labourlink.R
import com.procore.hackathon.labourlink.databinding.FragmentNotificationsBinding
import com.procore.hackathon.labourlink.ui.profile.editfragments.EditBasicInfoDialog
import com.procore.hackathon.labourlink.ui.profile.editfragments.EditHourlyRateDialog
import com.procore.hackathon.labourlink.ui.profile.editfragments.EditTradesDialog
import com.procore.hackathon.labourlink.ui.profile.editfragments.ExperienceAdapter

class ProfileFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val notificationsViewModel: ProfileViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            layoutProfilePhoto.textName.text = notificationsViewModel.name.value
            textRate.text = notificationsViewModel.rate.value
            layoutBasicInfo.textEmail.text = notificationsViewModel.email.value
            layoutBasicInfo.textPhone.text = notificationsViewModel.phone.value
            layoutBasicInfo.textAddress.text = notificationsViewModel.address.value

            layoutTrades.rvExperiences.adapter = notificationsViewModel.specialization.value?.let {
                ExperienceAdapter(it, false)
            }
            layoutTrades.rvExperiences.layoutManager = LinearLayoutManager(this@ProfileFragment.context)

            layoutBasicInfo.btnEdit.setOnClickListener {
                val dialogFragment = EditBasicInfoDialog()
                dialogFragment.show(parentFragmentManager, dialogFragment.tag)
            }
            editBtn.setOnClickListener {
                val dialogFragment = EditHourlyRateDialog()
                dialogFragment.show(parentFragmentManager, dialogFragment.tag)
            }
            layoutTrades.btnEdit.setOnClickListener {
                val dialogFragment = EditTradesDialog()
                dialogFragment.show(parentFragmentManager, dialogFragment.tag)
            }
            notificationsViewModel.name.observe(viewLifecycleOwner, {
                layoutProfilePhoto.textName.text = it
            })
            notificationsViewModel.rate.observe(viewLifecycleOwner, {
                textRate.text = it
            })
            notificationsViewModel.email.observe(viewLifecycleOwner, {
                layoutBasicInfo.textEmail.text = it
            })
            notificationsViewModel.phone.observe(viewLifecycleOwner, {
                layoutBasicInfo.textPhone.text = it
            })
            notificationsViewModel.address.observe(viewLifecycleOwner, {
                layoutBasicInfo.textAddress.text = it
            })
            notificationsViewModel.specialization.observe(viewLifecycleOwner) {
                (layoutTrades.rvExperiences.adapter as ExperienceAdapter?)?.updateList(it)
                layoutTrades.rvExperiences.adapter?.notifyDataSetChanged()
            }
            signOut.setOnClickListener {
                activity?.finish()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}