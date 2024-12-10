package com.procore.hackathon.labourlink.ui.profile.editfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.procore.hackathon.labourlink.databinding.FragmentEditRateBinding
import com.procore.hackathon.labourlink.ui.profile.ProfileViewModel

class EditHourlyRateDialog : BottomSheetDialogFragment() {

    private var _binding: FragmentEditRateBinding? = null
    private val notificationsViewModel: ProfileViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEditRateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.apply {
            textFieldRate.editText?.setText(notificationsViewModel.rate.value)

        }
        _binding?.apply {
            updateProfileBtn.setOnClickListener {
                notificationsViewModel.updateRate(
                    textFieldRate.editText?.text.toString()
                )
                dismiss()
            }
        }
    }
}