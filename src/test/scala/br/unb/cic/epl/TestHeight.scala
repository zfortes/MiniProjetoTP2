package br.unb.cic.epl
import br.unb.cic.MultiEval
import br.unb.cic.SubEval
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.Height

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestHeight extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter
{

  behavior of "An Height expression"

  var lit100: Eval.Literal = _
  var lit500: Eval.Literal = _

  var sum: AddEval.Add =_
  var sub: SubEval.Sub =_
  var mult: MultiEval.Multi =_

  before
  {
    lit100 = new Core.Literal(100) with Eval.Literal
    lit500 = new Core.Literal(500) with Eval.Literal

    sum = new AddEval.Add(lit100, lit500)
    sub = new SubEval.Sub(lit100, lit500)
    mult = new MultiEval.Multi(lit100, lit500)

  }

  it should "return Integer 2 when we call hei_sum.h_sum()" in
    {
      var hei_sum = new Height.Hei(sum.print())
      hei_sum.hei_sum()

      hei_sum.h_sum should be (2)
    }

  it should "return Integer 2 when we call hei_sub.h_sub()" in
    {
      var hei_sub = new Height.Hei(sub.print())
      hei_sub.hei_sub()

      hei_sub.h_sub should be (2)
    }

  it should "return Integer 2 when we call hei_mult.h_mult()" in
    {
      var hei_mult = new Height.Hei(mult.print())
      hei_mult.hei_mult()

      hei_mult.h_mult should be (2)
    }
}
