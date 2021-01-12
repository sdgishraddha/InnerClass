package Defaultacessmodifier;
import Testpackage.*;

public class Collectionbook {

	public static void main(String[] args) {

		Test t=new Test();//compile time error , class is not public, so it cannot be accessed from outside the package
		t.display();//compile time error  
	}

}
