import java.time.Duration;
import java.time.LocalDateTime;

public class Stopwatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    Stopwatch(){
    startTime=java.time.LocalDateTime.now();
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void start(){
        startTime=java.time.LocalDateTime.now();
    }
    public void end(){
        endTime=java.time.LocalDateTime.now();
    }
    public Duration getElapsedTime(){
        Duration duration=Duration.between(startTime, endTime);
        return duration;
    }
}
