import br.unb.cic.{Multi, MultiEval, SubEval}
import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.Tamanho

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new AddEval.Add(lit100, lit500)

  println(sum.print())
  var tam_sum = new Tamanho.Tamanho(sum.print())
  tam_sum.tam_sum()
  print("Tamanho = ")
  println(tam_sum.exp_sum)


  println(sum.eval())

  val mult = new MultiEval.Multi(lit100, lit500)

  println(mult.print())
  var tam_mult = new Tamanho.Tamanho(mult.print())
  tam_mult.tam_mult()
  print("Tamanho = ")
  println(tam_mult.exp_mult)

  println(mult.eval())

  val sub = new SubEval.Sub(lit100, lit500)

  println(sub.print())
  var tam_sub = new Tamanho.Tamanho(sub.print())
  tam_sub.tam_sub()
  print("Tamanho = ")
  println(tam_sub.exp_sub)


  println(sub.eval())


}
