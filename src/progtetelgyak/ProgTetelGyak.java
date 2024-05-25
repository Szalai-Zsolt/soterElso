
package progtetelgyak;


public class ProgTetelGyak {
    static int[] sorozat={5,8,12,43,64};
    static int osszeg;
   
    public static void main(String[] args) {
       
        osszegzes();
        kiir();
        megszamlalas();
        kiir();
    }

   
    private static void osszegzes() {
        osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
    }

    private static void kiir() {
        System.out.printf("A tomb elemeinek osszege: %d\n", osszeg );    
    }

    private static void megszamlalas() {
       osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] % 4 == 0) {
                osszeg++;
            }
    }
    
}
}
