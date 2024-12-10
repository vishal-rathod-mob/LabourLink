package com.procore.hackathon.labourlink.ui.myjobs

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.procore.hackathon.labourlink.databinding.FragmentJobListBinding
import com.procore.hackathon.labourlink.ui.jobs.placeholder.PlaceholderContent.PlaceholderItem

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyActivityItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>,
    private val function: (PlaceholderItem) -> Unit
) : RecyclerView.Adapter<MyActivityItemRecyclerViewAdapter.ViewHolder>() {

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
        holder.bind(item)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(val binding: FragmentJobListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PlaceholderItem) {
            with(binding){
                tvTitle.text = item.jobTitle
                tvType.text = item.type
                tvDescription.text = item.description
                tvLocation.text = item.location
                tvTime.text = "Applied 2 days ago"
            }
        }
    }
}