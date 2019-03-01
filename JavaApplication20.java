/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
import java.util.*;

/**
 *
 * @author CIT
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
  //-------------------HASHSET EXAMPLE--------------------------------
        // Create a HashSet 
        HashSet<String> hset = new HashSet<String>(); 
  
        // add elements to HashSet 
        hset.add("AP"); 
        hset.add("Assignment"); 
  
        // Duplicate removed 
        hset.add("AP"); 
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : hset) { 
            System.out.println(temp); 
        }
  //-------------------TREESET EXAMPLE--------------------------------      
        TreeSet<String> tset = new TreeSet<String>(); 
  
        // add elements to HashSet 
        tset.add("AP A2"); 
        tset.add("Assignment"); 
  
        // Duplicate removed 
        tset.add("AP A2"); 
        String str= tset.ceiling("AP A2");
        // Displaying TreeSet elements 
        System.out.println("TreeSet contains: ");  
        for (String temp : tset) { 
            System.out.println(temp); 
    }
        
        System.out.println("Ceiling returns: "+ str);
   //-------------------SORTEDSET EXAMPLE--------------------------------
        SortedSet<Integer> s1= new TreeSet<Integer>();
        s1.add(76);
        s1.add(25);
        System.out.println("Sorted Set: "+s1);
        System.out.println("Sorted set headset: "+ s1.headSet(76));
        
        
   //-------------------ARRAYLIST EXAMPLE--------------------------------
   
        ArrayList <Integer> a  = new ArrayList <Integer>();
        a.add(2);
        a.add(1);
        a.add(9);
        System.out.println("ArrayList: "+a);
        
        int ind= a.indexOf(9);
        
        System.out.println("ArrayList indexOf: "+ind);
    //-------------------VECTOR EXAMPLE--------------------------------
    Vector v = new Vector();
        v.add(1); 
        v.add("Assignment"); 
        v.add(3); 
         System.out.println("Vector: "+v);
         v.clear();
         System.out.println("After clearing Vector: "+v);
         
         
    //-------------------ARRAY EXAMPLE--------------------------------
    int arr[]=new int[5];//declaration and instantiation  
    arr[0]=10;//initialization  
    arr[1]=20;  
    arr[2]=70;  
    arr[3]=40;  
    arr[4]=50;  
    System.out.println("Array contains: ");
         
    for(int i=0;i<arr.length;i++)//length is the property of array  
    System.out.println(arr[i]);  
        
    
        
    //-------------------LINKEDLIST EXAMPLE--------------------------------
    LinkedList llist = new LinkedList(); 
    llist.add(1);
    llist.add(5);
    llist.add(2);
    
    System.out.println("LinkedList: "+llist);  
    llist.removeFirst();
    System.out.println("After removing first: "+llist);  
    
           
    //-------------------LIST EXAMPLE--------------------------------
    
    
        List <Integer> l  = new ArrayList <Integer>();
        l.add(2);
        l.add(1);
        l.add(9);
        System.out.println("List: "+l);
        l.remove(2);
        System.out.println("Updated List: "+l);
        
     //-------------------SET EXAMPLE--------------------------------
       
        Set<String> s3= new TreeSet<String>();
        s3.add("second");
        s3.add("first");
        System.out.println("Set: "+s3);
        s3.toArray();
      
      //-------------------NAVIGABLE MAP EXAMPLE--------------------------------
     
      NavigableMap<String, Integer> n= new TreeMap<String, Integer>();
      n.put("A", 34);
       n.put("P", 98);
        n.put("E", 57);
        System.out.println("NavigableMap: "+ n);
        System.out.println("NavigableMap key: "+ n.firstKey());
        
        
       //-------------------NAVIGABLE SET EXAMPLE--------------------------------
      
       NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(0); 
        ns.add(1); 
        ns.add(2); 
        
        System.out.println("Navigable set: "+ ns);       
        System.out.println("Navigable descendingSet: "+ ns.descendingSet());

    }  
} 
    

