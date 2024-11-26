package classIntroduction.test;

import classIntroduction.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.Nome = "Caio";
        pessoa.Idade = 22;
        pessoa.Sexo = "Masculino";

        System.out.println(pessoa.Nome);
        pessoa.falarNome(pessoa.Nome);
    }
}
