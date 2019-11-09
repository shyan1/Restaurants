package com.shyan.restaurants

/**
 * Since Chef is contravariant, Chef[Food] is a subclass of Chef[Meat] that is
 * a subclass of Chef[WhiteMeat].
 */
trait Chef[-A] {

  def specialization: String

  def cook(recipe: Recipe[A]): String
}

class GenericChef extends Chef[Food] {
  override def specialization: String = "All food"

  override def cook(recipe: Recipe[Food]): String =
    s"I made a ${recipe.name}"
}

class MeatChef extends Chef[Meat] {
  override def specialization: String = "Meat"

  override def cook(recipe: Recipe[Meat]): String =
    s"I made a ${recipe.name}"
}

class WhiteMeatChef extends Chef[WhiteMeat] {
  override def specialization: String = "WhiteMeat"

  override def cook(recipe: Recipe[WhiteMeat]): String =
    s"I made a ${recipe.name}"
}
