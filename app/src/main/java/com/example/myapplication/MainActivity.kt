package com.example.myapplication

import com.example.myapplication.fragments.MainFragment
import com.example.myapplication.fragments.abstracts.FragmentActivity

class MainActivity : FragmentActivity() {
    override fun createFragment() = MainFragment.newInstance()
}