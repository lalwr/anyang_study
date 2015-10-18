import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by Administrator on 2015-10-18.
 */
public class IteratorEnumerationTestDrive {
    public static void main (String args[]) {
        ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
