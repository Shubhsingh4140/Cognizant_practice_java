import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(98);
         ar.add(982);
          ar.add(198);
           ar.add(398);
            ar.add(598);
            System.out.println(ar);
            Collections.sort(ar);
             System.out.println(ar);
              Collections.reverse(ar);
              System.out.println(ar);
              System.out.println(ar.size());
              ar.set(1,5);
                System.out.println(ar);
              Collections.sort(ar);
                  int x=Collections.binarySearch(ar,5);
                          System.out.println(x);
                  
              
              
        
       
         
          

        
          
        
        
        
     
       
    }
}
