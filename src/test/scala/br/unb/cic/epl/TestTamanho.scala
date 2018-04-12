package br.unb.cic.epl
import br.unb.cic.MultiEval
import br.unb.cic.SubEval
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.Tamanho

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestTamanho extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter
{

  behavior of "An Tamanho expression"

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

  it should "return Integer 2 when we call tam_sum.exp_sum()" in
    {
      var tam_sum = new Tamanho.Tamanho(sum.print())
      tam_sum.tam_sum()

      tam_sum.exp_sum should be (2)
    }

  it should "return String 2 when we call tam_sub.exp_sub()" in
    {
      var tam_sub = new Tamanho.Tamanho(sub.print())
      tam_sub.tam_sub()

      tam_sub.exp_sub should be (2)
    }

  it should "return String 2 when we call tam_mult.exp_mult()" in
    {
      var tam_mult = new Tamanho.Tamanho(mult.print())
      tam_mult.tam_mult()

      tam_mult.exp_mult should be (2)
    }
}
