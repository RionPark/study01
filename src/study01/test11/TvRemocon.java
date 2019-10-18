package study01.test11;

public class TvRemocon implements Remote{
	public int volume = 0;
	public void on() {
		System.out.println("tv를 킵니다.");
	}
	public void off() {
		System.out.println("tv를 끕니다.");
	}
	public void volumeUp() {
		volume++;
	}
	public void volumeDown() {
		if(volume!=0) {
			volume--;
		}
	}

	public static void main(String[] args) {
		TvRemocon r = new TvRemocon();
		r.volumeUp();
		System.out.println(r.volume);
		r.volumeDown();
		System.out.println(r.volume);
		r.volumeDown();
		System.out.println(r.volume);
	}
}






