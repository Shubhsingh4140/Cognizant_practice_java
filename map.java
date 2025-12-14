// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer> mp=new HashMap<>();
          LinkedHashMap<Character,Integer> lmp=new LinkedHashMap<>();
            TreeMap<Character,Integer> tmp=new TreeMap<>();
            HashSet<Character> set=new HashSet<>();
             LinkedHashSet<Character> lset=new LinkedHashSet<>();
              TreeSet<Character> tset=new TreeSet<>();
              Stack<Character> st=new Stack<>();
              Queue<Character> que=new LinkedList<>();
              
             
        
        String s="Shubhankar";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            lmp.put(ch,lmp.getOrDefault(ch,0)+1);
               tmp.put(ch,tmp.getOrDefault(ch,0)+1);
               set.add(ch);
               lset.add(ch);
               tset.add(ch);
               st.push(ch);
               que.add(ch);
            
        }
        
        System.out.println(mp);
         System.out.println(lmp);
         System.out.println(tmp);
          System.out.println(tmp.isEmpty());
                                 set.remove('S');
           System.out.println(set);
                      System.out.println(lset);
                                 System.out.println(tset);
                                System.out.println(tset.isEmpty());
                                  System.out.println(st);
                                   System.out.println(st.peek());
          st.pop();
          System.out.println(st);
           System.out.println(st.empty());
                     System.out.println(que);
                               System.out.println(que.peek());
                               que.remove();
                                System.out.println(que);
                                  for(Map.Entry e:mp.entrySet()){
            System.out.println(e.getKey()+"---"+e.getValue());
        }
        System.out.println();
          for(Map.Entry e:lmp.entrySet()){
            System.out.println(e.getKey()+"---"+e.getValue());
        }
                System.out.println();
          for(Map.Entry e:tmp.entrySet()){
            System.out.println(e.getKey()+"---"+e.getValue());
        }
         System.out.println(mp.size());
                               
        
    }
}
