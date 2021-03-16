package com.example.onboradingscreen.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.onboradingscreen.R
import com.example.onboradingscreen.onBoarding.screens.FirstFragment
import com.example.onboradingscreen.onBoarding.screens.SecondFragment
import com.example.onboradingscreen.onBoarding.screens.ThirdFragment

class ViewPagerFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(FirstFragment(), SecondFragment(), ThirdFragment())
        val mAdapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)
        val mViewpager:ViewPager2 = view.findViewById(R.id.viewPager)


        mViewpager.adapter = mAdapter
        return view
    }

}