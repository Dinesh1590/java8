package practise;

public class Task1 implements Runnable {

    private String threadNo;

    public Task1(String no){
        this.threadNo = no;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start execution. Thread No = "+threadNo);

        processThread();

        System.out.println(Thread.currentThread().getName()+" stop execution.");
    }
    private void processThread() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String toString(){
        return this.threadNo;
    }
}
