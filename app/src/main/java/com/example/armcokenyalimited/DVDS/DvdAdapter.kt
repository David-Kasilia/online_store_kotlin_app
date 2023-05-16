package com.example.armcokenyalimited.DVDS

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class DvdAdapter ( val context: Context, var DvdSetsList : ArrayList<DvdSets>) : RecyclerView.Adapter<DvdAdapter.DvdViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DvdViewHolder {

        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item_products, parent, false)
        return DvdViewHolder(itemView)

    }

    override fun onBindViewHolder(dvdViewHolder: DvdViewHolder, position: Int) {

        val dvdSets = DvdSetsList[position]
        dvdViewHolder.setData(dvdSets, position)

    }

    override fun getItemCount(): Int = DvdSetsList.size

    inner class DvdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentPosition = -1
        private var currentDvdSets: DvdSets? = null

        private val productDvdName = itemView.findViewById<TextView>(R.id.productName)
        private val productDvdImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val Dvdfavourites = itemView.findViewById<ImageView>(R.id.addToFavourites)
        private val textDvdFavourites = itemView.findViewById<TextView>(R.id.favourites)
        private val addDvdToCart = itemView.findViewById<ImageView>(R.id.addToCart)
        private val Dvdcart = itemView.findViewById<TextView>(R.id.cart)
        private val buyDvdNowImage = itemView.findViewById<ImageView>(R.id.buyNowImage)
        private val buyDvdNow = itemView.findViewById<TextView>(R.id.buyNow)


        private val FavouriteFilledImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_black_24dp, null)
        private val BorderedFavouriteImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_border_black_24dp, null)
        private val AddToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_add_shopping_cart_black_24dp, null)
        private val AddedToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_shopping_cart_black_24dp, null)
        private val BuyProductNow = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_paid_black_24dp, null)
        private val ProductBought = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_store_black_24dp, null)


        fun setData(dvdSets: DvdSets, position: Int) {
            this.currentPosition = position
            this.currentDvdSets = dvdSets

            productDvdName.text = dvdSets.productDvdName
            productDvdImage.setImageResource(dvdSets.productDvdImageId)
            textDvdFavourites.text = dvdSets.addDvdToFavourites
            Dvdcart.text = dvdSets.addDvdToCart
            buyDvdNow.text = dvdSets.buyDvdNow


            if (dvdSets.isDvdFavourite)
                Dvdfavourites.setImageDrawable(FavouriteFilledImage)
            else
                Dvdfavourites.setImageDrawable(BorderedFavouriteImage)

            if (dvdSets.isDvdAddToCart)
                addDvdToCart.setImageDrawable(AddedToCart)
            else
                addDvdToCart.setImageDrawable(AddToCart)


            if (dvdSets.isDvdBuyNow)
                buyDvdNowImage.setImageDrawable(BuyProductNow)
            else
                buyDvdNowImage.setImageDrawable(ProductBought)

        }
    }

}