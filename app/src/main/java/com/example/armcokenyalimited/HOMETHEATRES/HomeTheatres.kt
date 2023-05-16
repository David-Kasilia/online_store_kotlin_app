package com.example.armcokenyalimited.HOMETHEATRES

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class HomeTheatres : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<HomeTheatreSets>
    lateinit var homeTheatreSetsImages: Array<Int>
    lateinit var homeTheatreSetsProductName: Array<String>
    lateinit var homeTheatreSetsProductDescription: Array<String>
    lateinit var homeTheatreSetsAddToFavourite: Array<String>
    lateinit var homeTheatreSetsAddToCart: Array<String>
    lateinit var homeTheatreSetsBuyNow: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_theatres)

        homeTheatreSetsImages = arrayOf(

            R.drawable.aht_8245tb,
            R.drawable.aht_5360,
            R.drawable.aht_zx30a,
            R.drawable.aht_8075,
            R.drawable.aht_4560,
            R.drawable.aht_8105,
            R.drawable.aht_8090tb,
            R.drawable.aht_10325tb,
            R.drawable.aht_10350tb,
            R.drawable.aht_6565tb,
            R.drawable.aht_6580tb,
        )

        homeTheatreSetsProductName = arrayOf(

            "ARMCO AHT-8245TB - 5.1 Ch, 8.0 Inch Tall Boy Sub Woofer.",
            "ARMCO AHT-5360 - 2.1 Ch. 116W, 5.25 Inch Sub Woofer.",
            "ARMCO AHT-ZX30A - 2.1 Channel, 6.5 Inch Sub Woofer.",
            "ARMCO AHT-8075TB - 2.1 Channel, 8.0 Inch Speaker Sub Woofer.",
            "ARMCO AHT-4560 - 2.1 Ch. 106W, 4.5 Inch Speaker Sub Woofer",
            "ARMCO AHT-8105TB - 4.1 Ch. , 8.0 Inch Speaker Sub Woofer.",
            "ARMCO AHT-8090TB - 3.1 Channel, 8.0 Inch Speaker Tall Boy Sub Woofer.",
            "ARMCO AHT-10325TB - 5.1 Ch, 10.0 Inch Speaker - 400W, 14,000W PMPO, Tall Boy Sub Woofer.",
            "ARMCO AHT-10350TB - 5.1 Ch, 10.0 Inch Speaker - 430W, 15,000W PMPO, Tall Boy Sub Woofer.",
            "ARMCO AHT-6565TB - 2.1 Ch. 126W, 6.5 Inch Speaker Tall Boy Sub Woofer.",
            "ARMCO AHT-6580TB - 3.1. Channel, 6.5 Inch Speaker Tall Boy Sub Woofer"

        )

        homeTheatreSetsProductDescription = arrayOf(

            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description"
        )

        homeTheatreSetsAddToFavourite = arrayOf(

            "Add To Favourites", "Add To Favourites", "Add To Favourites", "Add To Favourites", "Add To Favourites",
            "Add To Favourites", "Add To Favourites", "Add To Favourites", "Add To Favourites", "Add To Favourites",
            "Add To Favourites"
        )

        homeTheatreSetsAddToCart = arrayOf(

            "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart",
            "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart"
        )

        homeTheatreSetsBuyNow = arrayOf(

            "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now",
            "Buy Now", "Buy Now",
        )

        recyclerView = findViewById(R.id.home_theatre_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList = arrayListOf<HomeTheatreSets>()

        getUserData()

    }

    private fun getUserData() {
        for (i in homeTheatreSetsImages.indices) {

            val productHomeTheatresImageId = homeTheatreSetsImages[i]
            val productHomeTheatresName = homeTheatreSetsProductName[i]
            val productHomeTheatresDescription = homeTheatreSetsProductDescription[i]
            val addHomeTheatresToFavourites = homeTheatreSetsAddToFavourite[i]
            val addHomeTheatresToCart = homeTheatreSetsAddToCart[i]
            val buyHomeTheatresNow = homeTheatreSetsBuyNow[i]
            val homeTheatreSets = HomeTheatreSets(
                productHomeTheatresImageId,
                productHomeTheatresName,
                productHomeTheatresDescription,
                false,
                addHomeTheatresToFavourites,
                false,
                addHomeTheatresToCart,
                false,
                buyHomeTheatresNow
            )

            arrayList.add(homeTheatreSets)
        }

        recyclerView.adapter = HomeTheatresAdapter(this, arrayList)
    }
}
