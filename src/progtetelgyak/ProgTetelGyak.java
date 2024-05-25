
package progtetelgyak;


public class ProgTetelGyak {
    static int[] sorozat={5,8,12,43,64};
   
    public static void main(String[] args) {
       
        osszegzes();
        
    }

   
    private static void osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
    }
    
}
