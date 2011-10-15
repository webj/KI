package ki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ch.unibe.iam.graph.Graph;
import ch.unibe.iam.graph.Vertex;

public class AStern implements GraphSearch {
	
	private List<Vertex> open;
	private List<Vertex> closed;
	private Vertex n;
	private List<Node> nodes;
	private Graph pSearchGraph;
	private Vertex goal;
	private Node node;
	
	
	public AStern(){
		
		this.open = new ArrayList<Vertex>();
		this.closed = new ArrayList<Vertex>();
		this.node = new Node(null);
		this.nodes = new ArrayList<Node>();
	}	
	
	@Override
	public Vertex[] getSolution() {
		

		
		
		
		ArrayList<Vertex> solution = new ArrayList<Vertex>();
		
		
		while(node.predecessor!=null){
			solution.add(node.v);
			node = node.predecessor;
		}
		solution.add(node.v);
		
		Vertex vert = solution.remove(solution.size()-1);
		solution.add(1, vert);
		Vertex list[] = new Vertex[solution.size()];
		
		Vertex[] l = new Vertex[1];
		l[0] = solution.get(1);
		
				
		return solution.toArray(list);	
		
	}

	@Override
	public void search() {		
		System.out.println(this.pSearchGraph.getVerticesArray().length);
		
		for(Vertex v: this.pSearchGraph.getVerticesArray()){		
			v.setAttribute("cost", 0f);			
			if(this.isGoalVertex(v)){
				this.goal=v;
			}			
			if(this.isStartVertex(v)){
				this.n = v;
				this.open.add(n);
				node.v = n;
				this.n.setAttribute("node", node);
			}
		}
		
		//set's the h function		
		for(Vertex v: this.pSearchGraph.getVerticesArray()){
			v.setAttribute("airline", h(v));
		}
			
		while(!open.isEmpty()){				
			this.n = open.remove(0);
			node = (Node)this.n.getAttribute("node");	
			
			if(n.equals(goal)){ 
				break;
			}	
			
			expandNode(n);
			closed.add(n);	
		}
		

	}
	
	public void expandNode(Vertex currentNode){
		
		Node n1 = null;
		
		for(Vertex v: this.pSearchGraph.getVerticesArray()){
			
			if(currentNode.hasEdgeTo(v)){
				n1 = new Node(v);
				if(this.closed.contains(v))
					continue;				
			
				Float tentative_g = g(v, currentNode) + (Float)currentNode.getAttribute("cost");
				
				if(open.contains(v) && tentative_g >= (Float)v.getAttribute("cost"))
					continue;
				
				
				
				v.setAttribute("cost", tentative_g);				
				n1.predecessor = this.node;
				v.setAttribute("node", n1);
				
				this.nodes.add(n1);
					
				
				if(!open.contains(v)){				
					open.add(v);

				}
				
				
			}
		}
		
		this.node = n1;
		orderOpen();
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
	
	
	/**
	 * Sorts the open Array ascending form the shortest to the longest way
	 */
	public void orderOpen(){
		
		OpenComperator comp = new OpenComperator();		
		Collections.sort(this.open, comp);
		
	}

	@Override
	public void setSearchGraph(Graph pSearchGraph) {
		
		this.pSearchGraph = pSearchGraph;

	}
	
	  private boolean isStartVertex(Vertex pVertex) {
		    Object curAttrib = pVertex.getAttribute("isStart");
		    if (curAttrib != null) {
		      if (curAttrib instanceof Boolean) {
		        return ((Boolean) curAttrib).booleanValue();
		      }
		    }
		    return false;
		  }

		  private boolean isGoalVertex(Vertex pVertex) {
		    Object curAttrib = pVertex.getAttribute("isGoal");
		    if (curAttrib != null) {
		      if (curAttrib instanceof Boolean) {
		        return ((Boolean) curAttrib).booleanValue();
		      }
		    }
		    return false;
		  }

}

class Node{
	
	public Node predecessor;
	public Vertex v;
	
	
	public Node(Vertex v){
		this.v = v;
	}
	
	public Node getPredecessor(){
		return this.predecessor;
	}
	

	
	
}
