package com.procore.hackathon.labourlink.ui.profile.editfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.procore.hackathon.labourlink.MultiSpinner
import com.procore.hackathon.labourlink.R
import com.procore.hackathon.labourlink.databinding.FragmentEditTradesBinding
import com.procore.hackathon.labourlink.ui.profile.ProfileViewModel

class EditTradesDialog : BottomSheetDialogFragment() {

    private var _binding: FragmentEditTradesBinding? = null
    private val notificationsViewModel: ProfileViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEditTradesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val specializationlIST = listOf(
            "Plumbing",
            "Electricals",
            "HVAC",
            "Insulation Installation",
            "Roofing",
            "Pipe Fitting"
        )
        val selectedList = notificationsViewModel.specialization.value?.toMutableList()
        _binding?.apply {
            specializationList.text = getString(
                R.string.specializations_chosen,
                selectedList?.joinToString(",\n \u0020")
            )

            multiSpinner.setItems(
                specializationlIST,
                "Select specializations",
                object : MultiSpinner.MultiSpinnerListener {
                    override fun onItemsSelected(selected: BooleanArray?) {
                        selectedList?.clear()
                        selected?.forEachIndexed { index, b ->
                            if (b) {
                                selectedList?.add(specializationlIST[index])
                            }
                        }
                        specializationList.text = getString(
                            R.string.specializations_chosen,
                            selectedList?.joinToString(",\n \u0020")
                        )
                    }
                },
                selectedList!!.toList()
            )
        }
        _binding?.apply {
            updateProfileBtn.setOnClickListener {
                notificationsViewModel.updateTrades(
                    selectedList!!.toList()
                )
                dismiss()
            }
        }
    }

}