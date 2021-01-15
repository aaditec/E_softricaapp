package com.example.e_softwarica.adepter
//import androidx.fragment.app.FragmentActivity

//class StudentAdapter(activity: FragmentActivity, list: Any?) {
  //fun notifyDataSetChanged() {
      //  TODO("Not yet implemented")
  //  }

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.e_softwarica.Fragments.HomeFragment
import com.example.e_softwarica.R
import com.example.e_softwarica.StudentModel
import com.example.e_softwarica.adepter.StudentAdapter.StudentViewHolder

class StudentAdapter(var context: Context, var studentList: List<StudentModel>) : RecyclerView.Adapter<StudentViewHolder>() {
    private val studentAdapter: StudentAdapter? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.studentview, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val studentModel = studentList[position]
        holder.imgPhoto.setImageResource(studentModel.photo)
        holder.tvFullName.text = studentModel.name
        holder.tvAddress.text = studentModel.address
        holder.tvAge.text = studentModel.age
        holder.tvGender.text = studentModel.gender
        holder.imgDelete.setImageResource(studentModel.icon)
        holder.imgPhoto.setOnClickListener { v ->
            Toast.makeText(v.context, "Hello! This is: " + studentModel.name, Toast.LENGTH_SHORT).show()
            //Toast.makeText(this@HomeFragment, "GFHFHF", Toast.LENGTH_SHORT).show();
        }
        holder.imgDelete.setOnClickListener { delete(position) }
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    private fun delete(position: Int) {
        //studentList.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
        notifyItemRangeChanged(position,studentList.size)

    }

    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView
        var imgDelete: ImageView
        var tvFullName: TextView
        var tvAge: TextView
        var tvAddress: TextView
        var tvGender: TextView

        init {
            imgPhoto = itemView.findViewById(R.id.imgPhoto)
            imgDelete = itemView.findViewById(R.id.imgDelete)
            tvFullName = itemView.findViewById(R.id.tvFullName)
            tvAge = itemView.findViewById(R.id.tvAge)
            tvAddress = itemView.findViewById(R.id.tvAddress)
            tvGender = itemView.findViewById(R.id.tvGender)
        }
    }
}

private fun ImageView.setImageResource(icon: String) {

}
