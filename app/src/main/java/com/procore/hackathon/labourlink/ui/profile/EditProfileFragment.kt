package com.procore.hackathon.labourlink.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.procore.hackathon.labourlink.databinding.FragmentEditProfileBinding

class EditProfileFragment : Fragment() {

    private var _binding: FragmentEditProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val notificationsViewModel: NotificationsViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEditProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.apply {
            textFieldName.editText?.setText(notificationsViewModel.name.value)
            textFieldRate.editText?.setText(notificationsViewModel.rate.value)
            textFieldEmail.editText?.setText(notificationsViewModel.email.value)
            textFieldPhone.editText?.setText(notificationsViewModel.phone.value)

            updateProfileBtn.setOnClickListener {
                notificationsViewModel.updateValues(
                    textFieldName.editText?.text.toString(),
                    textFieldEmail.editText?.text.toString(),
                    textFieldPhone.editText?.text.toString(),
                    textFieldRate.editText?.text.toString()
                )
                activity?.onBackPressed()

            }
            _binding?.cancelButton?.setOnClickListener {
                activity?.onBackPressed()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}