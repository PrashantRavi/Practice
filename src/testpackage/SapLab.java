package testpackage;

import java.util.Scanner;

public class SapLab {
	public static int N;
	public static int M;
	public static long[][] input;
	public static long height;
	public static boolean[][] visited;
	public static boolean found = false;
	public static boolean move = true;
	public static int[][] out;
	public static int counter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		input = new long[N][M];
		visited = new boolean[N][M];
		out = new int[N * M][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				input[i][j] = sc.nextLong();
			}
		}

		int Dx = sc.nextInt() - 1;
		int Dy = sc.nextInt() - 1;
		height = sc.nextLong();

		traverse(Dx, Dy);
		if (found) {
			System.out.println("YES");
			System.out.println(counter+1);
			System.out.println(Dx + " " + Dy);

			for (int i = 0; i < counter; i++) {
				System.out.println(out[i][0] + " " + out[i][1]);
			}
		} else {
			System.out.println("NO");
		}
		
found=false;
counter=0;

	}

	private static void traverse(int x, int y) {

		visited[x][y] = true;
		// Up Line
		if (x == 0 && (y >= 0 && y <= M)) {
			found = true;
			move = false;
			return;
		}
		// Left Line
		if ((x >= 0 && x <= N) && y == 0) {
			found = true;
			move = false;
			return;
		}
		// Right
		if ((x >= 0 && x <= N) && y == M) {
			found = true;
			move = false;
			return;
		}
		// Down
		if (x == N && (y >= 0 && y <= M)) {
			found = true;
			move = false;
			return;
		}

		// Move Up
		if (move && !visited[x - 1][y] && x >= 0 && (input[x - 1][y] <= input[x][y]) && (input[x - 1][y] - input[x][y]) <= height) {
			out[counter][0] = x - 1;
			out[counter][1] = y;
			counter++;
			traverse(x - 1, y);
			// visited[x-1][y]=false;
		}

		// Move Left
		if (move && !visited[x][y - 1] && y >= 0 && (input[x][y-1] <= input[x][y]) &&(input[x][y - 1] - input[x][y]) <= height) {
			out[counter][0] = x;
			out[counter][1] = y - 1;
			counter++;
			traverse(x, y - 1);
			// visited[x][y-1]=false;
		}

		// Move Right
		if (move && !visited[x][y + 1] && y < M && (input[x][y+1] <= input[x][y]) && (input[x][y + 1] - input[x][y]) <= height) {
			out[counter][0] = x;
			out[counter][1] = y + 1;
			counter++;
			traverse(x, y + 1);
			// visited[x][y+1]=false;
		}

		// Move down
		if (move && !visited[x + 1][y] && x < N &&(input[x+1][y] <= input[x][y]) && (input[x + 1][y] - input[x][y]) <= height) {
			out[counter][0] = x + 1;
			out[counter][1] = y;
			counter++;
			traverse(x + 1, y);
			// visited[x+1][y]=false;
		}

	}

}
