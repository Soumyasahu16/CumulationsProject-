
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
