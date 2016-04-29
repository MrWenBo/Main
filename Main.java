package mooc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static int N=0;
	private static HashMap<String,Integer> cityMap=new HashMap<String,Integer>();
	
	void add(int value,String key) {
		cityMap.put(key,value);
	}
	int get(String key){
		return cityMap.get(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main city=new Main();
		String temp=in.next();
		
		while (true) {
			if (!temp.equals("###")) {
				city.add(N++,temp);
				temp=in.next();
			}else {
				break;
			}
		}
	
		int[][] map = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j]=in.nextInt();
			}
		}
		System.out.println(map[city.get(in.next())][city.get(in.next())]);	
	}
}
