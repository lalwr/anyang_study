/**
 * Created by admin on 2015-10-15.
 */
public class Lighting implements AlarmListener{

    @SuppressWarnings("unused")
    private Subject sensorSystem;

    public Lighting(Subject sensorSystem){
        this.sensorSystem = sensorSystem;
        sensorSystem.registerAlarmListener(this);
    }

    public Lighting() {

    }

    public void alarm(String alarmSource, int level) {
        System.out.println(alarmSource + "만큼 불들을 킨다.");
        System.out.println(level + "쪽의 불들을 반드시 킨다.");
    }
}
