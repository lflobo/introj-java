package pt.lobo.introj.lang.esssential;

/**
 * The {@link NumberThread} class extends the {@link Thread} class and overrides
 * it's run() method, which is invoked during it's execution.
 */
public class NumberThread extends Thread {

	// Holds the number of iterations for the loop
	private int count;

	/**
	 * The constructor receives as it's only parameter the number of
	 * iterations in the loop
	 * @param count The number of iterations
	 */
	public NumberThread(int count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=0; i<count; i++)
			System.out.println("I am '" + getId() + "' - I counted to " + i);
	}
	
	// make this class executable
	public static void main(String[] args) {
		int numberOfThreads = 5;
		int countsPerThread = 5;
		
		// Create numberOfThreads threads
		for(int t=0; t<numberOfThreads; t++)
			// pass the iteration count to the constructor
			new NumberThread(countsPerThread).start();
	}
	
}
