package arrays;

public class ConnectedComponent {

	public int countComponents(int n, int[][] edges) {
		int count = n;

		int[] root = new int[n];
		// initialize each node is an island
		for (int i = 0; i < n; i++) {
			root[i] = i;
		}

		for (int i = 0; i < edges.length; i++) {
			int x = edges[i][0];
			int y = edges[i][1];

			int xRoot = getRoot(root, x);
			int yRoot = getRoot(root, y);

			if (xRoot != yRoot) {
				count--;
				root[xRoot] = yRoot;
			}

		}

		System.out.println("My Array");
		for(int ct=0;ct<root.length;ct++){
			System.out.print(ct+"\t");
		}
		System.out.println();
		for(int c=0;c<root.length;c++){
			System.out.print(root[c]+"\t");
		}
		System.out.println();
		return count;
		
	}

	public int getRoot(int[] arr, int i) {
		while (arr[i] != i) {
			arr[i] = arr[arr[i]];
			i = arr[i];
		}
		return i;
	}

	public static void main(String[] args) {
		ConnectedComponent a= new ConnectedComponent();
		int n=13;
		int edges[][]={{0,1},{0,2},{3,2},{3,9},{10,8},{8,7},{7,4},{11,12},{12,6},{6,5}};
		
		System.out.println(a.countComponents(n, edges));

	}

}
