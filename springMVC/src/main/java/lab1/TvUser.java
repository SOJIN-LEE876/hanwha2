package lab1;

public class TvUser {

	public static void main(String[] args) {
		//TV tv = new SamsungTV();
		TV tv = TvFactory.makeTV("lg");
		tv.powerOn();
		tv.powerOff();
	}

}
