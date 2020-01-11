package com.abhishek.collegebuddy.Adapters


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.abhishek.collegebuddy.SyllabusFragments.NewSyllabus
import com.abhishek.collegebuddy.SyllabusFragments.OldSyllabus

class SyllabusPagerAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {

        return when (position){

            1 ->{ OldSyllabus() }

//
            else->{
                return NewSyllabus()
            }
        }
    }

    override fun getCount(): Int {

        return 2
    }


    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            1-> {"Old Syllabus"}

            else -> {return "New Syllabus"}
        }


    }


}