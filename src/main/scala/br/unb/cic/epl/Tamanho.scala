package br.unb.cic.epl

package object tamanho
{
  class tamanho (exp: String)
  {

    def tam_sum(exp: String)
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

      println(cont)
    }

    def tam_sub(exp: String)
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

      println(cont)
    }

    def tam_mult(exp: String)
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

      println(cont)
    }

  }

}
