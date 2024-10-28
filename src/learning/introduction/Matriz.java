package learning.introduction;

public class Matriz {
    public static void main(String[] args) {
        String[][] NomeMeses = new String[3][2];

        String[] Nome = {"Janeiro", "Fevereiro", "Março"};

        for(int i=0; i< 2; i++){
            for(int j=0; j<3; j++){
               NomeMeses[j][i] = Nome[j];
                System.out.println(NomeMeses[j][i]);
            }
        }
    }
}
