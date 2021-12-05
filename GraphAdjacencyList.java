package dsa;

import java.util.ArrayList;

public class GraphAdjacencyList {
	public static void addEdge(ArrayList<ArrayList<Integer>> obj, int u, int v) {
		obj.get(u).add(v);
		obj.get(v).add(u);
	}

	public static void printGraph(ArrayList<ArrayList<Integer>> obj) {
		for (int i = 0; i < obj.size(); i++) {
			for (int j = 0; j < obj.get(i).size(); j++) {
				System.out.print(obj.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	public static void main() {
		ArrayList<ArrayList<Integer>> obj = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= 3; i++) {
			obj.add(new ArrayList<Integer>());
		}

		addEdge(obj, 0, 1);
		addEdge(obj, 0, 2);
		addEdge(obj, 1, 2);
		addEdge(obj, 1, 3);

		System.out.println(obj);

		printGraph(obj);
	}
}
