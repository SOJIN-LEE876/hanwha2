package lab1;

public class LgTV implements TV{
	
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"������ �մϴ�.**");
	}
	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"������ ���ϴ�.**");
	}
}
