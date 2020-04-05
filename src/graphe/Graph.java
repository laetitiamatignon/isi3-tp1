package graphe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Graph implements IDirectedGraph {

	/**
	 * A chaque cle=noeud est associe la liste des arcs sortants de ce noeud
	 */
	private Map<Node,List<Arc>> adjacence; 
	
	public Graph(){
		
		adjacence = new HashMap<Node,List<Arc>>();
		
		
	
	}
	/**
	 * 
	 * @param _n1
	 * @param _n2
	 * @return vrai si graph possede arc de src _n1 et destination _n2
	 */
	public boolean hasArc(Node _n1, Node _n2){
		List<Arc> arretesAdj = adjacence.get(_n1);
		for (Arc _a : arretesAdj){
			if (_n1.equals(_a.getSource()) && _n2.equals(_a.getDestination()))
				return true;
		}
		return false;
	}
	
	public void addNode(Node _node){
		adjacence.put(_node, new ArrayList<Arc>());

	}
	
	public void addArc(Arc _edge){
	
		if (!hasArc(_edge.getSource(),_edge.getDestination()))
			adjacence.get(_edge.getSource()).add(_edge);
	
	}
	
	public List<Node> getAllNodes(){
		//A COMPLETER
		
		return null;
	}
	
	public int getNbNodes(){
		//A COMPLETER
		
		return 0;
	}
	
	/**
	 * 
	 * @param _n
	 * @return tous les arcs de source _n
	 */
	public List<Arc> getArc(Node _n){
		
		return adjacence.get(_n);
	}
	/**
	 * renvoie tous les noeuds qui sont destination d'un arc dont la source est _n
	 */
	public List<Node> getAdjNodes(Node _n){
		//A COMPLETER
		return null;
	}
	
	

	@Override
	public String toString() {
		String s="Graph \n";
		//A COMPLETER
		
		
		return s;
	}


	
}
