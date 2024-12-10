package com.procore.hackathon.labourlink.ui.profile.editfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.procore.hackathon.labourlink.databinding.ItemExperienceBinding

class ExperienceAdapter(private var list: Map<String, Int>, var isEditScreen: Boolean = true) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holder = ViewHolder(
            ItemExperienceBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
        return holder
    }

    fun updateList(newlist: Map<String, Int>) {
        list = newlist
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            holder.onBind(list, position, isEditScreen)
        }
    }

    inner class ViewHolder(val binding: ItemExperienceBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(list: Map<String, Int>, position: Int, isEditScreen: Boolean) {
            binding.specializationTitle.text = list.keys.toMutableList()[position]
            if (isEditScreen) {
                binding.textFieldName.visibility = View.VISIBLE
                binding.textExperience.visibility = View.INVISIBLE
                binding.textFieldName.editText?.setText(list.values.toMutableList()[position].toString())
            } else {
                binding.textFieldName.visibility = View.GONE
                binding.textExperience.visibility = View.VISIBLE
                binding.textExperience.text = "${list.values.toMutableList()[position]} years"
            }
        }
    }
}