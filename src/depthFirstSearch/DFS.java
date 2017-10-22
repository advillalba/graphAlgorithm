package depthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {
	private Stack<Vertex> stack;

	public DFS() {
		this.stack = new Stack<>();
	}

	public void dfs(List<Vertex> vertexList) {
		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsRecursive(v);
				
				// dfsWithStack(v);
			}
		}

	}

	// Left to right
	private void dfsRecursive(Vertex v) {
		System.out.println(v + " ");
		for (Vertex vertex : v.getNeighbourList()) {
			if (!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
	}

	// Right to left, display on order of element added to arrayList
	private void dfsWithStack(Vertex rootVertex) {
		this.stack.add(rootVertex);

		while (!stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighbourList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
	}
}
