package com.procore.hackathon.labourlink.ui.jobs

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.procore.hackathon.labourlink.databinding.FragmentJobListBinding
import com.procore.hackathon.labourlink.ui.jobs.placeholder.PlaceholderContent.PlaceholderItem

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyJobItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>,
    private val function: (PlaceholderItem) -> Unit
) : RecyclerView.Adapter<MyJobItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val holder = ViewHolder(
            FragmentJobListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
        holder.itemView.setOnClickListener {
            function(values[holder.adapterPosition])
        }
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentJobListBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }

}