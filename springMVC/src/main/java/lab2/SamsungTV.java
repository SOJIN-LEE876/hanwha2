package lab2;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("Samsung생성자");
	}
	
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"전원을 끕니다.");
	}
}
