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
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_new_syllabus.view.*
import kotlinx.android.synthetic.main.fragment_old_syllabus.view.*


class NewSyllabus : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view: View = inflater!!.inflate(R.layout.fragment_new_syllabus, container, false)

        view.Electrical_btn_new.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
        }

        view.it_btn_new.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
        }

        view.leather_btn_new.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
        }

        view.bca_btn_new.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
        }

        view.mbbs_btn_new.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
        }

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












