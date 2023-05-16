package com.example.armcokenyalimited.BLENDERS

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.armcokenyalimited.R

class BlendersAdapter(val context: Context, var blenderSetsList: ArrayList<BlendersSets>) : RecyclerView.Adapter<BlendersAdapter.BlendersViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlendersViewHolder {

        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item_products, parent, false)
        return BlendersViewHolder(itemView)

    }

    override fun onBindViewHolder(blendersViewHolder: BlendersViewHolder, position: Int) {

        val blenderSets = blenderSetsList[position]
        blendersViewHolder.setData(blenderSets, position)

    }

    override fun getItemCount(): Int = blenderSetsList.size

    inner class BlendersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentPosition = -1
        private var currentBlendersSets: BlendersSets? = null

        private val productBlenderName = itemView.findViewById<TextView>(R.id.productName)
        private val productBlenderImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val BlenderFavourites = itemView.findViewById<ImageView>(R.id.addToFavourites)
        private val textBlenderFavourites = itemView.findViewById<TextView>(R.id.favourites)
        private val addBlenderToCart = itemView.findViewById<ImageView>(R.id.addToCart)
        private val BlenderCart = itemView.findViewById<TextView>(R.id.cart)
        private val buyBlenderNowImage = itemView.findViewById<ImageView>(R.id.buyNowImage)
        private val buyBlenderNow = itemView.findViewById<TextView>(R.id.buyNow)


        private val FavouriteFilledImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_black_24dp, null)
        private val BorderedFavouriteImage = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_favorite_border_black_24dp, null)
        private val AddToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_add_shopping_cart_black_24dp, null)
        private val AddedToCart = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_shopping_cart_black_24dp, null)
        private val BuyProductNow = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_paid_black_24dp, null)
        private val ProductBought = ResourcesCompat.getDrawable(context.resources, R.drawable.baseline_store_black_24dp, null)


        fun setData(blenderSets: BlendersSets, position: Int) {
            this.currentPosition = position
            this.currentBlendersSets = blenderSets

            productBlenderName.text = blenderSets.productBlenderName
            productBlenderImage.setImageResource(blenderSets.productBlenderImageId)
            textBlenderFavourites.text = blenderSets.addBlenderToFavourites
            BlenderCart.text = blenderSets.addBlenderToCart
            buyBlenderNow.text = blenderSets.buyBlenderNow


            if (blenderSets.isBlenderFavourite)
                BlenderFavourites.setImageDrawable(FavouriteFilledImage)
            else
                BlenderFavourites.setImageDrawable(BorderedFavouriteImage)

            if (blenderSets.isBlenderAddToCart)
                addBlenderToCart.setImageDrawable(AddedToCart)
            else
                addBlenderToCart.setImageDrawable(AddToCart)


            if (blenderSets.isBlenderBuyNow)
                buyBlenderNowImage.setImageDrawable(BuyProductNow)
            else
                buyBlenderNowImage.setImageDrawable(ProductBought)

        }
    }
}