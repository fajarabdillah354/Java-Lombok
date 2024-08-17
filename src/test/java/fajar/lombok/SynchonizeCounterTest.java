package fajar.lombok;

import ch.qos.logback.core.joran.conditional.ThenAction;
import org.junit.jupiter.api.Test;

public class SynchonizeCounterTest {

    private Counter counter = new Counter();

    @Test
    void testRaceCondition() throws InterruptedException {

        //ini akan mengakibatkan race condition dimana, hasil program adalah 100x100 yaitu 10000 namun ada banyak perulangan yang mencoba mengakses thread yang sama sehingga terjadilah race condition


        //cara untuk mengatasinya adalah kita menambahkan annotation @Syschoronize pada class Counter
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                new Thread(() -> {
                    counter.increment();
                }).start();
            }
        }

        Thread.sleep(5_000L);
        System.out.println(counter.getCounter());

    }


    @Test
    void testSynchorizedCounter() throws InterruptedException {


        // Setelah ditambahkan @Syschronize maka tidak terjadi raca condition

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                new Thread(() -> {
                    counter.increment();
                }).start();
            }
        }

        Thread.sleep(5_000L);
        System.out.println(counter.getCounter());

    }
}
