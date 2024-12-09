package com.procore.hackathon.labourlink.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.procore.hackathon.labourlink.R
import com.procore.hackathon.labourlink.databinding.FragmentNotificationsBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val notificationsViewModel: NotificationsViewModel by activityViewModels()

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
            textName.text = notificationsViewModel.name.value
            textRate.text = notificationsViewModel.rate.value
            layoutBasicInfo.textEmail.text = notificationsViewModel.email.value
            layoutBasicInfo.textPhone.text = notificationsViewModel.phone.value

            textEdit.setOnClickListener {
                findNavController().navigate(R.id.to_edit_profile)
            }
            notificationsViewModel.name.observe(viewLifecycleOwner, {
                textName.text = notificationsViewModel.name.value
            })
            notificationsViewModel.rate.observe(viewLifecycleOwner, {
                textRate.text = notificationsViewModel.rate.value
            })
            notificationsViewModel.email.observe(viewLifecycleOwner, {
                layoutBasicInfo.textEmail.text = notificationsViewModel.email.value
            })
            notificationsViewModel.phone.observe(viewLifecycleOwner, {
                layoutBasicInfo.textPhone.text = notificationsViewModel.phone.value
            })
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}