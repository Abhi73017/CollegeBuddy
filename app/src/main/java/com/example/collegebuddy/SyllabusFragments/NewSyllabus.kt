package com.example.collegebuddy.SyllabusFragments


import android.content.Intent
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.collegebuddy.R
import com.example.collegebuddy.NewSyllabus.new_syllabus_cse
import kotlinx.android.synthetic.main.fragment_new_syllabus.view.*


class NewSyllabus : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var view:View = inflater!!.inflate(R.layout.fragment_new_syllabus, container, false)

        view.cse.setOnClickListener {
            var intent = Intent(getContext(),
                new_syllabus_cse::class.java)
            startActivity(intent)

        }



        return view
    }



    }








