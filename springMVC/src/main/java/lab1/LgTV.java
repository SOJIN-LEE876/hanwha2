package lab1;

public class LgTV implements TV{
	
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"전원을 켭니다.**");
	}
	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"전원을 끕니다.**");
	}
}
