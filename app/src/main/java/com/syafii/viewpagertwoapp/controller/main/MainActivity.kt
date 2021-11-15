package com.syafii.viewpagertwoapp.controller.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.syafii.viewpagertwoapp.R
import com.syafii.viewpagertwoapp.controller.adapter.ViewPagerFragmentAdapter
import com.syafii.viewpagertwoapp.controller.home.HomeFragment
import com.syafii.viewpagertwoapp.controller.profile.ProfileFragment
import com.syafii.viewpagertwoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: ViewPagerFragmentAdapter
    private val tabTitle = arrayOf(
        "Home",
        "Profile"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intiView()

    }

    private fun intiView() {
        adapter = ViewPagerFragmentAdapter(this)
        adapter.addFragment(HomeFragment())
        adapter.addFragment(ProfileFragment())
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()
    }
}