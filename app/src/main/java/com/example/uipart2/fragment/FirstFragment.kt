package com.example.uipart2.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.uipart2.R

class FirstFragment : Fragment (R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val orangeFragment = OrangeFragment()
        childFragmentManager.beginTransaction().apply {
            setReorderingAllowed(true)
            add(R.id.fragmentContainerView1, orangeFragment)
            commit()
        }
    }
}