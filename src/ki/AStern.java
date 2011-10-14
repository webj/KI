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

	@Override
	public void setSearchGraph(Graph pSearchGraph) {
		
		this.pSearchGraph = pSearchGraph;

	}

}
