package Astar;
public class Main{
	public static Gui gui = new Gui();
	public static int startx,starty;
	public static Point v[][] = new Point[100][100];
	public static void reconstruct(Point v[][],int x,int y)
	{
		if(x == startx && y == starty) return;
		else
		{
			reconstruct(v,v[x][y].x,v[x][y].y);
			gui.add_text(v[x][y].x,v[x][y].y);
		}
	}
	public static void construct(int x1,int y1)
	{
		Astar path = new Astar();
        path.a(0,0,x1,y1);
        startx = path.startx;
        starty = path.starty;
        int n = path.closed_list.size();
        for(int i=0;i<100;i++)
            for(int j=0;j<100;j++)
            {
                v[i][j]= new Point();
            }
        for(int i=0;i<path.closed_list.size();i++){
        	v[path.closed_list.get(i).x][path.closed_list.get(i).y].x = path.closed_list.get(i).camex;
        	v[path.closed_list.get(i).x][path.closed_list.get(i).y].y = path.closed_list.get(i).camey;
        }
        int x = path.closed_list.get(n-1).x;
        int y = path.closed_list.get(n-1).y;
        reconstruct(v,x,y);   	  
        path.closed_list.clear();
        path.open_list.clear();
		
	}
	public static void main(String[] args) {
 	   	gui.init();
 	   	
		construct(25,25);
        }
}
