package com.rolandoasmat.aji.network

import com.rolandoasmat.aji.model.Plate
import com.rolandoasmat.aji.model.RecipeDetails
import retrofit2.Response

class MockAjiNetworkAPI: AjiNetworkAPI {
    override fun fetchFeaturedPlate(): Response<Plate> {
        val lomoSaltado = Plate(
            1,
            "Lomo Saltado",
            "https://images-gmi-pmc.edge-generalmills.com/7bbcdd09-3380-4117-951b-1c8098ca984e.jpg",
            "https://images-gmi-pmc.edge-generalmills.com/7bbcdd09-3380-4117-951b-1c8098ca984e.jpg")
        return Response.success(lomoSaltado)
    }

    override fun fetchBreakfastPlates(): Response<List<Plate>> {
        val chicharron = Plate(
            2,
            "Sandwich de Chicharron",
            "https://i0.wp.com/exitosanoticias.pe/v1/wp-content/uploads/2020/04/panc2.jpg",
        "https://i0.wp.com/exitosanoticias.pe/v1/wp-content/uploads/2020/04/panc2.jpg")
        val tamal = Plate(
            3,
            "Tamal",
            "https://www.comeperuano.pe/wp-content/uploads/2020/03/tamales-2.jpg",
            "https://www.comeperuano.pe/wp-content/uploads/2020/03/tamales-2.jpg")
        val empanada = Plate(
            4,
            "Empanada",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-190807-empanadas-0105-landscape-pf-1566245422.jpg?crop=1.00xw:0.752xh;0,0.180xh&resize=1200:*",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-190807-empanadas-0105-landscape-pf-1566245422.jpg?crop=1.00xw:0.752xh;0,0.180xh&resize=1200:*")
        val plates = listOf(chicharron, tamal, empanada)
        return Response.success(plates)
    }

    override fun fetchDinnerPlates(): Response<List<Plate>> {
        val lomoSaltado = Plate(
            5,
            "Lomo Saltado",
            "https://images-gmi-pmc.edge-generalmills.com/7bbcdd09-3380-4117-951b-1c8098ca984e.jpg",
            "https://images-gmi-pmc.edge-generalmills.com/7bbcdd09-3380-4117-951b-1c8098ca984e.jpg")
        val ajiDeGallina = Plate(
            6,
            "Ají de Gallina",
            "https://okdiario.com/img/2018/10/10/receta-de-aji-de-gallina-655x368.jpg",
            "https://okdiario.com/img/2018/10/10/receta-de-aji-de-gallina-655x368.jpg")
        val tallarinesVerdes = Plate(
            7,
            "Tallarines Verdes",
            "https://i2.wp.com/decomidaperuana.com/wp-content/uploads/2018/04/tallarines-verdes-receta-peruana.png",
            "https://i2.wp.com/decomidaperuana.com/wp-content/uploads/2018/04/tallarines-verdes-receta-peruana.png")
        val arrozChaufa = Plate(
            8,
            "Arroz Chaufa",
            "https://www.gourmet.cl/wp-content/uploads/2019/04/Arroz-chaufa-edit-2.jpg",
            "https://www.gourmet.cl/wp-content/uploads/2019/04/Arroz-chaufa-edit-2.jpg")
        val arrozConPollo = Plate(
            19,
            "Arroz con Pollo",
            "https://www.recetips.com/uploads/recetas_ce89af3170d309eea9addbf67a3bc639.jpg",
            "https://www.recetips.com/uploads/recetas_ce89af3170d309eea9addbf67a3bc639.jpg")
        val plates = listOf(lomoSaltado, ajiDeGallina, tallarinesVerdes, arrozChaufa, arrozConPollo)
        return Response.success(plates)

    }

    override fun fetchAppetizerPlates(): Response<List<Plate>> {
        val ceviche = Plate(
            9,
            "Ceviche",
            "https://cevicheperuano.net/wp-content/uploads/2018/12/ceviche-de-pescado_700x465.jpg",
            "https://cevicheperuano.net/wp-content/uploads/2018/12/ceviche-de-pescado_700x465.jpg")
        val anticuchos = Plate(
            10,
            "Anticuchos",
            "https://e.rpp-noticias.io/normal/2018/11/12/252825_709013.jpg",
            "https://e.rpp-noticias.io/normal/2018/11/12/252825_709013.jpg")
        val papaHuancaina = Plate(
            11,
            "Papa a la Huancaina",
            "https://www.whats4eats.com/files/vegetables-papa-huancaina-wikimedia-AgainErick-4x3.jpg",
            "https://www.whats4eats.com/files/vegetables-papa-huancaina-wikimedia-AgainErick-4x3.jpg")
        val causa = Plate(
            12,
            "Causa",
            "https://www.seriouseats.com/2018/07/20180702-peruvian-causa-vicky-wasik-21-625x469.jpg",
            "https://www.seriouseats.com/2018/07/20180702-peruvian-causa-vicky-wasik-21-625x469.jpg")
        val plates = listOf(ceviche, anticuchos, papaHuancaina, causa)
        return Response.success(plates)
    }

    override fun fetchDessertPlates(): Response<List<Plate>> {
        val alfajor = Plate(
            13,
            "Alfajor",
            "https://jameaperu.com/wp-content/uploads/2020/03/alfajores_700x465.jpg",
            "https://jameaperu.com/wp-content/uploads/2020/03/alfajores_700x465.jpg")
        val arrozConLeche = Plate(
            14,
            "Arroz con Leche",
            "https://carolinarice.com/wp-content/uploads/2019/05/Arroz-Con-Leche-Cinnamon-Sticks.jpg",
            "https://carolinarice.com/wp-content/uploads/2019/05/Arroz-Con-Leche-Cinnamon-Sticks.jpg")
        val picarones = Plate(
            15,
            "Picarones",
            "https://www.vikingcruises.com/oceans/images/Peruvian_Picarones_1009x385_tcm13-157153.jpg",
            "https://www.comeperuano.pe/wp-content/uploads/2020/02/Picarones-peruanos.jpg")
        val mazamorra = Plate(
            16,
            "Mazamorra Morada",
            "https://perudelights.com/wp-content/uploads/2012/07/DSC058141-1024x565.jpg",
            "https://perudelights.com/wp-content/uploads/2012/07/DSC058141-1024x565.jpg")
        val plates = listOf(alfajor, arrozConLeche, picarones, mazamorra)
        return Response.success(plates)
    }

    override fun fetchDrinks(): Response<List<Plate>> {
        val pisco = Plate(
            17,
            "Pisco Sour",
            "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe_images/pisco-sour.jpg?itok=qwqQe8hb",
            "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe_images/pisco-sour.jpg?itok=qwqQe8hb")
        val chicha = Plate(
            18,
            "Chicha Morrada",
            "https://smartsexypaleo.com/wp-content/uploads/2020/05/chicha-morada-purple-sweet-traditional-peruvian-corn-drink_101123-465.jpg",
            "https://smartsexypaleo.com/wp-content/uploads/2020/05/chicha-morada-purple-sweet-traditional-peruvian-corn-drink_101123-465.jpg")
        val plates = listOf(pisco, chicha)
        return Response.success(plates)
    }

    override fun fetchRecipeDetails(id: Int): Response<RecipeDetails> {
        val id = 1234
        val title = "Test Recipe"
        val ingredients = listOf("1 clove of garlic", "the tear of a crocodile", "5 grains of rice", "Kobe beef fed salmon", "apple")
        val steps = listOf("1 clove of garlic", "the tear of a crocodile", "5 grains of rice", "Kobe beef fed salmon", "apple")
        return Response.success(RecipeDetails(id,  title, ingredients, steps))
    }

}