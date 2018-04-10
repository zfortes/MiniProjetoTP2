package br.unb.cic

import br.unb.cic.epl.Eval

package object MultiEval {
  class Multi(l: Eval.Expression, r: Eval.Expression) extends Multi.GMulti with Eval.Expression {
    type T = Eval.Expression
    lhs = l
    rhs = r

    override def eval(): Int = lhs.eval() * rhs.eval()
  }
}
