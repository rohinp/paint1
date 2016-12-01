package com.rohin.paint

import org.junit.Test
import org.scalatest.Matchers._
class CanvasTest {

  @Test
  def itShouldCreateDefaultCanvas(): Unit ={
    //given
    val height=4
    val width=20

    val canvas= Canvas(height,width)
    //when

    //then

    canvas.pixels.foreach( y => y shouldEqual DefaultPixel(y.co) )
  }
}
