package method;

public class MethodDemo {

public int multipynumbers(int l,int m) {
	int k=l*m;
	return k;
}

public static void main(String[] args) {

	MethodDemo m=new MethodDemo();
	int sol= m.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+sol);
	}
}









