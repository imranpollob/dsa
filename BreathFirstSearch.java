package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
	public static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}

	public static void bfs(ArrayList<ArrayList<Integer>> list, int no_of_v, int source) {
		Queue<Integer> queue = new LinkedList<Integer>();
		// lower boolean has two values "true" and "false"
		// upper Boolean has three values "true", "false" and "null"
		// if initialized with boolean then array will be filled with false
		// if initialized with Boolean then, filled with null
		boolean[] visited = new boolean[no_of_v];

		queue.add(source);
		visited[source] = true;

		while (!queue.isEmpty()) {
			int u = queue.poll();
			System.out.println(u);

			for (int v : list.get(u)) {
				if (!visited[v]) {
					queue.add(v);
					visited[v] = true;
				}
			}
		}
	}

	public static void main() {
		int no_of_v = 5;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(no_of_v);

		for (int i = 0; i < no_of_v; i++) {
			list.add(new ArrayList<Integer>());
		}
		// https://ibb.co/0qc9zFw
		addEdge(list, 0, 1);
		addEdge(list, 0, 2);
		addEdge(list, 1, 2);
		addEdge(list, 1, 3);
		addEdge(list, 2, 3);
		addEdge(list, 2, 4);
		addEdge(list, 3, 4);

		System.out.println(list);

		bfs(list, no_of_v, 1);
	}

}
