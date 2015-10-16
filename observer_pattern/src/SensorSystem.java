import java.util.Enumeration;
import java.util.Vector;

public class SensorSystem implements Subject {

    private String alarmSource;
    private int level =0; // 경보의 수준을 나타내는 값. 0부터 10까지의 범위
    private Vector<AlarmListener> listeners;

    public SensorSystem(){
        listeners = new Vector<AlarmListener>();
    }

    public void registerAlarmListener(AlarmListener al) {
        listeners.addElement(al);
        //listeners.add(al) 리턴이(boolean) 있다 즉 add메소드를 사용함이 좀더 유연성 있게 프로그램이 가능 하다.
    }

    @Override
    public void removeAlaramListener(AlarmListener o) {

    }

    public void removeAlarmListener(AlarmListener al) {
        int i = listeners.indexOf(al);
        if (i >= 0) {
            listeners.remove(al);
        }
    }

    public void notifyAlarmListener() {
        for (Enumeration e = listeners.elements(); e.hasMoreElements();)
            ((AlarmListener) e.nextElement()).alarm(alarmSource, level);

        //Enumeration enums=listeners.elements();
        //while(enums.hasMoreElements()){
        //	((AlarmListener) e.nextElement()).alarm(alarmSource, level);
        //}
    }

    public void giveTheAlarm() {
        notifyAlarmListener();
    }

    public void setTheAlarm(String alarmSource,int level) {
        this.alarmSource = alarmSource;
        this.level = level;
        giveTheAlarm();
    }


    public int getLevel() {
        return level;
    }

    public String getAlarmSourceName() {
        return alarmSource;
    }
}
