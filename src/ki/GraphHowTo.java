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
     * gerichtete und ungerichtete graphen k�nnen erstellt werden.
     * wichtig ist dabei der typ der Factory. 
     * - gerichtete Graphen:   DGraphElementFactory()
     * - ungerichtete Graphen: UGraphElementFactory()
     */ 
    Graph undirectedGraph = new HashGraph(new UGraphElementFactory()); //ungerichtet
    Graph directedGraph = new HashGraph(new DGraphElementFactory()); //gerichtet
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
    v1 = undirectedGraph.addVertex();
    v2 = undirectedGraph.addVertex();
    v3 = undirectedGraph.addVertex();
    v4 = undirectedGraph.addVertex();
    v5 = undirectedGraph.addVertex();
    v6 = undirectedGraph.addVertex();
    v7 = undirectedGraph.addVertex();
    v8 = undirectedGraph.addVertex();
    v9 = undirectedGraph.addVertex();
    v10 = undirectedGraph.addVertex();
    v11 = undirectedGraph.addVertex();
    v12 = undirectedGraph.addVertex();
    v13 = undirectedGraph.addVertex();
    v14 = undirectedGraph.addVertex();
    v15 = undirectedGraph.addVertex();
    v16 = undirectedGraph.addVertex();
    v17 = undirectedGraph.addVertex();
    v18 = undirectedGraph.addVertex();
    v19 = undirectedGraph.addVertex();
    v20 = undirectedGraph.addVertex();
    v21 = undirectedGraph.addVertex();
    v22 = undirectedGraph.addVertex();
    v23 = undirectedGraph.addVertex();
    
    Edge e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57;
    
    e1 = undirectedGraph.addEdge(v2, v1);
    e2 = undirectedGraph.addEdge(v3, v2);
    e3 = undirectedGraph.addEdge(v5, v2);
    e4 = undirectedGraph.addEdge(v4, v2);
    e5 = undirectedGraph.addEdge(v6, v2);
    e6 = undirectedGraph.addEdge(v4, v6);
    e7 = undirectedGraph.addEdge(v5, v4);
    e8 = undirectedGraph.addEdge(v3, v4);
    e9 = undirectedGraph.addEdge(v9, v3);
    e10 = undirectedGraph.addEdge(v8, v3);
    e11 = undirectedGraph.addEdge(v11, v3);
    e12 = undirectedGraph.addEdge(v5, v3);
    e13 = undirectedGraph.addEdge(v7, v5);
    e14 = undirectedGraph.addEdge(v8, v5);
    e15 = undirectedGraph.addEdge(v9, v5);
    e16 = undirectedGraph.addEdge(v8, v7);
    e17 = undirectedGraph.addEdge(v11, v7);
    e18 = undirectedGraph.addEdge(v12, v7);
    e19 = undirectedGraph.addEdge(v15, v7);
    e20 = undirectedGraph.addEdge(v9, v8);
    e21 = undirectedGraph.addEdge(v12, v8);
    e22 = undirectedGraph.addEdge(v14, v8);
    e23 = undirectedGraph.addEdge(v13, v10);
    e24 = undirectedGraph.addEdge(v21, v10);
    e25 = undirectedGraph.addEdge(v12, v11);
    e26 = undirectedGraph.addEdge(v15, v11);
    e27 = undirectedGraph.addEdge(v14, v11);
    e28 = undirectedGraph.addEdge(v17, v11);
    e29 = undirectedGraph.addEdge(v19, v11);
    e30 = undirectedGraph.addEdge(v14, v12);
    e31 = undirectedGraph.addEdge(v15, v12);
    e32 = undirectedGraph.addEdge(v17, v12);
    e33 = undirectedGraph.addEdge(v19, v12);
    e34 = undirectedGraph.addEdge(v14, v13);
    e35 = undirectedGraph.addEdge(v17, v13);
    e36 = undirectedGraph.addEdge(v19, v13);
    e37 = undirectedGraph.addEdge(v21, v13);
    e38 = undirectedGraph.addEdge(v18, v13);
    e39 = undirectedGraph.addEdge(v15, v14);
    e40 = undirectedGraph.addEdge(v17, v14);
    e41 = undirectedGraph.addEdge(v18, v14);
    e42 = undirectedGraph.addEdge(v19, v14);
    e43 = undirectedGraph.addEdge(v16, v15);
    e44 = undirectedGraph.addEdge(v17, v15);
    e45 = undirectedGraph.addEdge(v18, v15);
    e46 = undirectedGraph.addEdge(v17, v16);
    e47 = undirectedGraph.addEdge(v18, v16);
    e48 = undirectedGraph.addEdge(v20, v16);
    e49 = undirectedGraph.addEdge(v22, v16);
    e50 = undirectedGraph.addEdge(v23, v16);
    e51 = undirectedGraph.addEdge(v18, v17);
    e52 = undirectedGraph.addEdge(v19, v17);
    e53 = undirectedGraph.addEdge(v20, v18);
    e54 = undirectedGraph.addEdge(v21, v19);
    e55 = undirectedGraph.addEdge(v22, v20);
    e56 = undirectedGraph.addEdge(v23, v20);
    e57 = undirectedGraph.addEdge(v23, v22);
    
    
    int j=1;
    for(Vertex v: undirectedGraph.getVerticesArray()){
    	v.setAttribute("vertex", j);
    	j++;
    }
    
    v1.setAttribute("isStart", true);
    v23.setAttribute("isGoal", true);
    
    v1.setAttribute("x", 1f);
    v1.setAttribute("y", 13f);
    
    v2.setAttribute("x", 1f);
    v2.setAttribute("y", 12f);

    v3.setAttribute("x", 12f);
    v3.setAttribute("y", 112f);

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

    
    //visualize(undirectedGraph);
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
    
    /*
     * ACHTUNG!!
     * In GXL gibt es nur den Datentyp Float, keinen Datentyp
     * Double. D.h., am einfachsten ist es, f�r alle Fliesskomma-Variablen
     * den Typ float bzw Float zu verwenden. Die Genauigkeit eines Floats
     * reicht f�r die �bungsaufgabe auch vollkommen aus
     */

    
    /* 
     * Soviel zum Tutorial. Nun geht's an die Graphsuche.
     * WICHTIG: 
     * - der implementiert Suchalgorithmus soll das Interface GraphSearch einhalten! 
     * - ausserdem soll er ebenfalls im Package "ki" sein.
     */


    /*
     * Wie in der Aufgabe angegeben soll der Suchgraph im
     * Gxl-Format eingelesen werden. 
     */
   
    Graph searchGraph = null;
   // String inputGraphFile = "/home/juerg/workspace/KISerie1/Aufgabe3.gxl";
    //searchGraph = readGraph(inputGraphFile);
    /*
     * Nach erfolgreichem einlesen, kann die Suche
     * eigentlich beginnen.
     */
    if (searchGraph != null) {
    

      /*
       * hier wird die graphsuche gemacht. die folgenden
       * 3 schritte m�ssen eingehalten werden:
       * 1. angabe des suchgraphen
       * 2. starten der suche
       * 3. gefundener l�sungspfad als vertex-array
       *    mit startknoten an position 0 und endknoten
       *    an position 1.
       * insbesondere fehlen hier die angabe von start und endknoten
       * sowie die angabe der funktion f=g+h. beides kann/soll 
       * individuell gel�st werden.
       * 
       * Start und Endknoten m�ssen noch aus dem Graphen extrahiert
       * werden. Am einfachsten iteriert man dabei �ber die Knoten
       * des Graphen, etwa in der Art (die Prozeduren isGoalVertex und
       * isStartVertex sind bereits im How-To programmiert):
       *       
       * Vertex goalVertex = null;
       * Vertex startVertex = null;
       * Iterator vIt = searchGraph.vertices();
       * while (vIt.hasNext()) {
       *   Vertex cv = (Vertex) vIt.next();
       *   if (isGoalVertex(cv)) goalVertex = cv;
       *   if (isStartVertex(cv))startVertex = cv;
       * }
       */
      
      try {
    	  
    	
        // euer Algorithmus muss das Interface GraphSearch einhalten
        GraphSearch mSearch = new AStern();
        // der zu durchsuchende Graph muss explizit gesetzt werden k�nnen
        mSearch.setSearchGraph(searchGraph);
      
        // die Suche soll per search-Methode gestartet werden
        
        mSearch.search();
        
        // R�ckgabe des Resultates
        Vertex[] pathToGoalNode = mSearch.getSolution();
        System.out.println("Anzahl Knoten: "+pathToGoalNode.length);

        // der gefundene Pfad kann im Graph-Visualizer angezeigt werden
        
 
        
        for (int i = 0; i < pathToGoalNode.length; i++) {
          pathToGoalNode[i].setAttribute("color", new Integer(-16724992));  // gr�ne Farbe f�r L�sungsknoten
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