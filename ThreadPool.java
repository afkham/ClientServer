import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Dilsi
 */
public class ThreadPool {

    public static void main(String[] args) {
         int pool_size=Integer.parseInt(args[0]);
        ExecutorService executor = Executors.newFixedThreadPool(pool_size);
        if (5<=pool_size && pool_size<=10){
        int n=Integer.parseInt(args[1]);
        for (int i = 1; i < n+1; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("All the threads are finished");
    }
            else{
            System.out.println("Thread pool size is mismatched");
}
    }

}