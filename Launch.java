
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= Thread.currentThread();
		System.out.println(t);
		t.setName("Soumya");
		System.out.println(t);
		t.setPriority(2);
		System.out.println(t);

	}

}
