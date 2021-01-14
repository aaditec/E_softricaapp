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
import java.util.ArrayList

class HomeFragment : Fragment() {
    class AddFragment : Fragment() {
        private lateinit var rcView: RecyclerView
        var read = true
        private var studentAdapter = StudentAdapter(getActivity(), list)
        //List<StudentModel> list;

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        }

        override fun onResume() {
            super.onResume()
            studentAdapter.notifyDataSetChanged()
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            val view = inflater.inflate(R.layout.fragment_home, container, false)
            rcView = view.findViewById(R.id.rcView)
            // rcView.setAdapter(studentAdapter)
            rcView.addItemDecoration(
                DividerItemDecoration(
                    getActivity(),
                    LinearLayoutManager.VERTICAL
                )
            )
            rcView.setLayoutManager(LinearLayoutManager(getActivity()))
            return view
        }

        fun onClick(v: View) {
        }

        companion object {
            var list: List<StudentModel> = ArrayList<StudentModel>()

        }
    }
}


