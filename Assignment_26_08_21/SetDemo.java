package Assignment_26_08_21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(12);
		hashSet.add(9);
		hashSet.add(24);
		hashSet.add(10);
		
		System.out.println(hashSet);
		
//		System.out.println("------------ using index ");
//        for(int i = 0 ; i < hashSet.size(); i++){
//            System.out.println(hashSet.get(i));
//        }
        System.out.println("------------ using for each ");
        for (Integer x : hashSet){
            System.out.println(x);
        }
        System.out.println("------------ using Iterator ");

        Iterator<Integer> it = hashSet.iterator();// we should not edit collection
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n +" "+n);
        }
        System.out.println("------------ using lambda expression ");
        hashSet.forEach(System.out::println);
        ArrayListDemo obj = new ArrayListDemo();

        hashSet.forEach(obj::f1);

//        hashSet.add(0,100);
//        System.out.println(hashSet);

        hashSet.remove(0);
        System.out.println(hashSet);

        hashSet.remove (new Integer((10)));
        System.out.println(hashSet);

        hashSet.clear();
        System.out.println(hashSet);
		
	}

}
