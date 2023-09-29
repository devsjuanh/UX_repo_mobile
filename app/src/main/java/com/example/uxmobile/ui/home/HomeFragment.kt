package com.example.uxmobile.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.uxmobile.R
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.create_alarm_button).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_create)
        }

        view.findViewById<LinearLayout>(R.id.container_coleccion1).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_colections)
        }

        view.findViewById<LinearLayout>(R.id.container_coleccion2).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_colections)
        }

        view.findViewById<LinearLayout>(R.id.container_coleccion3).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_colections)
        }

        view.findViewById<LinearLayout>(R.id.container_coleccion4).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_colections)
        }
    }

}