import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
       String s="Hello";
       HashMap<Character,Integer> mp=new HashMap<>();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           mp.put(ch,mp.getOrDefault(ch,0)+1);
           
       }
       System.out.println(mp);
       for(Map.Entry<Character,Integer> e:mp.entrySet())
       {
           System.out.println(e.getKey()+"--"+e.getValue());
       }
       
    }
}
