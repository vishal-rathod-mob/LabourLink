package com.procore.hackathon.labourlink.ui.profile.editfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.procore.hackathon.labourlink.databinding.FragmentEditBasicInfoBinding
import com.procore.hackathon.labourlink.ui.profile.ProfileViewModel

class EditBasicInfoDialog : BottomSheetDialogFragment() {

    private var _binding: FragmentEditBasicInfoBinding? = null
    private val notificationsViewModel: ProfileViewModel by activityViewModels()


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEditBasicInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.apply {
            textFieldName.editText?.setText(notificationsViewModel.name.value)
            textFieldPhone.editText?.setText(notificationsViewModel.phone.value)
            textFieldEmail.editText?.setText(notificationsViewModel.email.value)
            textFieldAddress.editText?.setText(notificationsViewModel.address.value)
        }
        _binding?.apply {
            updateProfileBtn.setOnClickListener {
                notificationsViewModel.updateBasicInfo(
                    textFieldName.editText?.text.toString(),
                    textFieldEmail.editText?.text.toString(),
                    textFieldPhone.editText?.text.toString(),
                    textFieldAddress.editText?.text.toString()
                )
                dismiss()
            }
        }
    }
}