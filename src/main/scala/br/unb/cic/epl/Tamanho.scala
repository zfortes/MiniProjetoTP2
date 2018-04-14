package br.unb.cic.epl

package object Tamanho
{
  class Tamanho (exp: String)
  {
    var exp_sum = 0
    var exp_sub = 0
    var exp_mult = 0

    def tam_sum(any: Any)
    {
      var i = 0
      var f = exp.length()
      var cont = 1

      while (i < f)
      {

        if (exp(i) == '+')
        {
          cont += 1
        }

        i += 1
      }

      exp_sum = cont
    }

    def tam_sub(any: Any)
    {
      var i = 0
      var f = exp.length()
      var cont = 1

      while (i < f)
      {

        if (exp(i) == '-')
        {
          cont += 1
        }

        i += 1
      }

      exp_sub = cont
    }

    def tam_mult(any: Any)
    {
      var i = 0
      var f = exp.length()
      var cont = 1

      while (i < f)
      {

        if (exp(i) == '*')
        {
          cont += 1
        }

        i += 1
      }

      exp_mult = cont
    }

  }

  class T_Arvore (op: AddEval.Add)
  {

    def tam_arvore(any: Any):Int =
    {
      var c = 0
      if (op != null )
      {
        tam_arvore(op.lhs)
        tam_arvore(op.rhs)

        c += 1
      }

      return c
    }




  }
}
