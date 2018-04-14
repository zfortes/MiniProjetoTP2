package br.unb.cic.epl

package object Height
{
  class Hei(exp: String)
  {
    var h_exp = 0
    var h_sub = 0
    var h_mult = 0

    def hei_exp(any: Any)
    {
      var i = 0
      var f = exp.length()
      var cont = 1

      i = 0
      f = exp.length()
      cont = 1
      while (i < f)
      {

        if (exp(i) == '+' || exp(i) == '-' || exp(i) == '*')
        {
          cont += 1
        }

        i += 1
      }

      h_exp = cont
    }
    //metodos abaixo não são utilizados
    def hei_sub(any: Any)
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

      h_sub = cont
    }

    def hei_mult(any: Any)
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

      h_mult = cont
    }

  }

  class T_Arvore (op: AddEval.Add)
  {

    def tam_arvore(any: Any):Int =
    {
      var c = 0
      if (op.lhs != null)
      {
        c += 1
      }

      if (op.rhs != null)
      {
        c += 1
      }

      return c
    }
  }
}
