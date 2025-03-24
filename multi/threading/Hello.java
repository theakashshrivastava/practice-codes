package multi.threading;

public class Hello {
    public static void main(String[] args) throws InterruptedException, IllegalThreadStateException {
        World world = new World();
        Universe universe = new Universe();
        Thread thread = new Thread(universe);
        thread.start();
        world.setDaemon(true);
        world.start();
        for(int i=0; i<5 ;i++ )
        {
            System.out.println("Hello");
            Thread.sleep(1000);
            System.out.println(thread.getState());
            thread.join();
            System.out.println(thread.getState());
        }
    }
}
