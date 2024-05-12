package LearningJava;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=18;
		System.out.println(num+" this is my favourite number");
		//string formating
		System.out.println(String.format("%d this is my favourite number",num)); 
		
		//Arrays and for loop
		int[] array1 = new int[5]; 
		array1[0]=10; array1[1]=20; array1[2]=30; array1[3]=40; array1[4]=50;
		for (int i=0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		String[] cars = {"BMW", "Creta", "Ferari", "Nano"};
		for (int i=0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		//while loop
		int val=0;
		while(val < array1.length && val < cars.length) {
			System.out.println(String.format("Array1 [%d] = ",val)+array1[val]);
			val++;
		}
		
		//Enhanced For loop
		for(String s:cars) {
			System.out.println(s);
		}
		
	}

}
