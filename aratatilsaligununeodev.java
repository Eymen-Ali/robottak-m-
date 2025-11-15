public class aratatilsaligununeodev {
    public static void main(String[] args){

        int[] liste = {37, 4, 82, 59, 11, 96, 73, 28, 65, 17, 53, 88, 92, 41, 6, 30, 79, 2, 45, 51, 23, 13, 57, 67, 48, 99, 9, 71, 60, 85, 19, 31, 44, 33, 50, 26, 8, 97, 12, 70, 81, 39, 61, 64, 25, 3, 90, 56, 68, 15};
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

                }

            }
        }
        for(int c : siralanmis) {
            System.out.println(c);
        }


















