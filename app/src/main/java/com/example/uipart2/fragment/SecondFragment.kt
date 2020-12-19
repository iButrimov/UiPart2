package com.example.uipart2.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.uipart2.R

class SecondFragment : Fragment (R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val blueFragment = BlueFragment()
        childFragmentManager.beginTransaction().apply {
            setReorderingAllowed(true)
            add(R.id.fragmentContainerView2, blueFragment)
            commit()
        }
    }
}