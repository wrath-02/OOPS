package oops;
class factorial{
	private int number;
	public void setNumber(int number) {
		this.number=number;
		return;
	}
	
	public int getNumber() {
		System.out.print("The factorial of the "+number+" is ");
		System.out.println(fact(number));
		return 1;
	}
	
	public int fact(int number) {
		if(number==0)
			return 1;
		return number*fact(number-1);
	}
	
}

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		factorial ans=new factorial();
		ans.setNumber(6);
		ans.getNumber();
		
	}

}
