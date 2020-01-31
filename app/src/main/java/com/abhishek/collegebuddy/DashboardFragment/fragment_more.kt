package com.abhishek.collegebuddy.DashboardFragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.More_activities.privacy_policy
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.fragment_more.view.*

class fragment_more: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_more, container, false)

        view.privacy_policy_btn.setOnClickListener { view ->
            println("clicked")
            val intent = Intent (getActivity(), privacy_policy::class.java)
            getActivity()?.startActivity(intent)
        }
        return view
    }
}