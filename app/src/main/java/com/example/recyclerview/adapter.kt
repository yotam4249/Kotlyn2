package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Student
import com.example.recyclerview.R

class StudentAdapter(private val studentList:List<Student>):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>(){

    class StudentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val studentImage: ImageView = itemView.findViewById(R.id.studentImage)
        val studentName:TextView=itemView.findViewById((R.id.studentName))
        val studentId:TextView=itemView.findViewById((R.id.studentId))
        val itemChecked:CheckBox=itemView.findViewById(R.id.item_checkbox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val studentView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return StudentViewHolder(studentView)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = studentList[position]
        holder.studentId.text = student.id.toString()
        holder.studentName.text = student.name
        holder.studentImage.setImageResource(R.drawable.ic_launcher_foreground)
        holder.itemChecked.isChecked = student.isChecked
        holder.itemChecked.setOnCheckedChangeListener { _, isChecked ->
            student.isChecked = isChecked

        }
    }

}