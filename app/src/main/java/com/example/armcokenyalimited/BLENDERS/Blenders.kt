package com.example.armcokenyalimited.BLENDERS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class Blenders : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<BlendersSets>
    lateinit var blenderSetsImages: Array<Int>
    lateinit var blenderSetsProductName: Array<String>
    lateinit var blenderSetsProductDescription: Array<String>
    lateinit var blenderSetsAddToFavourite: Array<String>
    lateinit var blenderSetsAddToCart: Array<String>
    lateinit var blenderSetsBuyNow: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blenders)

        blenderSetsImages = arrayOf(

            R.drawable.abl_722sx_420x_result,
            R.drawable.abl_395eco_420x_result,
            R.drawable.abl_792dx_420x_result,
            R.drawable.abl_355eco_420x_result,
            R.drawable.abl_325eco_420x_result,
            R.drawable.abl_742rx_420x_result,
        )

        blenderSetsProductName = arrayOf(

            "ARMCO ABL-722SX, 1.5L Blender, Unbreakable PC Jar.",
            "ARMCO ABL-395ECO, 1.5L Blender, 2 Plastic Jars, Mill.",
            "ARMCO ABL-792DX 1.5L Blender, 2 Unbreakable PC Jars, Mill.",
            "ARMCO ABL-355ECO 1.5L Blender, Mill.",
            "ARMCO ABL-325ECO 1.5L Blender, 350W.",
            "ARMCO ABL-742RX, 1.5L Blender, Unbreakable PC Jar, Mill."

        )

        blenderSetsProductDescription = arrayOf(

            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description"
        )

        blenderSetsAddToFavourite = arrayOf(

            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
        )

        blenderSetsAddToCart = arrayOf(

            "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart", "Add To Cart",
        )

        blenderSetsBuyNow = arrayOf(

            "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now", "Buy Now",
        )

        recyclerView = findViewById(R.id.blenders_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList = arrayListOf<BlendersSets>()

        getUserData()

    }

    private fun getUserData() {

        for (i in blenderSetsImages.indices) {

            val productBlenderImageId = blenderSetsImages[i]
            val productBlenderName = blenderSetsProductName[i]
            val productBlenderDescription = blenderSetsProductDescription[i]
            val addBlenderToFavourites = blenderSetsAddToFavourite[i]
            val addBlenderToCart = blenderSetsAddToCart[i]
            val buyBlenderNow = blenderSetsBuyNow[i]
            val blenderSets = BlendersSets(
                productBlenderImageId, productBlenderName, productBlenderDescription, false, addBlenderToFavourites,
                false, addBlenderToCart, false, buyBlenderNow
            )

            arrayList.add(blenderSets)

        }

        recyclerView.adapter = BlendersAdapter(this, arrayList)
    }
}