package com.abhishek.collegebuddy.SyllabusFragments


import android.content.Intent
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.NewSyllabus.EeeNew
import com.abhishek.collegebuddy.NewSyllabus.MechNew
import com.abhishek.collegebuddy.NewSyllabus.civilnew

import com.abhishek.collegebuddy.R
import com.abhishek.collegebuddy.NewSyllabus.new_syllabus_cse
import kotlinx.android.synthetic.main.fragment_new_syllabus.view.*


class NewSyllabus : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view: View = inflater!!.inflate(R.layout.fragment_new_syllabus, container, false)

        view.cse_btn_new.setOnClickListener {
            var intent = Intent(
                getContext(),
                new_syllabus_cse::class.java
            )
            startActivity(intent)

        }
            view.eee_btn_new.setOnClickListener {
                var intent = Intent(
                    getContext(),
                    EeeNew::class.java
                )
                startActivity(intent)

        }

        view.mech_btn_new.setOnClickListener {
            var intent = Intent(
                getContext(),
                MechNew::class.java
            )
            startActivity(intent)

        }

        view.civil_btn_new.setOnClickListener {
            var intent = Intent(
                getContext(),
                civilnew::class.java
            )
            startActivity(intent)

        }
        return view
    }
}












