package classIntroduction.calculator;

import java.util.Scanner;

public class calculadora01 {
    public static void main(String[] args) {
        // Criação do Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando entrada de um número inteiro
        System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite um número inteiro: ");
        int num2 = scanner.nextInt();

        String operation = "multiplicacao";

        //Atribuindo metodos para calculadora
        Metodos calculadora = new Metodos();


        switch (operation){
            case "soma": System.out.println(calculadora.Soma(num1, num2));
                        break;
            case "subtracao": System.out.println(calculadora.Subtracao(num1, num2));
                                break;
            case "multiplicacao": System.out.println(calculadora.Multiplicacao((float) num1, (float) num2));
                break;
        }

    }
}
