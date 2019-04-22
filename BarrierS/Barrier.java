// Bonnie Mansvelt
// MNSBON012


package BarrierS;
import java.util.concurrent.Semaphore;
import java.util.Timer;

public class Barrier {

	int n;								// number of threads
	int count = 0;						// track number of threads arrived
	Semaphore mutex = new Semaphore(1);		// exclusive access to count
	Semaphore barrier = new Semaphore(0);	// locked till n threads have arrived
	Timer timer =  new Timer();

	// add missing variables
	
	Barrier(int n) {
		// complete this constructor
		this.n = n;
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		mutex.acquire();
		count = count + 1;
		mutex.release();

		if (n<0){
			barrier.release();
		}

		if (count == n){
			barrier.release();
		}

		barrier.acquire();
		barrier.release();
	}
}



