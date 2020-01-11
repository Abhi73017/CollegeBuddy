package com.abhishek.collegebuddy

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.abhishek.collegebuddy.DashboardFragment.fragment_contact_us
import com.abhishek.collegebuddy.DashboardFragment.fragment_home
import com.abhishek.collegebuddy.DashboardFragment.fragment_more
import com.abhishek.collegebuddy.DashboardFragment.fragment_my_account
import com.google.android.material.bottomnavigation.BottomNavigationView


class dashboard : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var fragment:Fragment =
            fragment_home()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()


        val navigation: BottomNavigationView = findViewById(R.id.nav_view)
        navigation.setOnNavigationItemSelectedListener(this)

    }

    private fun onFragmentLoad (fragment1:Fragment): Boolean{
        if (fragment1!=null){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment1)
                .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
     var fragment : Fragment =
         fragment_home()
        when(item.itemId)
        {
            R.id.navigation_home -> {fragment =
                fragment_home()
            }
            R.id.navigation_Contact_Us -> {fragment =
                fragment_contact_us()
            }
            R.id.navigation_My_account -> {fragment =
                fragment_my_account()
            }
            R.id.navigation_More -> {fragment =
                fragment_more()
            }

        }
        return onFragmentLoad(fragment)
    }

    //Back Button Click Condition

    private var back_pressed: Long = 0

    override fun onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) super.onBackPressed() else Toast.makeText(
            baseContext,
            "Press once again to exit!",
            Toast.LENGTH_SHORT
        ).show()
        back_pressed = System.currentTimeMillis()
    }





    }  // class Ends


