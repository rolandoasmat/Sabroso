package com.rolandoasmat.aji.recipe_details

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.navArgs
import com.google.android.material.tabs.TabLayoutMediator
import com.rolandoasmat.aji.AjiApplication
import com.rolandoasmat.aji.R
import com.rolandoasmat.aji.ViewModelFactory
import com.rolandoasmat.aji.services.ImageLoader
import kotlinx.android.synthetic.main.fragment_recipe_details.*
import javax.inject.Inject

class RecipeDetailsFragment: Fragment() {

    @Inject lateinit var viewModelFactory: ViewModelFactory
    private val viewModel: RecipeDetailsViewModel by activityViewModels { viewModelFactory }

    private val args: RecipeDetailsFragmentArgs by navArgs()
    private val viewPagerAdapter by lazy { RecipeDetailsViewPagerAdapter(this) }
    private val tabNames = listOf("Ingredients", "Steps")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity?.applicationContext as? AjiApplication)?.component()?.inject(this)
        viewModel.fetchRecipeDetails(args.recipeIDArg)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_recipe_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
        observeViewModel()
    }
    private fun setupViewPager() {
        viewPager?.adapter = viewPagerAdapter
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = tabNames[position]
        }.attach()
    }

    private fun observeViewModel() {
        viewModel.details.observe(viewLifecycleOwner) {
            Log.v("RAA", it.toString())
            (activity as? AppCompatActivity)?.supportActionBar?.title = it.title
            ImageLoader.load(it.posterURL, poster)
            description?.text = it.description
            viewPagerAdapter.setIngredients(it.ingredients)
        }
    }

}