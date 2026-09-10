import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		boolean symmetric = true;
		for (int i = 0; i < n && symmetric; i++) {
			for (int j = i + 1; j < n; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					symmetric = false;
					break;
				}
			}
		}

		System.out.println(symmetric ? "Symmetric matrix" : "Not a symmetric matrix");
		scanner.close();
	}
}
