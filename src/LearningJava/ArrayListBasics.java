package LearningJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		// ArrayList - size is not fixed like Arrays.
		ArrayList arrList= new ArrayList();  // generic
		arrList.add("shashi");
		arrList.add(5);
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		
		
		System.out.println("---------------");
		ArrayList<String> names = new ArrayList<String>();
		names.add("shashi");
		names.add("pedro");
		System.out.println(names.getFirst());
		System.out.println(names.get(1));
		
		// to add multiple elements at once
		System.out.println("---------------");
		names.addAll(Arrays.asList("rin", "ninja", "kamui"));
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//converting arrays to arrayList
		System.out.println("---------------");
		String[] fruits = {"Banana", "Apple","grapes"};
		List convertedToArrList = Arrays.asList(fruits);
		System.out.println(convertedToArrList.contains("Apple"));
		System.out.println(convertedToArrList.contains("kiwi"));

	}

}
