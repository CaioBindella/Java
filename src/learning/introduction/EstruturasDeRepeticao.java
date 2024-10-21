package learning.introduction;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 0;

        //usando o while
        while(count < 5){
            System.out.println("Iteração" + count);
            count++;
        }

        count = 0;
        //usando o laço do-while
        do{
            System.out.println("Iteração" + count);
            count++;
        }while(count < 5);

        //usando o laço for
        for(int i=0; i<10; i++){
            System.out.println("Iteração" + i);
        }
    }
}
