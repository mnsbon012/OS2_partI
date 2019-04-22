package BarrierS;
import java.util.concurrent.Semaphore;

public class Barrier {

	int n;								// number of threads
	int count = 0;						// track number of threads arrived
	Semaphore mutex = Semaphore(1);		// exclusive access to count
	Semaphore barrier = Semaphore(0);	// locked till n threads have arrived
	
	// add missing variables
	
	Barrier(int n) {
		// complete this constructor
		this.n = n;
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		mutex.aquire();
			count = count + 1;
		mutex.release();

		if (count == n){
			barrier.release();
		}

		barrier.aquire();
		barrier.release();
	}
}





































