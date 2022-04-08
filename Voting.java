import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public  InvalidAgeException(String msg)
	{
		super(msg);
	}
}
public class Voting {
	private int age=18;
	int a;
	public void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	}
	public void verifier()throws InvalidAgeException
	{
		if(a>=age)
		{
			System.out.println("Allowed To Vote");
		}
		else
		{
			throw new InvalidAgeException("you are not allowded");
		}
	}

}
public class NewOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting v=new Voting();
		v.takeInput();
		try {
		v.verifier();
			}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		}

}



