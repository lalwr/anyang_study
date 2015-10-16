/**
 * Created by admin on 2015-10-16.
 */
public class Copcall implements AlarmListener{

    @SuppressWarnings("unused")
    private Subject sensorSystem;

    public Copcall(Subject sensorSystem){
        this.sensorSystem = sensorSystem;
        sensorSystem.registerAlarmListener(this);
    }

    public Copcall() {

    }

    public void alarm(String alarmSource, int level) {
        System.out.println(level + "만큼 경보발생 경찰에 알린다.");
        System.out.println(alarmSource + "쪽의 경보장치 볼륨을 최대한 높인다.");
    }

}
