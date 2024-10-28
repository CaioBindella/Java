package learning.introduction;

public class Arrays {
    public static void main(String[] args) {
        int[] listaIdades = new int[10]; //primeiro modo de inicializar um array
        int[] numeros = {1, 2, 3, 4, 5}; //outro jeito de inicializar um array
        int[] numeros2 = new int[]{1, 2, 3, 4, 5}; //outro jeito de inicializar um array

        for(int i=0; i<listaIdades.length; i++){
            listaIdades[i] = i;
            System.out.println(listaIdades[i]);
        }

        String[] listaNomes = new String[1];

        listaNomes[0] = "Caio";

        System.out.println(listaNomes[0]);
    }
}
