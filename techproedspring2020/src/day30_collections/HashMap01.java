package day30_collections;

import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		//Create a HashMap, All maps use<Key,Value>
		HashMap<Integer,String>hashMap=new HashMap<Integer,String>();

	hashMap.put(1, "A");
	hashMap.put(3, "C");
	hashMap.put(2, "B");
	hashMap.put(5, "E");
	System.out.println(hashMap);//{1=A,2=B,3=C,5=E}
	
	//If you use same key more than once, java will accept the last one 
	//No compile time error, no run time time error for same keys
	hashMap.put(1, "X");
	System.out.println(hashMap);//{1=X,2=B,3=C,5=E}
	
	//For different keys you can use same values
	hashMap.put(6, "X");
	System.out.println(hashMap);//{1=X,2=B,3=C,5=E,6=X}
	
	//remove() method removes the element from HashMap
	hashMap.remove(11);//RETURNS TRUE OR FALSE, KEY 11 İS NOT EXİST remove()
	//cannot remove anything and returns false
	
	System.out.println(hashMap);//{2=B,3=C,5=E,6=X}
	
	hashMap.remove(6,"X");
	System.out.println(hashMap);//{2=B,3=C,5=E}
	
	//get() is used to get value by using key
	System.out.println(hashMap.get(3)); //C
	
	//keySet() method gives you all keys
	hashMap.keySet();
	System.out.println(hashMap.keySet()); //[2,3,5]
	
	//values() method gives you all values
	System.out.println(hashMap.values()); //[B,C,E]
	
	//size() method gives you the size
	System.out.println(hashMap.values()); //3
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
