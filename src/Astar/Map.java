package Astar;

public class Map {
	public boolean map[][] = new boolean[100][100];
	Map(){
		for(int i=0;i<100;i++)
			for(int j=0;j<100;j++)
				map[i][j] = false;
		map[1][0] = true;
		map[1][1] = true;
		map[1][3] = true;
		map[1][4] = true;
		map[1][5] = true;
		map[3][0] = true;
	}
}
