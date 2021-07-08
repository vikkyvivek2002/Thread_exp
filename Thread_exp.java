public class Thread_exp extends Thread
 {
public void run()
{
	System.out.println("this thread is running");
}
	public static void main(String[] args) {
		Thread_exp t = new Thread_exp();
		t.start();
		// this line is used to call the objects in one line.
 new Thread_exp().start();
	}

}
