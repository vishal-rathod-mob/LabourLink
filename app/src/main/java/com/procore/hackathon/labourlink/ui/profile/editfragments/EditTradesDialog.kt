package com.procore.hackathon.labourlink.ui.profile.editfragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.procore.hackathon.labourlink.MultiSpinner
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
        val selectedList = notificationsViewModel.specialization.value?.keys?.toMutableList()
        _binding?.apply {
            val adapter = notificationsViewModel.specialization.value?.let {
                ExperienceAdapter(it, true)
            }
            rvExperiences.adapter = adapter
            rvExperiences.layoutManager = LinearLayoutManager(this@EditTradesDialog.context)
            multiSpinner.setItems(
                specializationlIST,
                "Select specializations",
                object : MultiSpinner.MultiSpinnerListener {
                    @SuppressLint("NotifyDataSetChanged")
                    override fun onItemsSelected(selected: BooleanArray?) {
                        selected?.forEachIndexed { index, b ->
                            if (b && selectedList?.contains(specializationlIST[index]) == false) {
                                selectedList.add(specializationlIST[index])
                            } else if (!b) {
                                selectedList?.remove(specializationlIST[index])
                            }
                        }
                        notificationsViewModel.updateTrades(
                            selectedList!!.toList()
                        )
                    }
                },
                selectedList!!.toList()
            )
            updateProfileBtn.setOnClickListener {
                val experienceslist = mutableListOf<Int>()
                selectedList.indices.forEach {
                    val a  = rvExperiences.findViewHolderForAdapterPosition(it) as ExperienceAdapter.ViewHolder
                    experienceslist.add(a.binding.textFieldName.editText?.text.toString().toInt())
                }
                notificationsViewModel.updateTradeExperiences(
                   experienceslist.toList()
                )
                dismiss()
            }

            notificationsViewModel.specialization.observe(viewLifecycleOwner, {
                notificationsViewModel.specialization.value?.let { adapter?.updateList(it) }
                rvExperiences.adapter = adapter
                rvExperiences.adapter?.notifyDataSetChanged()
            })
        }
    }

}