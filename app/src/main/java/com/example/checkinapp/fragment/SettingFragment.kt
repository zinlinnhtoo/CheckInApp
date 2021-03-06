package com.example.checkinapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.checkinapp.R
import kotlinx.android.synthetic.main.fragment_setting.*


class SettingFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment = activity?.let { Navigation.findNavController(it, R.id.nav_host_fragment) }

        leave_balance_layout.setOnClickListener{
//            Navigation.createNavigateOnClickListener(R.id.action_fragmentSetting_to_fragmentLeaveBalance)
            findNavController().navigate(R.id.action_settingFragment_to_leaveBalanceFragment)
        }

        profile_layout.setOnClickListener {
//            Navigation.createNavigateOnClickListener(R.id.action_fragmentSetting_to_fragmentProfile)
            findNavController().navigate(R.id.action_settingFragment_to_profileFragment)
        }

    }
}