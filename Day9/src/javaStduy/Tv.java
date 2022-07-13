package javaStduy;

public interface Tv {
	
		public int MIN_VOLUME = 0; //final 생략해도 상수형태로 사용 가능. 
		public int MAX_VOLUME = 100;

		public void turnOn(); //전원을 켜는 기능
		public void turnOff(); //전원 끄는 기능
		public void changeVolume(int volume); //음량조절
		public void changeChannel(int channel); //채널 변경 가능
}

//켜는 방법은 제각각이어도 이름은 있어야 한다. 
