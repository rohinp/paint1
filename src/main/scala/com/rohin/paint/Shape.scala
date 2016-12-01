package com.rohin.paint

trait Shape {
  val pixels:List[Pixel]
}

case class Line(x1y1:Coordinate,x2y2:Coordinate,c:Colour) extends Shape {
  override val pixels: List[Pixel] =(x1y1._2 until x2y2._2).map(y=>Pixel((x1y1._1,y),c)).toList
}

object Shape {
  def line(x1y1:Coordinate,x2y2:Coordinate,c:Colour):Shape = Line(x1y1,x2y2,c)

}
