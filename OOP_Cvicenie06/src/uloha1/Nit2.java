package uloha1;

public class Nit2 implements Runnable {
	int n = 0;
	
	public Nit2(int n) {
		this.n = n;
	}

	public void run() {					//metoda sa musi volat run lebo implementuje Runnable ktora hovori ze musi implementovat metodu run
		for (int i = 0; i < 10; i++) {
			System.out.println("T" + n + ": " + i);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new Thread(new Nit2(i)).start();
	}
}
