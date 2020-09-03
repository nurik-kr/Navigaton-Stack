package com.example.lesson19

import android.os.Bundle
import android.view.View
import com.example.lesson19.base.BaseFragment
import com.example.lesson19.viewpager.FirstColorFragment
import com.example.lesson19.viewpager.SecondColorFragment
import com.example.lesson19.viewpager.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_colors.*

class ColorsFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_colors

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        val adapter = ViewPagerAdapter(childFragmentManager)
        viewPager.adapter = adapter
        adapter.addFragment(FirstColorFragment(), getString(R.string.first_fragment))
        adapter.addFragment(SecondColorFragment(), getString(R.string.second_fragment))
        tabLayout.setupWithViewPager(viewPager)
    }
}