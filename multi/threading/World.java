package multi.threading;

public class World extends Thread{
    @Override
    public void run() {
        for(int i=0; i<20 ;i++ )
        {
            System.out.println("World");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.yield();
        }
    }
}
