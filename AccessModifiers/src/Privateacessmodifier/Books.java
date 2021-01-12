package Privateacessmodifier;

class Books {
	
	private int num=25;
	private void subject()
	{
		System.out.println("Hindi,English,Science,Social Science");
	}

}
 class Mathbook{
	public static void main(String[] args)
	{
		Books obj=new Books();
		System.out.println(obj.num);//compile time error can not access private members from outside the class
	    obj.subject();//compile time error can not access private members from outside the class
	}
}