package com.procore.hackathon.labourlink.ui.job_filters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.procore.hackathon.labourlink.MultiSpinner
import com.procore.hackathon.labourlink.R
import com.procore.hackathon.labourlink.databinding.FragmentJobFilterDialogBinding

class JobListDialogFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentJobFilterDialogBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentJobFilterDialogBinding.inflate(inflater, container, false)

        init()
        setListeners()

        return binding.root

    }

    private fun init(){
        val specializationlIST = listOf(
            "Plumbing",
            "Electrician",
            "HVAC",
            "Insulation Installation",
            "Roofing",
            "Pipe Fitting"
        )
        val selectedList = ArrayList<String>()
        selectedList.add("Electrician")
        setSelectedList(selectedList)

        _binding?.apply {
//            specializationList.text = getString(
//                R.string.specializations_chosen,
//                selectedList?.joinToString(",\n \u0020")
//            )

            multiSpinner.setItems(
                specializationlIST,
                "Select specializations",
                object : MultiSpinner.MultiSpinnerListener {
                    override fun onItemsSelected(selected: BooleanArray?) {
                        selectedList.clear()
                        selected?.forEachIndexed { index, b ->
                            if (b) {
                                selectedList.add(specializationlIST[index])
                            }
                        }
                        setSelectedList(selectedList)
                    }
                },
                selectedList.toList()
            )
        }
    }

    private fun setSelectedList(selectedList: ArrayList<String>) {
        binding.specializationList.text = getString(
            R.string.specializations_chosen,
            selectedList?.joinToString(",\n \u0020")
        )
    }

    private fun setListeners(){
        with(binding){
            seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    tvDistance.text = "$progress kms"
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {

                }

                override fun onStopTrackingTouch(p0: SeekBar?) {

                }
            })

            btn.setOnClickListener {
                dismiss()
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}