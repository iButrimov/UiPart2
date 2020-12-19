package com.example.uipart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uipart2.fragment.FirstFragment
import com.example.uipart2.fragment.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = FirstFragment()
        val fragment2 = SecondFragment()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                setReorderingAllowed(true)
                add(R.id.fragmentContainerView, fragment1)
                add(R.id.fragmentContainerView, fragment2)
                commit()
            }

            buttonOrange.setOnClickListener{
                supportFragmentManager.beginTransaction().apply {
                    setReorderingAllowed(true)
                    setPrimaryNavigationFragment(fragment1)
                    hide(fragment2)
                    show(fragment1)
                    commit()
                }
            }

            buttonBlue.setOnClickListener{
                supportFragmentManager.beginTransaction().apply {
                    setReorderingAllowed(true)
                    setPrimaryNavigationFragment(fragment2)
                    hide(fragment1)
                    show(fragment2)
                    commit()
                }
            }
        }
    }
}