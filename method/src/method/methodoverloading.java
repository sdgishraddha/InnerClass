package method;

public class methodoverloading {
	public void area(int i,int n)
    {
         System.out.println("Area of Triangle : "+(0.5*i*n));
    }
    public void area(int p) 
    {
         System.out.println("Area of Circle : "+(3.14*p*p));
    }

    public static void main(String args[])
   {

    	methodoverloading  q=new methodoverloading();
       q.area(10,12);
       q.area(5);  
   }
}




