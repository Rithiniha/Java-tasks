package star;

public class Star {

	public static void main(String[] args) {
		int n = 3;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
