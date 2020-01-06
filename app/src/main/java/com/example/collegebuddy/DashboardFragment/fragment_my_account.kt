package com.example.collegebuddy.DashboardFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.fragment.app.Fragment
import com.example.collegebuddy.R
import kotlinx.android.synthetic.main.fragment_my_account.*
import kotlinx.android.synthetic.main.fragment_my_account.view.*

class fragment_my_account : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater!!.inflate(R.layout.fragment_my_account, null)


        view.change_login_btn.visibility = View.GONE
        view.log_out_btn.visibility = View.GONE


        return view
    }
}