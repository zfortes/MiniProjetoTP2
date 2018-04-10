package br.unb.cic

import br.unb.cic.epl.Eval

package object SubEval {
  class Sub(l: Eval.Expression, r: Eval.Expression) extends Sub.GSub with Eval.Expression {
    type T = Eval.Expression
    lhs = l
    rhs = r

    override def eval(): Int = lhs.eval() - rhs.eval()
  }
}
