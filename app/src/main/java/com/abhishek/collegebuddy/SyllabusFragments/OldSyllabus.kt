package com.abhishek.collegebuddy.SyllabusFragments


import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.R


class OldSyllabus : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view:View = inflater!!.inflate(R.layout.fragment_old_syllabus, container, false)

        return view
    }



}
