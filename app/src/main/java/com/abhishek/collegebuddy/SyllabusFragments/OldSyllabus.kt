package com.abhishek.collegebuddy.SyllabusFragments


import android.content.Intent
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.R
import com.abhishek.collegebuddy.OldSyllabus.old_syllabus_cse
import kotlinx.android.synthetic.main.fragment_old_syllabus.view.*


class OldSyllabus : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view:View = inflater!!.inflate(R.layout.fragment_old_syllabus, container, false)

        view.cse.setOnClickListener {
            var intent = Intent(getContext(),
                old_syllabus_cse::class.java)
            startActivity(intent)
        }

        return view
    }



}
