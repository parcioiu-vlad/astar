package Astar;

public class Neighbour {
	  Point[] v;
	    int n;
	    public void vec(int i,int j){
	        if(i==0) {
			 if(j==0) {
				 v=new Point[2];n=2;
	                         for(int k=0;k<n;k++)
	                             v[k] = new Point();
				 v[0].x=i;v[0].y=j+1;
	                         v[1].x=i+1;v[1].y=j;
	                       
	                 }
	            else
					if(j==100){ 
						v=new Point[2];n=2;
	                                        for(int k=0;k<n;k++)
	                                            v[k] = new Point();
						v[0].x=i;v[0].y=j-1;
						v[1].x=i+1;v[1].y=j;
						}
					else{
						v=new Point[3];n=3;
	                                        for(int k=0;k<n;k++)
	                                            v[k] = new Point();
						v[0].x=i;v[0].y=j-1;
						v[1].x=i+1;v[1].y=j;
						v[2].x=i;v[2].y=j+1;
						}
				}
	     else
	     if(j==0 && (i!=0 && i!=100)){
			 v=new Point[3];n=3;
	                 for(int k=0;k<n;k++)
	                    v[k] = new Point();
			 v[0].x=i-1;v[0].y=j;
			 v[1].x=i;v[1].y=j+1;
			 v[2].x=i+1;v[2].y=j;
			 
		 }
	     else
	     if(j==100 && (i!=0 && i!=100)){
			 v=new Point[3];n=3;
	                 for(int k=0;k<n;k++)
	                   v[k] = new Point();
			 v[0].x=i-1;v[0].y=j;
			 v[1].x=i;v[1].y=j-1;
			 v[2].x=i+1;v[2].y=j;
			 
		 }
	     else
	     if(i==100){
			 if(j==0) {
				 v=new Point[2];n=2;
	                         for(int k=0;k<n;k++)
	                            v[k] = new Point();
				 v[0].x=i-1;v[0].y=j;
				 v[1].x=i;v[1].y=j+1;
				
			 }
	             else
					 if(j==100) {
						 v=new Point[2];n=2;
	                                         for(int k=0;k<n;k++)
	                                            v[k] = new Point();
						 v[0].x=i;v[0].y=j-1;
						 v[1].x=i-1;v[1].y=j;
						
					 }
					 else {
						 v=new Point[3];n=3;
	                                         for(int k=0;k<n;k++)
	                                            v[k] = new Point();
						 v[0].x=i;v[0].y=j-1;
						 v[1].x=i-1;v[1].y=j;
						 v[2].x=i;v[2].y=j+1;
						 
						 }
		 }
		 else {
			 v=new Point[4];n=4;
	                 for(int k=0;k<n;k++)
	                    v[k] = new Point();
			 v[0].x=i-1;
	                 v[0].y=j;
			 v[1].x=i;v[1].y=j+1;
			 v[2].x=i+1;v[2].y=j;
			 v[3].x=i;v[3].y=j-1;
			 
			 }
	    }
	}

