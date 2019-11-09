package com.shyan.restaurants

object App {
  def main(args: Array[String]): Unit = {

    val chicken = new WhiteMeat("Chicken")
    val turkey = new WhiteMeat("Turkey")
    val beef = new Meat("Beef")
    val carrot = new Vegetable("Carrot")
    val pumpkin = new Vegetable("Pumpkin")


    val mixRecipe = new GenericRecipe(List(chicken, turkey, beef, carrot, pumpkin))
    val meatRecipe = new MeatRecipe(List(chicken, turkey, beef))
    val whiteMeatRecipe = new WhiteMeatRecipe(List(chicken, turkey))


    val giuseppe = new WhiteMeatChef
    giuseppe.cook(whiteMeatRecipe)

    val alfredo = new MeatChef
    alfredo.cook(meatRecipe)
    alfredo.cook(whiteMeatRecipe)

    val mario = new GenericChef
    mario.cook(mixRecipe)
    mario.cook(meatRecipe)
    mario.cook(whiteMeatRecipe)

    new MeatRestaurant(List(meatRecipe), alfredo)
    new MeatRestaurant(List(whiteMeatRecipe), mario)

    new GenericRestaurant(List(mixRecipe, meatRecipe, whiteMeatRecipe), mario)
    new WhiteMeatRestaurant(List(whiteMeatRecipe), mario)
    new WhiteMeatRestaurant(List(whiteMeatRecipe), giuseppe)
    new WhiteMeatRestaurant(List(whiteMeatRecipe), alfredo)

  }
}
