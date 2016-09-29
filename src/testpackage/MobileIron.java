package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MobileIron {

		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer sc = new StringTokenizer (br.readLine());
		int N = Integer.parseInt(br.readLine());
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		for (int tc = 0; tc < N; tc++) {
			String temp[] = br.readLine().split(" ");
			ArrayList<Integer> temparray = new ArrayList<Integer>();
			temparray.add(Integer.parseInt(temp[1]));
			temparray.add(0);
			map.put(temp[0], temparray);
		}

		ArrayList<String>fruits=new ArrayList<String>();
		int Q = Integer.parseInt(br.readLine());
		for (int i = 0; i < Q; i++) {
			String str[] = br.readLine().split(" ");
			if (str[0].equals("+")) {
				ArrayList<Integer> temparray = map.get(str[1]);
				temparray.add(1, temparray.get(1) + 1);
				map.put(str[1], temparray);
				fruits.add(str[1]);
			}
			if (str[0].equals("-")) {
				ArrayList<Integer> temparray = map.get(str[1]);
				if (temparray.get(1) != 0) {
					temparray.add(1, temparray.get(1) - 1);
					map.put(str[1], temparray);
					fruits.add(str[1]);
				}

			}

			if (str[0].equals("?")) {
				int sum = 0;
				int y = Integer.parseInt(str[1]);
				for(int k=0;k<fruits.size();k++){
					ArrayList<Integer> temparray = map.get(fruits.get(k));	
					if(temparray.get(0)>y){
						sum+=temparray.get(1);
					}
				}

				System.out.println(sum);
			}
		}

	}

}
