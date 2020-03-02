package com.abhishek.collegebuddy.DashboardFragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.Article.rcvArticle
import com.abhishek.collegebuddy.R
import com.abhishek.collegebuddy.developers
import com.abhishek.collegebuddy.question_bank_package.question_bank
import com.abhishek.collegebuddy.syllabus
import com.google.android.material.snackbar.Snackbar
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

        view.btn_notes.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
        }

        view.btn_que_bank.setOnClickListener { view ->


            val intent = Intent (getActivity(), question_bank::class.java)
            getActivity()?.startActivity(intent)
        }

        view.btn_articles.setOnClickListener { view ->

//            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
            val intent = Intent (getActivity(), rcvArticle::class.java)
            getActivity()?.startActivity(intent)
        }

        view.btn_pro.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG).show()
        }

        view.btn_dev.setOnClickListener { view ->
            println("clicked")
            val intent = Intent (getActivity(), developers::class.java)
            getActivity()?.startActivity(intent)
        }
        return view
    }

}