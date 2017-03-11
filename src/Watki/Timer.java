package Watki;

public class Timer extends Thread{
    @Override
    public void run() {
        int time=0;
        while (true){
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Wątek zliczania czasu został przerwany");
                return;
            }
            time++;
            int minutes = time/60;
            int sec= time%60;
            System.out.println(minutes + " : " + sec);


        }
    }
}
