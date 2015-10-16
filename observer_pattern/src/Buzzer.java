/**
 * Created by admin on 2015-10-15.
 */
public class Buzzer implements AlarmListener {

    @SuppressWarnings("unused")
    private Subject sensorSystem;

    public Buzzer(Subject sensorSystem){
        this.sensorSystem = sensorSystem;
        sensorSystem.registerAlarmListener(this);
    }

    public Buzzer() {

    }

    public void alarm(String alarmSource, int level) {
        System.out.println(level + "만큼 경보음을 발생한다.");
        System.out.println(alarmSource + "쪽의 경보장치 볼륨을 최대한 높인다.");
    }
}
