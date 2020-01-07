package com.example.collegebuddy.DashboardFragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.collegebuddy.BuildConfig
import com.example.collegebuddy.BuildConfig.VERSION_CODE
import com.example.collegebuddy.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_contact_us.*
import kotlinx.android.synthetic.main.fragment_contact_us.view.*
import java.lang.Exception

class fragment_contact_us: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_contact_us, container, false)

        view.call_us_btn.setOnClickListener { view ->

            Snackbar.make(view, "Currently Unavalible", Snackbar.LENGTH_LONG).show()
//            val intent = Intent (getActivity(), syllabus::class.java)
//            getActivity()?.startActivity(intent)
        }

        view.mail_us_btn.setOnClickListener { view ->


            /* ------------------------------Mail Activity Open Part ------------------------------------------------- */
            val mIntent = Intent(Intent.ACTION_SEND)

            mIntent.data = Uri.parse("mailto:")
            mIntent.type = "text/plain"
            mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(getString(R.string.abhiEmail)))

            mIntent.putExtra(Intent.EXTRA_SUBJECT, "From Cb App V: ${BuildConfig.VERSION_NAME}")
            mIntent.putExtra(Intent.EXTRA_TEXT, "Version: ${BuildConfig.VERSION_NAME} \n Version Code : $VERSION_CODE")


            try {
                //start email intent
                startActivity(Intent.createChooser(mIntent, "Choose Your Email App"))
            }
            catch (e: Exception){
                Toast.makeText(getContext(), e.message, Toast.LENGTH_LONG).show()
            }

/*--------------------------------- Mail Ends ---------------------------------------------------------*/

}

        view.complain_btn.setOnClickListener {view ->

            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse(getString(R.string.complainUrl))

           try {
               startActivity(openURL)
           }catch (e:Exception) {
               Toast.makeText(context, e.message, Toast.LENGTH_LONG).show()
           }
        }
//view.complain_btn.setOnClickListener{view-> println("complain btn clicked")}
return view
}
}


