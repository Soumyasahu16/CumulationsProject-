import java.util.Scanner;
class InvalidDataException extends Exception
{
	public InvalidDataException(String msg)
	{
		super(msg);
	}
}
class SingleOne implements Runnable
{
	int ac;
	public void customer1()throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please give Account number");
		int ac=sc.nextInt();
		String temp=ac+"";
	    if(temp.length()==5)
	    {
	    	System.out.println("welcome for banking");
	    }
	    else
	    {
	    	InvalidDataException e=new InvalidDataException("False Account Number");
	    	throw e;
	    }
		}
	public void checkBalance()
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
	  if(b>5000) {
		  System.out.println("you are rich");
	  }
	  else
	  {
		  System.out.println("you are poor");
	  }
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(name.equals("Customer"))
		{
			try
			{
			  customer1();
		    }
		  catch(Exception e)
		  {
			System.out.println(e.getMessage());
		   }
			finally
			{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		else if(name.equals("balance"))
		{
			checkBalance();
		}
		 
		 }
	
}
public class Second
{
 public static void main(String[] ss)
 {
	 SingleOne s1=new SingleOne();
	 SingleOne s2=new SingleOne();
	 Thread t1=new Thread(s1);
	 Thread t2=new Thread(s2);
	 t1.setName("Customer");
	 t2.setName("balance");
	 t2.setDaemon(true);
	 t2.setPriority(3);
	 t1.start();
	 t2.start();
	 
 }
}
