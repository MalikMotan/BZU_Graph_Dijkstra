import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Dijkstra
{
	public static void findPaths(Vertices source)
	{
		source.minDistance = 0;
		PriorityQueue<Vertices> vertexQueue = new PriorityQueue<Vertices>();
		vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) {
			Vertices u = vertexQueue.poll();

			// Visit each edge exiting u
			//for (Edges e : u.adjacencies)
			for(int i=0; i<u.placesadj.length; i++)
			{
				Vertices v = u.placesadj[i].Distination;
				double newCost = u.placesadj[i].Cost;
				double distanceThroughU = u.minDistance + newCost;
				if (distanceThroughU < v.minDistance) {
					vertexQueue.remove(v);
					v.minDistance = distanceThroughU ;
					v.prevvertex = u;
					vertexQueue.add(v);
				}
			}
			
		}
	}

	public static List<Vertices> getShortestPathTo(Vertices target)
	{
		List<Vertices> path = new ArrayList<Vertices>();
		for (Vertices Vertices = target; Vertices != null; Vertices = Vertices.prevvertex)
			path.add(Vertices);
		Collections.reverse(path);
		return path;
	}
}
