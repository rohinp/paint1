package com.rohin.paint

import org.junit.Test
import org.scalatest.Matchers._

class PixelTest {

  @Test
  def itShouldBeDefault(): Unit ={
    //given
    val co:Coordinate = (1,2)
    val pixel = Pixel(co)

    //when

    //then
    pixel shouldEqual DefaultPixel(co)
  }

  @Test
  def itShouldBeColouredPixel(): Unit ={
    //given
    val co:Coordinate = (1,2)
    val colour:Colour = 'x'
    val pixel = Pixel(co,colour)
    //when

    //then
    pixel shouldEqual ColouredPixel(co,colour)
  }

}
