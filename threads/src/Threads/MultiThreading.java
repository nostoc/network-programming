package Threads;
// we cannot extend the Thread class to any other classes
public class MultiThreading extends Thread {
    private int thread_num;
    public MultiThreading(int t){
        this.thread_num=t;
    }

    public void run(){
        for(int i=0;i<=5;i++){
           System.out.println(i+" is from thread number :"+thread_num);
           if(thread_num == 2)
               throw new RuntimeException();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
