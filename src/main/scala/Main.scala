import br.unb.cic.{Multi, MultiEval, SubEval}
import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.tamanho

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new AddEval.Add(lit100, lit500)


  println(sum.print())
  var tam_sum = new tamanho.tamanho(sum.print())
  tam_sum.tam_sum(sum.print())

  println(sum.eval())

  val mult = new MultiEval.Multi(lit100, lit500)

  println(mult.print())
  var tam_mult = new tamanho.tamanho(mult.print())
  tam_mult.tam_mult(mult.print())
  println(mult.eval())

  val sub = new SubEval.Sub(lit100, lit500)

  println(sub.print())
  var tam_sub = new tamanho.tamanho(sub.print())
  tam_sub.tam_sum(sub.print())
  println(sub.eval())



}
