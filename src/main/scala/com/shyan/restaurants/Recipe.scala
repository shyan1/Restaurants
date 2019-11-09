package com.shyan.restaurants

trait Recipe[+A] {
  def name: String

  def ingredients: List[A]
}

case class GenericRecipe(ingredients: List[Food]) extends Recipe[Food] {
  override def name: String = s"Generic recipe based on ${ingredients.map(_.name)}"
}

case class MeatRecipe(ingredients: List[Meat]) extends Recipe[Meat] {
  override def name: String = s"Meat recipe based on ${ingredients.map(_.name)}"
}

case class WhiteMeatRecipe(ingredients: List[WhiteMeat]) extends Recipe[WhiteMeat] {
  override def name: String = s"WhiteMeat recipe base on ${ingredients.map(_.name)}"
}