package the_singleton_pattern;

public class Main {

	public static void main(String[] args) {

		var singletonOne = Singleton.getInstance();
		
		var singletonTwo = Singleton.getInstance();
		
		if (singletonOne.equals(singletonTwo)) {
			System.out.print("the same objects");
		}
	}

}
