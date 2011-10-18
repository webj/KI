package ki;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.UIManager;

import ch.unibe.iam.graph.DGraphElementFactory;
import ch.unibe.iam.graph.Edge;
import ch.unibe.iam.graph.Graph;
import ch.unibe.iam.graph.HashGraph;
import ch.unibe.iam.graph.UGraphElementFactory;
import ch.unibe.iam.graph.Vertex;
import ch.unibe.iam.graph.drawing.MyVisualizer;
import ch.unibe.iam.graph.io.GraphReader;
import ch.unibe.iam.graph.io.GraphWriter;
import ch.unibe.iam.graph.io.GxlReader;
import ch.unibe.iam.graph.io.GxlWriter;

/**
 * Demo class showing basic usage of the graph-package.
 * 
 * @author irniger
 */
public class GraphHowTo {

	public static void main(String[] args) {

		/*
		 * gerichtete und ungerichtete graphen k�nnen erstellt werden. wichtig
		 * ist dabei der typ der Factory. - gerichtete Graphen:
		 * DGraphElementFactory() - ungerichtete Graphen: UGraphElementFactory()
		 */
		Graph undirectedGraph = new HashGraph(new UGraphElementFactory()); // ungerichtet
		Graph directedGraph = new HashGraph(new DGraphElementFactory()); // gerichtet
		System.err.println("graph 1 directed: " + undirectedGraph.isDirected());
		System.err.println("graph 2 directed: " + directedGraph.isDirected());

		/*
		 * Zu Beginn sind die Graphen nat�rlich leer...
		 */
		System.err.println("graph 1 is empty: " + undirectedGraph.isEmpty());
		System.err.println("graph 2 is empty: " + directedGraph.isEmpty());

		/*
		 * Knoten einf�gen...
		 */
		Vertex v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23;
		v1 = directedGraph.addVertex();
		v2 = directedGraph.addVertex();
		v3 = directedGraph.addVertex();
		v4 = directedGraph.addVertex();
		v5 = directedGraph.addVertex();
		v6 = directedGraph.addVertex();
		v7 = directedGraph.addVertex();
		v8 = directedGraph.addVertex();
		v9 = directedGraph.addVertex();
		v10 = directedGraph.addVertex();
		v11 = directedGraph.addVertex();
		v12 = directedGraph.addVertex();
		v13 = directedGraph.addVertex();
		v14 = directedGraph.addVertex();
		v15 = directedGraph.addVertex();
		v16 = directedGraph.addVertex();
		v17 = directedGraph.addVertex();
		v18 = directedGraph.addVertex();
		v19 = directedGraph.addVertex();
		v20 = directedGraph.addVertex();
		v21 = directedGraph.addVertex();
		v22 = directedGraph.addVertex();
		v23 = directedGraph.addVertex();

		/*
		 * isert edges
		 */
		Edge e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57;

		e1 = directedGraph.addEdge(v2, v1);
		e2 = directedGraph.addEdge(v3, v2);
		e3 = directedGraph.addEdge(v5, v2);
		e4 = directedGraph.addEdge(v4, v2);
		e5 = directedGraph.addEdge(v6, v2);
		e6 = directedGraph.addEdge(v4, v6);
		e7 = directedGraph.addEdge(v5, v4);
		e8 = directedGraph.addEdge(v3, v4);
		e9 = directedGraph.addEdge(v9, v3);
		e10 = directedGraph.addEdge(v8, v3);
		e11 = directedGraph.addEdge(v11, v3);
		e12 = directedGraph.addEdge(v5, v3);
		e13 = directedGraph.addEdge(v7, v5);
		e14 = directedGraph.addEdge(v8, v5);
		e15 = directedGraph.addEdge(v9, v5);
		e16 = directedGraph.addEdge(v8, v7);
		e17 = directedGraph.addEdge(v11, v7);
		e18 = directedGraph.addEdge(v12, v7);
		e19 = directedGraph.addEdge(v15, v7);
		e20 = directedGraph.addEdge(v9, v8);
		e21 = directedGraph.addEdge(v12, v8);
		e22 = directedGraph.addEdge(v14, v8);
		e23 = directedGraph.addEdge(v13, v10);
		e24 = directedGraph.addEdge(v21, v10);
		e25 = directedGraph.addEdge(v12, v11);
		e26 = directedGraph.addEdge(v15, v11);
		e27 = directedGraph.addEdge(v14, v11);
		e28 = directedGraph.addEdge(v17, v11);
		e29 = directedGraph.addEdge(v19, v11);
		e30 = directedGraph.addEdge(v14, v12);
		e31 = directedGraph.addEdge(v15, v12);
		e32 = directedGraph.addEdge(v17, v12);
		e33 = directedGraph.addEdge(v19, v12);
		e34 = directedGraph.addEdge(v14, v13);
		e35 = directedGraph.addEdge(v17, v13);
		e36 = directedGraph.addEdge(v19, v13);
		e37 = directedGraph.addEdge(v21, v13);
		e38 = directedGraph.addEdge(v18, v13);
		e39 = directedGraph.addEdge(v15, v14);
		e40 = directedGraph.addEdge(v17, v14);
		e41 = directedGraph.addEdge(v18, v14);
		e42 = directedGraph.addEdge(v19, v14);
		e43 = directedGraph.addEdge(v16, v15);
		e44 = directedGraph.addEdge(v17, v15);
		e45 = directedGraph.addEdge(v18, v15);
		e46 = directedGraph.addEdge(v17, v16);
		e47 = directedGraph.addEdge(v18, v16);
		e48 = directedGraph.addEdge(v20, v16);
		e49 = directedGraph.addEdge(v22, v16);
		e50 = directedGraph.addEdge(v23, v16);
		e51 = directedGraph.addEdge(v18, v17);
		e52 = directedGraph.addEdge(v19, v17);
		e53 = directedGraph.addEdge(v20, v18);
		e54 = directedGraph.addEdge(v21, v19);
		e55 = directedGraph.addEdge(v22, v20);
		e56 = directedGraph.addEdge(v23, v20);
		e57 = directedGraph.addEdge(v23, v22);

		v1.setAttribute("isStart", true);
		v23.setAttribute("isGoal", true);

		v1.setAttribute("x", 1f);
		v1.setAttribute("y", 13f);

		v2.setAttribute("x", 1f);
		v2.setAttribute("y", 12f);

		v3.setAttribute("x", 12f);
		v3.setAttribute("y", 12f);

		v4.setAttribute("x", 3f);
		v4.setAttribute("y", 11f);

		v5.setAttribute("x", 4f);
		v5.setAttribute("y", 11f);

		v6.setAttribute("x", 1f);
		v6.setAttribute("y", 9f);

		v7.setAttribute("x", 7f);
		v7.setAttribute("y", 8f);

		v8.setAttribute("x", 9f);
		v8.setAttribute("y", 8f);

		v9.setAttribute("x", 12f);
		v9.setAttribute("y", 8f);

		v10.setAttribute("x", 1f);
		v10.setAttribute("y", 6f);

		v11.setAttribute("x", 7f);
		v11.setAttribute("y", 7f);

		v12.setAttribute("x", 8f);
		v12.setAttribute("y", 7f);

		v13.setAttribute("x", 2f);
		v13.setAttribute("y", 5f);

		v14.setAttribute("x", 5f);
		v14.setAttribute("y", 5f);

		v15.setAttribute("x", 8f);
		v15.setAttribute("y", 5f);

		v16.setAttribute("x", 12f);
		v16.setAttribute("y", 5f);

		v17.setAttribute("x", 6f);
		v17.setAttribute("y", 3f);

		v18.setAttribute("x", 10f);
		v18.setAttribute("y", 3f);

		v19.setAttribute("x", 5f);
		v19.setAttribute("y", 2f);

		v20.setAttribute("x", 11f);
		v20.setAttribute("y", 2f);

		v21.setAttribute("x", 5f);
		v21.setAttribute("y", 0f);

		v22.setAttribute("x", 11f);
		v22.setAttribute("y", 0f);

		v23.setAttribute("x", 12f);
		v23.setAttribute("y", 0f);

		visualize(directedGraph);
		/*
		 * Graphen k�nnen im Gxl-Format abgespeichert werden....
		 */
		String outFile = "./test.gxl";
		writeGraph(directedGraph, outFile);

		/*
		 * Graphen k�nnen im Gxl-Format gelesen werden....
		 */
		Graph gelesen = null;
		gelesen = readGraph(outFile);

		Graph searchGraph = null;
		String inputGraphFile = "/home/juerg/workspace/KISerie1/Aufgabe3.gxl";
		searchGraph = readGraph(inputGraphFile);

		if (searchGraph != null) {

			try {
				GraphSearch mSearch = new AStern();
				mSearch.setSearchGraph(searchGraph);
				mSearch.search();

				Vertex[] pathToGoalNode = mSearch.getSolution();
				System.out.println("Anzahl Knoten: " + pathToGoalNode.length);

				for (int i = 0; i < pathToGoalNode.length; i++) {
					pathToGoalNode[i].setAttribute("color", new Integer(
							-16724992));
				}

				visualize(searchGraph);
			} catch (Exception e) {
				System.err.println("error searching graph");
				e.printStackTrace();
				System.exit(1);
			}
		}

	}

	/**
	 * @param searchGraph
	 */
	private static void visualize(Graph searchGraph) {
		// define frame, its size and make it visible
		String systemUI = UIManager.getSystemLookAndFeelClassName();

		try {
			UIManager.setLookAndFeel(systemUI);
		} catch (Exception exc) {
			;
		}

		Frame myFrame = new MyVisualizer(searchGraph);
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		myFrame.setBounds(10, 10, 800, 500); // this time use a predefined frame
												// size/position
		myFrame.setVisible(true);
	}

	private static boolean isStartVertex(Vertex pVertex) {
		Object curAttrib = pVertex.getAttribute("isStart");
		if (curAttrib != null) {
			if (curAttrib instanceof Boolean) {
				return ((Boolean) curAttrib).booleanValue();
			}
		}
		return false;
	}

	private static boolean isGoalVertex(Vertex pVertex) {
		Object curAttrib = pVertex.getAttribute("isGoal");
		if (curAttrib != null) {
			if (curAttrib instanceof Boolean) {
				return ((Boolean) curAttrib).booleanValue();
			}
		}
		return false;
	}

	/**
	 * @param directedGraph
	 * @param outFile
	 */
	private static void writeGraph(Graph directedGraph, String outFile) {
		GraphWriter mWriter = new GxlWriter(outFile);
		try {
			// unfortunately, the file format gxl only knows
			// the datatype float (no double). however, we
			// can set the GxlWriter to transform float to
			// doubles, probably losing some precision as a tradeoff.
			// NOTE: this "feature" is specific to the Gxl-I/O classes only
			((GxlWriter) mWriter).mConvertDoubleToFloat = true;
			mWriter.write(directedGraph);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param searchGraph
	 * @return
	 */
	private static Graph readGraph(String pFile) {
		GraphReader mReader;
		mReader = new GxlReader(pFile);
		try {
			return mReader.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}