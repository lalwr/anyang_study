/**
 * Created by Administrator on 2015-10-15.
 */
public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.");
    }

    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려주세요.");
    }

    public void dispense() {
        System.out.println("축하드립니다! 알맹이를 하나더 받으실 수 있습니다.");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldState());
        } else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("�� �̻� �˸��̰� �����ϴ�.");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public String toString() {
        return "�˸��� ������ ��";
    }
}
