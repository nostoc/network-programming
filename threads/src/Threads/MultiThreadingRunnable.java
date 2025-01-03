package Threads;
// best approach is to use Runnable interface
// can extend runnable class to any other sub classes.
public class MultiThreadingRunnable implements Runnable {
    private int thread_num;
    public MultiThreadingRunnable(int t){
        this.thread_num=t;

    }
    public void run(){ //implementation of run method
        for(int i=0;i<=5;i++){
            System.out.println(i+" is from thread number :"+thread_num);
//            if(thread_num == 2)
//                throw new RuntimeException();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
