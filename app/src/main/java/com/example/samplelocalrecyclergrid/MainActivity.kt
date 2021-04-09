package com.example.samplelocalrecyclergrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.samplelocalrecyclergrid.`object`.SampleObject
import com.example.samplelocalrecyclergrid.adapter.SampleAdapter
import com.example.samplelocalrecyclergrid.databinding.ActivityMainBinding
import com.example.samplelocalrecyclergrid.modal.Sheets
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    //
    private lateinit var binding: ActivityMainBinding

    //
    private var listSheets: ArrayList<Sheets> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        listSheets.addAll(SampleObject.dataList)

        //
        showGridRecycler()
    }

    private fun showGridRecycler()
    {
        sample_recycler.layoutManager = GridLayoutManager(this, 2)
        sample_recycler.adapter = SampleAdapter(listSheets)
    }
}