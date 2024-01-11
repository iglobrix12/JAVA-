import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task1 = new TimerTask() {
            public void run() {
                System.out.println("Привет");
            }
        };

        TimerTask task2 = new TimerTask() {
            public void run() {
                System.out.println("Меня зовут Иглобрюх");
            }
        };

        TimerTask task3 = new TimerTask() {
            public void run() {
                System.out.println("Я создал это");
            }
        };
        TimerTask task4 = new TimerTask() {
            public void run() {
                System.out.println("О нет ЭТО ВСЁ НА JAVA Я ЧТО НЕ РАЛЕН");
            }
        };
        TimerTask task5 = new TimerTask() {
            public void run() {
                System.out.println("Всё это бан)");
            }
        };
        TimerTask task6 = new TimerTask() {
            public void run() {
                System.out.println("Я хз зачем сделал это ну ладно мне было просто скучно так что ПОКА");
            }
        };
        TimerTask task7 = new TimerTask() {
            public void run() {
                System.exit(0);
            }
        };
        timer.schedule(task1, 2000);
        timer.schedule(task2, 4000);
        timer.schedule(task3, 6000);
        timer.schedule(task4, 8000);
        timer.schedule(task5, 10000);
        timer.schedule(task6, 12000);
        timer.schedule(task7, 15000);
    }
}