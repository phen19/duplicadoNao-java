import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] frutas = {"Mamão", "Limão", "Kiwi", "Uva"};
        String[] frutas2 = {"Uva","Morango", "Melão", "Manga"};
        ArrayList<String> repeated = new ArrayList<String>();
        for (int i =0; i < frutas.length; i++){
            for(int j = 0; j< frutas.length; j++){
                if(frutas[i].equals(frutas2[j])){
                    repeated.add(frutas[i]);
                }
            }
        }
        System.out.print(repeated);
    }
}
