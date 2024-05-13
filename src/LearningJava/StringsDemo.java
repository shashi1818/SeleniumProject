package LearningJava;

public class StringsDemo {

	public static void main(String[] args) {
		// string is an object that represents sequence of characters
		String name = "Shashi Keerthan Chigulla";
		String[] newString = name.split(" "); //spilts based on the provided delimeter
		for (int i=0; i< newString.length;i++) {
			System.out.println(newString[i]);
		}
		
		String[] newString2 = name.split("K"); //spilts based on the provided delimeter
		for (int i=0; i< newString2.length;i++) {
			System.out.println(newString2[i]);
		}
	}

}
