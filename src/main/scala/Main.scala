import br.unb.cic.{Multi, MultiEval, SubEval}
import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.Height

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new AddEval.Add(lit100, lit500)

  println(sum.print())

  var hei_sum = new Height.Hei(sum.print())
  hei_sum.hei_sum()
  print("Altura = ")
  println(hei_sum.h_sum)

  println(sum.eval())
  //var tam_arv_sum = new Tamanho.T_Arvore(sum)
  //println(tam_arv_sum.tam_arvore(sum))

  val mult = new MultiEval.Multi(lit100, lit500)

  println(mult.print())
  var hei_mult = new Height.Hei(mult.print())
  hei_mult.hei_mult()
  print("Altura = ")
  println(hei_mult.h_mult)

  println(mult.eval())

  val sub = new SubEval.Sub(lit100, lit500)

  println(sub.print())
  var hei_sub = new Height.Hei(sub.print())
  hei_sub.hei_sub()
  print("Altura = ")
  println(hei_sub.h_sub)


  println(sub.eval())


}
