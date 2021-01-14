package method;

public class callingMethod {
	

		int num=150;

		int operation(int num) {
			num =num*10/100;
			return(num);
		}

		public static void main(String args[]) {
			callingMethod  obj= new callingMethod();
			System.out.println("Before operation value of data is "+obj.num);
			obj.operation(100);
			System.out.println("After operation value of data is "+obj.num);
			}
		}



