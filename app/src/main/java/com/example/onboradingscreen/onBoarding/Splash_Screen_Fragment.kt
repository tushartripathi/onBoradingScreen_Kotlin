package com.example.onboradingscreen.onBoarding

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.onboradingscreen.R


class Splash_Screen_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({
            if(onBoardingFinished())
            {findNavController().navigate(R.id.action_splash_Screen_Fragment_to_homeFragment)
               }
            else
            findNavController().navigate(R.id.action_splash_Screen_Fragment_to_viewPagerFragment)
        },2000);


        val view = inflater.inflate(R.layout.fragment_splash__screen_, container, false)
        return view
    }

    fun onBoardingFinished():Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)
    }
}