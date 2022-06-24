package com.example.checkinapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.checkinapp.R
import com.example.checkinapp.adapters.LeaveBalanceAdapter
import kotlinx.android.synthetic.main.fragment_leave_balance.*


class LeaveBalanceFragment : Fragment() {

    lateinit var leaveBalanceAdapter: LeaveBalanceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leave_balance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        toolbar.setupWithNavController(navController)

        val dividerItemDecoration = DividerItemDecoration(rvLeaveBalance.context, DividerItemDecoration.VERTICAL)
        leaveBalanceAdapter = LeaveBalanceAdapter()
        rvLeaveBalance.adapter = leaveBalanceAdapter
        rvLeaveBalance.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rvLeaveBalance.addItemDecoration(dividerItemDecoration)
    }

}