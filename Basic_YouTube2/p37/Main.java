package JavaPracticeAlgorithm.p37;
/*
 * 입력된 단지의 수와 각 단지의 세대 수를 출력하시오
 * 입력:
 * 	00011
 * 	00001
 * 	10000
 * 	11000
 * 	11011
 * 정답: 3 // 단지 수
 * 		3 5 2 // 단지의 세대 수
 */
public class Main {
	static final int SIZE = 5;
	static final int APART = 1;
	
	static int apartCnt = 0;
	static int []houseHold = new int[10];
	
	static int [][]map = 
		{{0,0,0,1,1},
		{0,0,0,0,1}, 
		{1,0,0,0,0},
		{1,1,0,0,0},
		{1,1,0,1,1}};
	
	public static void doFunc(int y, int x, int apartIndex) {
		// Change color to 0
		map[y][x] = 0;
		houseHold[apartIndex]++;
		
		if (x-1 >= 0 && map[y][x-1] == APART) {
			doFunc(y, x-1, apartIndex);
		}
		if (x+1 <= SIZE-1 && map[y][x+1] == APART) {
			doFunc(y, x+1, apartIndex);
		}
		if (y+1 <= SIZE-1 && map[y+1][x] == APART) {
			doFunc(y+1, x, apartIndex);
		}		
		if (y-1 >= 0 && map[y-1][x] == APART) {
			doFunc(y-1, x, apartIndex);
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (map[i][j] == 1) {
					doFunc(i, j, apartCnt);
					apartCnt++;
				}
			}
		}
		
		System.out.println(apartCnt);
		for(int i : houseHold) {
			System.out.print(i + " ");
		}
	}
	
	
}
