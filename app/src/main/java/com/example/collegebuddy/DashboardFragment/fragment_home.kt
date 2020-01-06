package com.example.collegebuddy.DashboardFragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.collegebuddy.R
import com.example.collegebuddy.syllabus
import kotlinx.android.synthetic.main.fragment_home.view.*

class fragment_home : Fragment(){

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_home, container, false)

        view.btn_syllabus.setOnClickListener { view ->
            println("clicked")
            val intent = Intent (getActivity(), syllabus::class.java)
            getActivity()?.startActivity(intent)
        }
        return view
    }

}