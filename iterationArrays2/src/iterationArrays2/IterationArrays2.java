package iterationArrays2;

public class IterationArrays2 {

	public static void main(String[] args) {

		int Array[]= {1,2,3,4,5,6,7,8};

		for (int i : Array) {
			System.out.println(i);
		}

		for (int j : Array) {
			j = j * 10;
			System.out.println(j);
		}
	}
}
