package com.example.checkinapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.checkinapp.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), OnMapReadyCallback {

    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity?.supportFragmentManager?.findFragmentById(R.id.map) as SupportMapFragment?)?.getMapAsync(this)

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onMapReady(googleMap: GoogleMap) {

        map = googleMap
        val latitude = 16.871392210372044
        val longitude = 96.14009007687571
        val homeLatLng = LatLng(latitude, longitude)
        val zoomLevel = 15f
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(homeLatLng, zoomLevel))
        map.addMarker(MarkerOptions().position(homeLatLng))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnMyTeam.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_teamDetailFragment)
        )
    }


}