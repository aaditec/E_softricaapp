package com.example.e_softwarica.adepter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_softwarica.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.e_softwarica.StudentModel
import com.example.e_softwarica.adepter.StudentAdapter.StudentViewHolder

class StudentAdapter(context:Context, studentList:List<StudentModel>):RecyclerView.Adapter<StudentViewHolder>() {
    class StudentViewHolder(view: View) {

    }

    internal var context:Context
    internal var studentList:List<StudentModel>
    private lateinit var studentAdapter:StudentAdapter

    init{
        this.context = context
        this.studentList = studentList
    }
    @NonNull
    override fun onCreateViewHolder(@NonNull parent:ViewGroup, viewType:Int):StudentViewHolder {
        val view = LayoutInflater.from(parent.getContext()).inflate(R.layout.studentview, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class StudentView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.studentview)
    }
}
class StudentViewHolder(@NonNull itemView:View):RecyclerView.ViewHolder(itemView) {
    internal lateinit var imgPhoto: ImageView
    internal var imgDelete:ImageView
    internal lateinit var tvFullName: TextView
    internal lateinit var tvAge:TextView
    internal lateinit var tvAddress:TextView
    internal lateinit var tvGender:TextView
    init{
        imgPhoto = itemView.findViewById(R.id.imgPhoto)
        imgDelete = itemView.findViewById(R.id.imgDelete)
        tvFullName = itemView.findViewById(R.id.tvFullName)
        tvAge = itemView.findViewById(R.id.tvAge)
        tvAddress = itemView.findViewById(R.id.tvAddress)
        tvGender = itemView.findViewById(R.id.tvGender)
    }
}