package exercise12;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Clock implements Runnable {
    private final LocalDateTime time;
    private final String reminder;

    public Clock(LocalDateTime time, String reminder) {
        this.time = time;
        this.reminder = reminder;
    }

    @Override
    public void run() {

        long targetEpoch = time.toEpochSecond(ZoneOffset.UTC);

        while (true) {

            long nowEpoch = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
            LocalDateTime now = LocalDateTime.ofInstant(Instant.ofEpochSecond(nowEpoch), ZoneId.systemDefault());
            System.out.println(now);

            if (nowEpoch >= targetEpoch) {
                System.out.println(reminder + "!");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
