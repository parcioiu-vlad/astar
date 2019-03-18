package Astar;
import static java.lang.Math.abs;
import java.util.ArrayList;
public class Astar {
	int startx,starty,xf,yf;
    public ArrayList<Nod> open_list = new ArrayList<Nod>();
    public ArrayList<Nod> closed_list = new ArrayList<Nod>();

    public boolean searcho(int x,int y)
    {
    	for(int i=0;i<open_list.size();i++)
    		if(  (open_list.get(i).x == x)  && (open_list.get(i).y == y)  ) return true;
    	return false;
    }
    public boolean searchc(int x,int y)
    {
    	for(int i=0;i<closed_list.size();i++)
    		if(  (closed_list.get(i).x == x)  && (closed_list.get(i).y == y)  ) return true;
    	return false;
    }
    public boolean a(int sx,int sy,int fx,int fy){
    	startx = sx;
        starty = sy;
        xf = fx;
        yf = fy;
        boolean tentative_better;
        Nod start = new Nod();
        Map map = new Map();
        start.x = startx;
        start.y = starty;
        start.g = 0;
        start.h = abs(xf-start.x) + abs(yf-start.y);
        start.f = start.h;
        start.camex = start.x;start.camey=start.y;
        open_list.add(start);
        while(open_list.isEmpty() != true){
            Nod current = new Nod();
            int k,p;
            k=open_list.get(0).f;p=0;
            for(int i=0;i<open_list.size();i++)
                if(open_list.get(i).f < k) p=i;
            current = open_list.get(p);
            open_list.remove(p);
            closed_list.add(current); 
           
            Neighbour vec1 = new Neighbour();
            vec1.vec(current.x,current.y);
            for(int i=0;i<vec1.n;i++){
                Nod neighbour = new Nod(); 
                neighbour.x = vec1.v[i].x;
                neighbour.y = vec1.v[i].y;
             
                if( (searchc(neighbour.x,neighbour.y) == true) || (map.map[neighbour.x][neighbour.y] == true) ) continue;
                int tentative_g_score = current.g + abs(current.x - neighbour.x) + abs(current.y - neighbour.y);
              
                if( searcho(neighbour.x,neighbour.y) == false){
                    neighbour.h = abs(xf-neighbour.x)+abs(yf-neighbour.y);
				tentative_better = true;
                }
                else
				if(tentative_g_score < neighbour.g)
					tentative_better = true;
				else
					tentative_better = false;
			if(tentative_better == true)
			{
				neighbour.g = tentative_g_score;
				neighbour.f = neighbour.g + neighbour.h;
				neighbour.camex = current.x;
				neighbour.camey = current.y;
				open_list.add(neighbour);   
			}
                
            }
      
            if( (current.x == xf) && (current.y == yf) == true) return true;
             
                        }
    return false;    
    }
}
