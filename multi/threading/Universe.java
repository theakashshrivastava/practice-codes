package multi.threading;

public class Universe implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<5 ;i++ )
        {
            System.out.println("Universe");
        }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
    }
}
