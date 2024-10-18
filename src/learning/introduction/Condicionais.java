package learning.introduction;

public class Condicionais {
    public static void main(String[] args) {
        int price = 3000;
        boolean thisPriceIsGood = price > 1000;

        if(thisPriceIsGood){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //operador ternário
        //(condition) ? true : false;

        String firstString = "Good";
        String secondString = "Bad";

        String result = (thisPriceIsGood) ? firstString : secondString;

        System.out.println(result);

        //switch case

        int dia = 1;
        switch (dia){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Saturday");
        }
    }
}
