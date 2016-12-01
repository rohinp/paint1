package com.rohin.paint

trait Canvas {
  val pixels:List[Pixel]

}

case class DefaultCanvas(h:Int,w:Int) extends Canvas {
  override val pixels: List[Pixel] =
    (0 until h).map(hi=> (0 until w).map(wi=>Pixel((hi,wi))).toList).toList.flatten

}


object Canvas{

  def apply(h:Int,w:Int): Canvas = DefaultCanvas(h,w)

}
