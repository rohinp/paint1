package com.rohin.paint

trait Pixel{
  val co:Coordinate
  val colour:Colour = ' '
}


case class DefaultPixel(co:Coordinate) extends Pixel
case class ColouredPixel(co:Coordinate, override val colour:Colour) extends Pixel

object Pixel {
  def apply(co: Coordinate): Pixel = DefaultPixel(co)
  def apply(co: Coordinate, c:Colour): Pixel = ColouredPixel(co,c)
}
