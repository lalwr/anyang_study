/**
 * Created by admin on 2015-10-15.
 */
public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    /**
     * 생성자를 통해서 뽑기기계에대한 레퍼런스가 전달된다.
     * @param gumballMachine
     */
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /* NoQuarter 상태에서 동전을 넣게되면 이미 동전이 있다는 메시지를 출력하고
     * 뽑기 기계의레퍼런스를 다른 객체의 상태로 바꿈으로써 다음 상태로 전환된다.
     * @see headfirst.state.gumballstate.State#insertQuarter()
     */
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요.");
    }

    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }

    public String toString() {
        return "동전없음";
    }
}
