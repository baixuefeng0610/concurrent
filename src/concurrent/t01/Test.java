package concurrent.t01;

import java.util.concurrent.TimeUnit;

public class Test {
    private static int count = 1;
    public static void getConnetion(){
            synchronized(Test.class){
                try {
                    System.out.println(Thread.currentThread().getName()
                            + " count = " + count);
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        public static void getmEssaage(){
        for(int i =0; i<100;i++){
            System.out.println(Thread.currentThread().getName()+":"
                    + i);
        }

        }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Test.getmEssaage();
//                Test.getConnetion();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Test.getmEssaage();
//                Test.getConnetion();
            }
        }).start();
    }
}
