/**
 * Created by admin on 2015-10-15.
 */

/**
 * 참고소스
 * http://wiki.gurubee.net/pages/viewpage.action?pageId=1507413
 * http://stevenjsmin.tistory.com/78
 */
public class GumballMaChineTestDrive {
    public static void main(String[] args) {
        // 뽑기 알맹이의 개수를 초기화 한다.
        GumballMachine gumballMachine = new GumballMachine(1);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
