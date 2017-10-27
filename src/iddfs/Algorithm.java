package iddfs;

import java.util.Stack;

public class Algorithm {
	private Node targetVertex;
	private volatile boolean isTargetFound;
	//**Added to stop the execution if the node cannot be found
	private volatile String vertextPathNames1 = "x";
	private volatile String vertextPathNames2 = "";
	//********************************
	public Algorithm(Node targetVertex) {
		this.targetVertex = targetVertex;
	}
	
	public void runDeepingSearch(Node rootVertex) {
		int depth = 0;
		
		while(!isTargetFound && !vertextPathNames1.equals(vertextPathNames2)) {
			vertextPathNames2 = vertextPathNames1;
			vertextPathNames1 = "";

			dfs(rootVertex, depth);
			System.out.println();
			
			depth++;
			
		}
	}
	
	private void dfs(Node sourceVertex, int depthLevel) {
		Stack<Node> stack = new Stack<>();
		sourceVertex.setDepthLevel(0);
		stack.push(sourceVertex);
		int e = 1;
		while(!stack.isEmpty()) {
			
			Node actualNode = stack.pop();
			System.out.print(actualNode+" ");
			vertextPathNames1 += actualNode.getName();
			if(actualNode.getName().equals(this.targetVertex.getName())) {
				System.out.println("Node has been found...");
				this.isTargetFound = true;
				return;
			}
			if(actualNode.getDepthLevel() >= depthLevel) {
				continue;
			}
			
			for(Node node: actualNode.getAdjacenciesList()) {
				node.setDepthLevel(actualNode.getDepthLevel()+1);
				stack.push(node);
			}
			e++;
		}

	}
}
