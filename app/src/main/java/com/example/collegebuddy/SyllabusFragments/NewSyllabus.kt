package com.example.collegebuddy.SyllabusFragments


import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.collegebuddy.R



class NewSyllabus : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_new_syllabus, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        newsyltxt.text = "updated new syllabus"
//    }


}
