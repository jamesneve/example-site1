package controllers

import play.api._
import play.api.mvc._

import models.Recipe

class RecipesController extends Controller {
  def index = Action {
    val recipe1 = Recipe("Curried Chickpeas", "http://www.bbcgoodfood.com/recipes/1108641/curried-chickpeas")
    val recipe2 = Recipe("Bean burgers", "http://www.bbcgoodfood.com/recipes/9978/mexican-bean-burgers-with-lime-yogurt-and-salsa")
    val recipe3 = Recipe("Gucamole", "http://www.simplyrecipes.com/recipes/perfect_guacamole/")
    val recipes = Seq(recipe1, recipe2, recipe3)

    Ok(views.html.recipes.index(recipes))
  }
}
