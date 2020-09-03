package com.example.lesson19

import android.os.Bundle
import android.view.View
import com.example.lesson19.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_city.*

class CityFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_city

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val bundle =
            CityFragmentArgs.fromBundle(
                requireArguments()
            )
        tvTitle.text = bundle.details?.title
        tvDesc.text = bundle.details?.desc
        if (bundle.details?.imageOfCity != null)
            ivImage.setImageResource(bundle.details?.imageOfCity)
    }
}