package com.abhishek.collegebuddy.DashboardFragment

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.More_activities.about_us
import com.abhishek.collegebuddy.More_activities.disclaimer
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

        // privacy Policy Btn
        view.privacy_policy_btn.setOnClickListener { view ->
            println("clicked")
            val intent = Intent (getActivity(), privacy_policy::class.java)
            getActivity()?.startActivity(intent)
        }

        //diclaimer button
        view.disclaimer_btn.setOnClickListener { view ->
            println("clicked")
            val intent = Intent (getActivity(), disclaimer::class.java)
            getActivity()?.startActivity(intent)
        }

        // about us button
        view.about_us_btn.setOnClickListener { view ->
            println("clicked")
            val intent = Intent (getActivity(), about_us::class.java)
            getActivity()?.startActivity(intent)
        }

        // Rate US
        view.rate_us_btn.setOnClickListener{
            val uri: Uri = Uri.parse("market://details?id=" + context!!.packageName)
            val goToMarket = Intent(Intent.ACTION_VIEW, uri)
            goToMarket.addFlags(
                Intent.FLAG_ACTIVITY_NO_HISTORY or
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK
            )
            try {
                startActivity(goToMarket)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + context!!.packageName)
                    )
                )
            }
        }
        return view
    }
}