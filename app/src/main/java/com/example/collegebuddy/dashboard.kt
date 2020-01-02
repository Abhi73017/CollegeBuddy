package com.example.collegebuddy

import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

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
     var fragment : Fragment = fragment_home()
        when(item.itemId)
        {
            R.id.navigation_home -> {fragment = fragment_home()}
            R.id.navigation_Contact_Us -> {fragment = fragment_contact_us()}
            R.id.navigation_My_account -> {fragment = fragment_my_account()}
            R.id.navigation_More -> {fragment = fragment_more()}

        }
        return onFragmentLoad(fragment)
    }
}
