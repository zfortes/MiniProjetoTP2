package br.unb.cic

import br.unb.cic.epl.Core

package object Sub {
  trait GSub extends Core.Expression {
    type T <: Core.Expression
    var lhs: T = _
    var rhs: T = _
    override def print(): String = "(" + lhs.print() + " - " + rhs.print() + ")"
  }

  class Sub(l: Core.Expression, r: Core.Expression) extends GSub {
    type T = Core.Expression

    lhs = l
    rhs = r

  }
}
