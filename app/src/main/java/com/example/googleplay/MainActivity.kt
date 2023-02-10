package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.googleplay.adapter.RVWSuperAdapter
import com.example.googleplay.databinding.ActivityMainBinding
import com.example.googleplay.modal.ApplicationData
import com.example.googleplay.modal.CategoryData

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var binding: ActivityMainBinding
    private val categories by lazy { ArrayList<CategoryData>() }
    private val applications by lazy { ArrayList<ApplicationData>() }

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        val categoryAdapter = RVWSuperAdapter(categories)
        binding.rvCategory.adapter = categoryAdapter

    }

    private fun loadData() {
        applications.apply {
            add(ApplicationData("Instagram", "50mb",R.drawable.instagram ))
            add(ApplicationData("Whatsapp", "47mb", R.drawable.whatsapp))
            add(ApplicationData("Ebay", "61mb", R.drawable.ebay))
            add(ApplicationData("Music", "24mb",R.drawable.music))
            add(ApplicationData("Netflix", "30mb", R.drawable.netflix))
            add(ApplicationData("Zoom", "109mb", R.drawable.zoom))
            add(ApplicationData("Apple","100mb", R.drawable.apple))
            add(ApplicationData("Appstore","134mb", R.drawable.appstore))
            add(ApplicationData("McDonalds","165mb", R.drawable.mcdonalds))
            add(ApplicationData("Walmart","100mb", R.drawable.walmart))
        }

        categories.apply {
            add(CategoryData("For you", applications ))
            add(CategoryData("For child", applications))
            add(CategoryData("Top apps", applications))
            add(CategoryData("Books", applications))
            add(CategoryData("Super game", applications))
            add(CategoryData("Games", applications))
            add(CategoryData("Tools", applications))
        }


    }
}