package com.rolandoasmat.aji.ingredients

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rolandoasmat.aji.R
import kotlinx.android.synthetic.main.item_ingredient.view.*

class IngredientsAdapter: RecyclerView.Adapter<IngredientsAdapter.ViewHolder>() {

    private var ingredients: List<IngredientUIModel> = emptyList()

    fun setData(data: List<IngredientUIModel>) {
        this.ingredients = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_ingredient, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = ingredients.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ingredients[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val ingredientLabel = itemView.ingredientLabel
        private val ingredientAmountLabel = itemView.ingredientAmountLabel

        fun bind(ingredient: IngredientUIModel) {
            ingredientLabel.text = ingredient.title
            ingredientAmountLabel.text = ingredient.amount
        }
    }
}