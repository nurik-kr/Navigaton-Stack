package com.example.lesson19

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.lesson19.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_cities.*

class CitiesFragment : BaseFragment(),
    RvListener {

    override fun resID() = R.layout.fragment_cities

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        val adapter = RvAdapter(this)
        recyclerview.adapter = adapter
        adapter.update(getData())
    }

    private fun getData(): ArrayList<CitiesData> {
        val list = arrayListOf<CitiesData>()

            list.add(CitiesData(R.drawable.losangeles_image, R.drawable.losangeles_emblem, getString(R.string.losangeles_title), getString(R.string.losangeles_description)))
            list.add(CitiesData(R.drawable.paloalto_image, R.drawable.paloalto_emblem, getString(R.string.paloalto_title), getString(R.string.paloalto_description)))
            list.add(CitiesData(R.drawable.boston_image, R.drawable.boston_emblem, getString(R.string.boston_title), getString(R.string.boston_description)))
            list.add(CitiesData(R.drawable.newyork_image, R.drawable.newyork_emblem, getString(R.string.newyork_title), getString(R.string.newyork_description)))
            list.add(CitiesData(R.drawable.chicago_image, R.drawable.chicago_emblem, getString(R.string.chicago_title), getString(R.string.chicago_description)))
            list.add(CitiesData(R.drawable.sanfrancisco_image, R.drawable.sanfrancisco_emblem, getString(R.string.sanfrancisco_title), getString(R.string.sanfrancisco_description)))
            list.add(CitiesData(R.drawable.washington_image, R.drawable.washington_emblem, getString(R.string.washington_title), getString(R.string.washington_description)))

        return list
    }

    override fun goToCity(data: CitiesData) {
        val dest =
            CitiesFragmentDirections.actionCitiesFragmentToCityFragment(
                data
            )
        findNavController().navigate(dest)
    }
}