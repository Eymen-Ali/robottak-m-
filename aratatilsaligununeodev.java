import java.util.Random;

public class aratatilsaligununeodev {
    public static void main(String[] args){
        Random rand  = new Random();

        int[] liste = new int[50];
        for(int i=0;i<liste.length;i++){
            liste[i] = rand.nextInt(0,100);
        }
        int[] siralanmis = new int[liste.length];
        for(int a = 0; a < liste.length; a++){
            int sinir = 999999;
            for(int b = 0; b < liste.length; b++){
                if (liste[b] < sinir){
                    sinir = liste[b];
                }
            }
            siralanmis[a] = sinir;
            for(int b = 0; b < liste.length; b++){
                if(liste[b] == sinir){
                    liste[b] = 999999;
                    break;

                }

            }
        }
        for(int c : siralanmis) {
            System.out.println(c);
        }






















    }
}


















