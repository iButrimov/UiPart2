package com.example.uipart2.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.uipart2.R
import com.example.uipart2.util.ArgumentManager
import kotlinx.android.synthetic.main.fragment_orange.*

class OrangeFragment : Fragment (R.layout.fragment_orange) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val argManager = ArgumentManager()
        val counterValue = argManager.getCounter(arguments)
        counterOrange.text = "$counterValue"

        orangeFragment.setOnClickListener{

            parentFragmentManager.beginTransaction().apply {
                setReorderingAllowed(true)
                add(
                    R.id.fragmentContainerView1,
                    OrangeFragment::class.java,
                    argManager.createArgs(counterValue + 1)
                )
                addToBackStack(null)
                commit()
            }
        }
    }
}