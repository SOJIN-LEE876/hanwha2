package lab2;

public class LgTV implements TV{
	
	public LgTV() {
		System.out.println("LgTV������");
	}
	
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"������ �մϴ�.**");
	}
	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"������ ���ϴ�.**");
	}
}
