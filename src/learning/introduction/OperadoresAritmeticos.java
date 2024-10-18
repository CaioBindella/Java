package learning.introduction;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // + - / *
        int number1 = 100;
        int number2 = 10;
        int result = number1 - number2;

        System.out.println(result);

        // %
        int rest = 21 % 7;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isBigger = 20 > 10;
        boolean isTheSame = 20 == 10;

        System.out.println(isTheSame);
        System.out.println(isBigger);

        // && (AND), || (or), ! (not)

        boolean andTest = (number1 > 1) && (number2 < 50);
        boolean orTest = (number1 > 1) || (number2 < 10);
        System.out.println(andTest);
        System.out.println(orTest);

        // = += -= *= /= %=
        int finalNumber = 88;
        finalNumber += number2;

        System.out.println(finalNumber);

        // ++
        int count = 0;
        count++;

        System.out.println(count);
    }
}
