package ki;

import java.util.Comparator;

import ch.unibe.iam.graph.Vertex;

public class OpenComperator implements Comparator<Vertex> {

	@Override
	public int compare(Vertex v1, Vertex v2) {
		
		if(((Float)v1.getAttribute("cost")+(Float)v1.getAttribute("airline"))>((Float)v2.getAttribute("cost")+(Float)v2.getAttribute("airline")))
			return 1;
		if(((Float)v1.getAttribute("cost")+(Float)v1.getAttribute("airline"))<((Float)v2.getAttribute("cost")+(Float)v2.getAttribute("airline")))
			return -1;
		
		else
			return 0;
	}

}
