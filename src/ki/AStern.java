package ki;

import java.util.ArrayList;
import java.util.List;

import ch.unibe.iam.graph.Graph;
import ch.unibe.iam.graph.Vertex;

public class AStern implements GraphSearch {
	
	private List<Vertex> open;
	private List<Vertex> closed;
	private List<Vertex> unknown;
	private Vertex n;
	private Graph pSearchGraph;
	private Vertex goal;
	
	public AStern(){
		
		this.open = new ArrayList<Vertex>();
		this.closed = new ArrayList<Vertex>();
		this.unknown = new ArrayList<Vertex>();
		
	}	
	
	@Override
	public Vertex[] getSolution() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void search() {
		
		int i=0;
		
		//searchs the goal vertex
		while(!(this.pSearchGraph.getVertex(i).getAttribute("isGoal") != null))			
			this.goal = this.pSearchGraph.getVertex(i);
		
		//finds the start vertex
		i=0;
		while(!(this.pSearchGraph.getVertex(i).getAttribute("isStart") != null)){
			
			this.n = this.pSearchGraph.getVertex(i);
			this.open.add(n);
			i++;			
		}

			
		while(!open.isEmpty()){
			
			this.n = open.remove(0);
			closed.add(n);
			
			if(n.getAttribute("isGoal")!=null){
				break;
			}
			
			this.pSearchGraph.getEdgesArray();
			
			for(Vertex v: pSearchGraph.getVerticesArray())
				
				if(n.hasEdgeTo(v));
					
			
			
		}	
		

	}
	
	public ArrayList<Vertex> successor(Vertex predecessor){
		
		ArrayList<Vertex> M = new ArrayList<Vertex>();
		
		for(Vertex v: this.pSearchGraph.getVerticesArray()){
			
			if(n.hasEdgeTo(v)){
				
				if(this.closed.contains(v))
					continue;
				
				float tentative_g = g(v, predecessor) + (Float)predecessor.getAttribute("cost");
				
				if(open.contains(v) && tentative_g >= (Float)v.getAttribute("cost"))
					continue;
				
				
				
			}
				
		}
		
	}
	
	
	/**
	 * Calculates the g function for the distance from the predecessor to the current selected vertex. It's uses the euklidian distance.
	 * @param successor vertex of the predecessor	
	 * @param predecessor vertex 
	 * @return distance between successor and predecessor
	 */
	public float g(Vertex successor, Vertex predecessor){
		
		Float xpredecessor = (Float) predecessor.getAttribute("x");
		Float ypredecessor = (Float) predecessor.getAttribute("y");
		
		Float xv = (Float) successor.getAttribute("x");
		Float yv = (Float) successor.getAttribute("y");
		
		return (float) Math.sqrt((Math.pow((xpredecessor - xv), 2) + Math.pow((ypredecessor-yv), 2)));
		
	}
	/**
	 * Calculates a function for the distance from the the current selected vertex to the goal vertex. It's uses the euklidian distance.
	 * @param v vertex for calculating the distance to the goal
	 * @param predecessor vertex 
	 * @return distance between current vertex and goal
	 */
	public float h(Vertex v){
		
		Float xv = (Float) v.getAttribute("x");
		Float yv = (Float) v.getAttribute("y");
		
		Float xgoal = (Float) this.goal.getAttribute("x");
		Float ygoal = (Float) this.goal.getAttribute("y");
		
		return (float) Math.sqrt((Math.pow((xv-xgoal), 2) + Math.pow((yv-ygoal), 2)));
		
	}

	@Override
	public void setSearchGraph(Graph pSearchGraph) {
		
		this.pSearchGraph = pSearchGraph;

	}

}
