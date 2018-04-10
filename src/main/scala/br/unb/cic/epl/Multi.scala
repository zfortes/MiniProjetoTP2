package br.unb.cic

import br.unb.cic.epl.Core

package object Multi {
  trait GMulti extends Core.Expression {
    type T <: Core.Expression
    var lhs: T = _
    var rhs: T = _
    override def print(): String = "(" + lhs.print() + " * " + rhs.print() + ")"
  }

  class Multi(l: Core.Expression, r: Core.Expression) extends GMulti {
    type T = Core.Expression

    lhs = l
    rhs = r

  }
}
