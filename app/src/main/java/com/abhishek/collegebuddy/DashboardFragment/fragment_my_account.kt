package com.abhishek.collegebuddy.DashboardFragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.MainActivity
import com.abhishek.collegebuddy.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_my_account.view.*

class fragment_my_account : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater!!.inflate(R.layout.fragment_my_account, null)

        view.log_out_btn.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent (getActivity(), MainActivity::class.java)
            getActivity()?.startActivity(intent)

        }
        return view
    }
}