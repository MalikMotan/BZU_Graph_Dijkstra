import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Vertices implements Comparable<Vertices>
{
    public String name;
    public Edges[] placesadj;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertices prevvertex;
	private int X;
	private int Y;
	
	public Vertices(String name,int x,int y)
    {
        name=name;
        this.X=x;
        this.Y=y;
       
    }
	Vertices(){}
    public Vertices(String argName) { 
    	name = argName; }
    
    public String toString() { return name; }
    public int compareTo(Vertices other)
    {
        return Double.compare(minDistance, other.minDistance);
    }

 public static List<Vertices> getShortestPathTo(Vertices target)
{
    ArrayList<Vertices> path = new ArrayList<Vertices>();
    for (Vertices vertex = target; vertex != null; vertex = vertex.prevvertex)
        path.add(vertex);

    Collections.reverse(path);
    return path;
}
 public int getX(){
     return this.X;
 }
 
 public int getY(){
     return this.Y;
 }

 public void setName(String name){
     this.name=name;
 }
 
 public String getName(){
     return this.name;
 
  }
 void setDim(int x,int y)
	{
		this.X=x;
	this.Y=y;
	}
 
 
 




}