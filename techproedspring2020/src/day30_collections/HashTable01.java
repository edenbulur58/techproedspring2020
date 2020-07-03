package day30_collections;

import java.util.Hashtable;

public class HashTable01 {

	public static void main(String[] args) {
		// Create a HashTable
		Hashtable<Integer,String>hashTable=new Hashtable<Integer,String>();

		//Add elements
		hashTable.put(2, "X");
		hashTable.put(50, "M");
		hashTable.put(91, "Y");
		hashTable.put(7, "V");
		System.out.println(hashTable);
		
		//If you use null as a key, you will get NullPointerException
		//hasTable.put((null,"R");
		
		//If you use null as a value, you will get NullPointerException
				//hasTable.put(8,"null");
		
		//clear() method removes everything from the HashTable
		hashTable.clear();
		System.out.println(hashTable);
		
		
	}

}
