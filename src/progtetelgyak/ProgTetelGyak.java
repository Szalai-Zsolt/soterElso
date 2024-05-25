
package progtetelgyak;


public class ProgTetelGyak {
    static int[] sorozat={5,8,12,43,64};
 
   
    public static void main(String[] args) {
       
        progTetelek();
    }
    
    private static void progTetelek() {
        osszegzes();
        megszamlalas();
        maximumKivalasztas();
        minimumKivalasztas();
        kivalasztas();
        eldontes_1_vanLegalabbEgy();
        eldontes_2_mind();
    }

   
    private static void osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
         kiir("a sorozat Összege: " + osszeg + "\n\n");
    }


    private static void megszamlalas() {
       int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] % 4 == 0) {
                osszeg++;
            }
        
    }
    kiir("A néggyel osztható számok darabszáma: " + osszeg + "\n\n");
}

    private static void maximumKivalasztas() {
       int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {

            if(sorozat[i] > sorozat[maxIndex]){
                maxIndex = i;
            }
      
        }
        kiir("a legnagyobb elem helye: " + maxIndex + "\n");
        kiir("a sorozat legnagyobb eleme: " + sorozat[maxIndex] + "\n\n");
    }

    private static void minimumKivalasztas() {
        
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[minIndex]){
                minIndex = i;
            }
        }
        kiir("a legkisebb elem helye: " + minIndex + "\n");
        kiir("a sorozat legkisebb eleme: " + sorozat[minIndex] + "\n\n");
    }
    
    private static void kiir(String eredmeny) {
        System.out.print(eredmeny);    
    }

    private static void kivalasztas() {
        int keresett=12;
        int i=0;
        
    }
    
     private static void eldontes_1_vanLegalabbEgy() {
        int N = sorozat.length;
        int ker = 43;
        int i = 0;
        while(i < N && !(sorozat[i] > ker)){
            i++;
        }
        boolean valasz = i < N;  
        int minIndex = i;
        
        if(valasz==true){
        kiir("A keresett elem helye: " + minIndex + "\n");
        } else {
        kiir("Nincs benne a keresett elem");
        }
    }
     private static void eldontes_2_mind() {
        int N = sorozat.length;
        int ker = -10;
        int i = 0;
        while(i < N && (sorozat[i] > ker)){
            i++;
        }
        boolean valasz = i >= N;  
         if (valasz==false){
        kiir("Az összes elem egyezik\n");
        } else {
        kiir("Nem azonos az összes");
        }
    }
}