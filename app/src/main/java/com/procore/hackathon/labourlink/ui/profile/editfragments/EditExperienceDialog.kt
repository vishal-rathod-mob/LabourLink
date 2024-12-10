package com.procore.hackathon.labourlink.ui.profile.editfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.procore.hackathon.labourlink.databinding.FragmentEditExperienceBinding
import com.procore.hackathon.labourlink.ui.profile.ProfileViewModel

class EditExperienceDialog : BottomSheetDialogFragment() {

    private var _binding: FragmentEditExperienceBinding? = null
    private val notificationsViewModel: ProfileViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEditExperienceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val experience = notificationsViewModel.experience.value?.split(",")
        _binding?.apply {
            yearsEt.setText(experience?.get(0))
            monthsEt.setText(experience?.get(1))
        }
        _binding?.apply {
            updateProfileBtn.setOnClickListener {
                notificationsViewModel.updateExperience(
                    "${yearsEt.text},${monthsEt.text}"
                )
                dismiss()
            }
        }
    }
}