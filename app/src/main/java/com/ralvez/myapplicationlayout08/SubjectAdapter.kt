package com.ralvez.myapplicationlayout08

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class SubjectAdapter(
    private val subjects: List<Subject>,
    private val onItemClick: (subject: Subject) -> Unit
) : RecyclerView.Adapter<SubjectAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.example_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val subject = subjects[position]
        holder.textView1.text = subject.subject

        holder.itemView.setOnClickListener { onItemClick(subject) }
    }

    override fun getItemCount(): Int {
        return subjects.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.findViewById(R.id.itemName)

    }
}