import br.unb.cic.{Multi, MultiEval, SubEval}
import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.AddEval


object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new AddEval.Add(lit100, lit500)

  println(sum.print())
  println(sum.eval())

  val mult = new MultiEval.Multi(lit100, lit500)

  println(mult.print())
  println(mult.eval())

  val sub = new SubEval.Sub(lit100, lit500)

  println(sub.print())
  println(sub.eval())

}
