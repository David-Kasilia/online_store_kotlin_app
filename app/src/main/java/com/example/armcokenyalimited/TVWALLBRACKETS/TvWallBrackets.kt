package com.example.armcokenyalimited.TVWALLBRACKETS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class TvWallBrackets : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var arrayList : ArrayList<TvWallBracketsSets>
    lateinit var tvWallBracketsImages : Array<Int>
    lateinit var tvWallBracketsProductName : Array<String>
    lateinit var tvWallBracketsProductDescription : Array<String>
    lateinit var tvWallBracketsAddToFavourite : Array<String>
    lateinit var tvWallBracketsAddToCart : Array<String>
    lateinit var tvWallBracketsBuyNow : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_wall_brackets)

        tvWallBracketsImages = arrayOf(
            R.drawable.abk_007,
            R.drawable.abk_001w_result,
            R.drawable.abk_008,
            R.drawable.abk_306,
            R.drawable.abk_006
        )

        tvWallBracketsProductName = arrayOf(
            "ARMCO ABK-007H - LCD/LED Wall mount - HORIZONTAL FLAT 32\"-65\" ",
            "ARMCO ABK-001W - LCD/LED - Wall mount - FLAT 19-42 inches ",
            "ARMCO ABK-008WT - LCD/LED Wall mount - FLAT 10-42\" ",
            "ARMCO ABK-306 - LCD/LED Wall mount 5 in 1 Kit - FLAT 26-50\" with Tilt ",
            "ABK-006W - LCD/LED - Wall mount - FLAT 10-24\" "
        )

        tvWallBracketsProductDescription = arrayOf(
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description",
            "Product Description"
        )

        tvWallBracketsAddToFavourite = arrayOf(
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
            "Add To Favourites",
        )

        tvWallBracketsAddToCart = arrayOf(
            "Add To Cart",
            "Add To Cart",
            "Add To Cart",
            "Add To Cart",
            "Add To Cart"
        )

        tvWallBracketsBuyNow = arrayOf(
            "Buy Now",
            "Buy Now",
            "Buy Now",
            "Buy Now",
            "Buy Now"

        )

        recyclerView = findViewById(R.id.tv_wall_brackets_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList = arrayListOf<TvWallBracketsSets>()

        getUserData()

    }

    private fun getUserData() {

        for (i in tvWallBracketsImages.indices) {

            val productTvWallBracketsImageId = tvWallBracketsImages[i]
            val productTvWallBracketsName = tvWallBracketsProductName[i]
            val productTvWallBracketsDescription = tvWallBracketsProductDescription[i]
            val addTvWallBracketToFavourites = tvWallBracketsAddToFavourite[i]
            val addTvWallBracketToCart = tvWallBracketsAddToCart[i]
            val buyTvWallBracketNow = tvWallBracketsBuyNow[i]
            val tvWallBracketsSets = TvWallBracketsSets(productTvWallBracketsImageId, productTvWallBracketsName, productTvWallBracketsDescription,
                false, addTvWallBracketToFavourites , false, addTvWallBracketToCart , false,
                buyTvWallBracketNow)

            arrayList.add(tvWallBracketsSets)

        }
        recyclerView.adapter = TvWallBracketsAdapter(this,arrayList)
    }
}
