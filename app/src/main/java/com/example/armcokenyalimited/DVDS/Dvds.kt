package com.example.armcokenyalimited.DVDS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class Dvds : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<DvdSets>
    lateinit var dvdSetsImages: Array<Int>
    lateinit var dvdSetsProductName: Array<String>
    lateinit var dvdSetsProductDescription: Array<String>
    lateinit var dvdSetsAddToFavourite: Array<String>
    lateinit var dvdSetsAddToCart: Array<String>
    lateinit var dvdSetsBuyNow: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dvds)

        dvdSetsImages = arrayOf(
            R.drawable.dvd_mx755,
            R.drawable.dvd_mx405ac,
            R.drawable.dvd_mx625,
            R.drawable.dvd_mx455
        )

        dvdSetsProductName = arrayOf(
            " ARMCO DVD-DX755 - 5.1 Channel DVD Player",
            "ARMCO DVD-MX405AC - 2.1 Channel DVD Player.",
            "ARMCO DVD-MX625 - 2.1 Channel DVD Player.",
            "ARMCO DVD-MX455 - 2.1 Channel DVD Player."
        )

        dvdSetsProductDescription = arrayOf(
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description"

        )

        dvdSetsAddToFavourite = arrayOf(
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites"
        )

        dvdSetsAddToCart = arrayOf(
            "Add To Cart",
            "Add To Cart",
            "Add To Cart",
            "Add To Cart"
        )

        dvdSetsBuyNow = arrayOf(
            "Buy Now",
            "Buy Now",
            "Buy Now",
            "Buy Now"
        )

        recyclerView = findViewById(R.id.dvd_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList = arrayListOf<DvdSets>()

        getUserData()

    }

    private fun getUserData() {
        for (i in dvdSetsImages.indices) {

            val productDvdImageId = dvdSetsImages[i]
            val productDvdName = dvdSetsProductName[i]
            val productDvdDescription = dvdSetsProductDescription[i]
            val addDvdToFavourites = dvdSetsAddToFavourite[i]
            val addDvdToCart = dvdSetsAddToCart[i]
            val buyDvdNow = dvdSetsBuyNow[i]
            val dvdSets = DvdSets(productDvdImageId, productDvdName, productDvdDescription, false, addDvdToFavourites, false,
                addDvdToCart, false, buyDvdNow
            )

            arrayList.add(dvdSets)
        }
        recyclerView.adapter = DvdAdapter(this,arrayList)
    }
}