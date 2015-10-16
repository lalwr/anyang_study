/**
 * Created by admin on 2015-10-16.
 */
public class ObserverDemoAfter {
    public static void main(String[] args) {
        SensorSystem ss = new SensorSystem();

       ss.registerAlarmListener(new Buzzer());
       ss.registerAlarmListener(new Lighting());
        ss.registerAlarmListener(new Copcall());

       ss.setTheAlarm("대문", 5);
    }
}
