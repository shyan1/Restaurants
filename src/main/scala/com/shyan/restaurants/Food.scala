package com.shyan.restaurants

trait Food {
  def name: String
}

class Vegetable(val name: String) extends Food {
  override def toString = s"Vegetable(${name})"
}

class Meat(val name: String) extends Food {
  override def toString: String = s"Meat(${name})"
}

class WhiteMeat(override val name: String) extends Meat(name) {
  override def toString = s"WhiteMeat(${name})"
}