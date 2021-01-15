package com.example.e_softwarica.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.e_softwarica.R
import com.example.e_softwarica.StudentModel
import com.example.e_softwarica.adepter.StudentAdapter
import java.util.ArrayList

class HomeFragment : Fragment() {
    private var rcView: RecyclerView? = null
    var read = true
    var studentAdapter = StudentAdapter(activity!!, listOf())



    class AddFragment : Fragment() {
        private var rcView: RecyclerView? = null
        var read = true
        private var studentAdapter = activity?.let { StudentAdapter(it, list) }
        //List<StudentModel> list;

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        }

        override fun onResume() {
            super.onResume()
            studentAdapter?.notifyDataSetChanged()
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            val view = inflater.inflate(R.layout.fragment_home, container, false)
            rcView = view.findViewById(R.id.rcView)
            // rcView.setAdapter(studentAdapter)
           // rcView.addItemDecoration(
                DividerItemDecoration(
                    activity,
                    LinearLayoutManager.VERTICAL
                )

           //rcView.layoutManager = LinearLayoutManager(activity)
            return view
        }

        fun onClick(v: View) {
        }


            var list: List<StudentModel> = ArrayList<StudentModel>()

        }
    }



