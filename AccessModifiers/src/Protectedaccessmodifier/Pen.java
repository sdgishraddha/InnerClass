package Protectedaccessmodifier;
import Test1package.*;

class Pen extends colour{

	public static void main(String[] args) {
		Pen obj=new Pen();//package is declared as protected, so it can be accessed from outside the class
		obj.msg();

	}

}
