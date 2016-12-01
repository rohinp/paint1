package com.rohin.paint

import org.junit.Test
import org.scalatest.Matchers._

class ShapeTest {

  @Test
  def itShouldCreateHorizontalIncLine: Unit ={
    //given
    val x1y1:Coordinate=(5,5)
    val x2y2:Coordinate=(5,10)

    //when
    val line:Shape= Shape.line(x1y1,x2y2,'x')

    //then
    line.pixels === (5 until 10).map(e => Pixel((5,e),'x')).toList
  }

}
