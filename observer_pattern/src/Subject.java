/**
 * Created by admin on 2015-10-15.
 */
public interface Subject {
        public void registerAlarmListener(AlarmListener o);
        public void removeAlaramListener(AlarmListener o);
        public void notifyAlarmListener();
}
