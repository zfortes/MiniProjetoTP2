package br.unb.cic.epl
import br.unb.cic.MultiEval

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMulti extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Multi expression"

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  before {
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal
  }

  it should "return String (100 * 200) when we call Multi(Literal(100), Literal(200).print())" in {
    val multi = new MultiEval.Multi(literal100, literal200)
  
    multi.print() should be ("(100 * 200)")
  }

  it should "return 20000 when we call call Multi(Literal(100), Literal(200)).eval()" in {
    val multi = new MultiEval.Multi(literal100, literal200)

    multi.eval() should be (20000)
  }
}
