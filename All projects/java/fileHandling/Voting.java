class UnderAgeException extends Exception 
{
	UnderAgeException(){
	super("You are Under Age");
	}
	UnderAgeException(String msg){  
	super(msg);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class Voting {
public static void main(String args[]) {
	
	int age=27;
	try{
		if(age<18){
	throw new UnderAgeException();
		}
		else{
		System.out.println("You can vote now");
		}
	}
	catch(UnderAgeException e){
	e.printStackTrace();
	}
}
}

