package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nombres = {4,7,2,9,1};
        int [] nombre2 = {-8,-2,-10};
        int [] nombre3 = {2,4,4,7,3,6,8,3,1-2,-10};
    System.out.println(max(nombres));
    System.out.println(countientDoublon(nombres));
    System.out.println(max(nombre2));
    System.out.println(countientDoublon(nombre2));
    System.out.println(countientDoublon(nombre3));
    System.out.println(compterOccurrences(nombre3,2));
    String texte = "mmohaa";
    System.out.println(texte.charAt(2));
    System.out.println(premierUnique(texte));

    }
    public static int max (int [] nombres ){
   int n =nombres[0];
   for (int i = 0; i < nombres.length; i++){

       if (n < nombres[i]){
           n = nombres[i];
       }
   }
    return n;
    }
    public static int compterOccurrences(int[] nombres, int cible){
        int count = 0;
        for(int i = 0 ; i< nombres.length; i++){
            if(nombres[i] == cible){
                count++;
            }

        }
        return count;
    }
    public static boolean countientDoublon (int [] nombre){
        int temp = nombre[0];
        int count ;
        for (int i =1; i < nombre.length; i++){
            count = 0;
            for (int j = 0; j< nombre.length;j++){
                if(nombre[i]== nombre[j]){
                    count++;
                    if(count >= 2 ){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int premierUnique(String texte){
        int a ;
        for (int i = 0; i < texte.length() ; i++){
            a = 0;
            for (int j = 0; j < texte.length() ;j++){

                if(texte.charAt(i) == texte.charAt(j)){
                    a ++;
                }
            }
            if (a == 1){
                return i;
            }
        }
        return -1;
    }
}