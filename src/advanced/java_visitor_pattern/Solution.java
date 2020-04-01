package advanced.java_visitor_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

enum Color {
	RED, GREEN
}

abstract class Tree {
	
	private int value;
	private Color color;
	private int depth;
	
	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}
	
	public int getValue() {
		return value;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
	
	private ArrayList<Tree> children = new ArrayList<>();
	
	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}
	
	public void accept(TreeVis visitor) {
		visitor.visitNode(this);
		
		for (Tree child : children) {
			child.accept(visitor);
		}
	}
	
	public void addChild(Tree child) {
		children.add(child);
	}
}

class TreeLeaf extends Tree {
	
	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}
	
	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
}

abstract class TreeVis {
	public abstract int getResult();
	
	public abstract void visitNode(TreeNode node);
	
	public abstract void visitLeaf(TreeLeaf leaf);
	
}

class SumInLeavesVisitor extends TreeVis {
	int sum = 0;
	
	public int getResult() {
		return sum;
	}
	
	public void visitNode(TreeNode node) {
		//implement this
	}
	
	public void visitLeaf(TreeLeaf leaf) {
		sum += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends TreeVis {
	private final int M = 1000000007;
	private long result = 1;
	
	public int getResult() {
		return (int) result;
	}
	
	public void visitNode(TreeNode node) {
		if (node.getColor().equals(Color.RED)) {
			result = (result * node.getValue()) % M;
		}
	}
	
	public void visitLeaf(TreeLeaf leaf) {
		if (leaf.getColor().equals(Color.RED)) {
			result = (result * leaf.getValue()) % M;
		}
	}
}

class FancyVisitor extends TreeVis {
	int sum1 = 0;
	int sum2 = 0;
	
	public int getResult() {
		return Math.abs(sum1 - sum2);
	}
	
	public void visitNode(TreeNode node) {
		if (node.getDepth() % 2 == 0) {
			sum1 += node.getValue();
		}
	}
	
	public void visitLeaf(TreeLeaf leaf) {
		if (leaf.getColor().equals(Color.GREEN)) {
			sum2 += leaf.getValue();
		}
	}
}

public class Solution {
	private static HashMap<Integer, HashSet<Integer>> map;
	private static int[] values;
	private static Color[] colors;
	private static Tree[] trees;
	private static Node[] nodes;
	
	public static Tree solve() {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		values = new int[n];
		colors = new Color[n];
		nodes = new Node[n];
		trees = new Tree[n];
		map = new HashMap<>();
		
		for (int i = 0; i < n; ++i) {
			values[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n; ++i) {
			colors[i] = scanner.nextInt() == 0 ? Color.RED : Color.GREEN;
		}
		
		for (int i = 0; i < n - 1; ++i) {
			int u = scanner.nextInt() - 1;
			int v = scanner.nextInt() - 1;
			
			if (!map.containsKey(u)) {
				map.put(u, new HashSet<Integer>());
			}
			
			map.get(u).add(v);
		}
		
		if (map.get(0).isEmpty()) {
			return new TreeLeaf(values[0], colors[0], 0);
		}
		
		for (int i : map.keySet()) {
			if (nodes[i] == null) {
				nodes[i] = new Node(i);
			}
			
			for (int j : map.get(i)) {
				if (nodes[j] == null) {
					nodes[j] = new Node(j);
				}
				
				nodes[i].children.add(j);
				nodes[j].children.add(i);
			}
		}
		
		removeParent(0, 0);
		
		return createTree(0);
	}
	
	private static void removeParent(int i, int d) {
		nodes[i].depth = d;
		
		for (int j : nodes[i].children) {
			nodes[j].children.remove(i);
			removeParent(j, d + 1);
		}
	}
	
	private static Tree createTree(int i) {
		if (trees[i] == null) {
			if (nodes[i].children.size() > 0) {
				trees[i] = new TreeNode(values[i], colors[i], nodes[i].depth);
				
				for (int j : nodes[i].children) {
					((TreeNode) trees[i]).addChild(createTree(j));
				}
			} else {
				trees[i] = new TreeLeaf(values[i], colors[i], nodes[i].depth);
			}
		}
		
		return trees[i];
	}
	
	public static void main(String[] args) {
		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();
		
		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);
		
		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
	
	private static class Node {
		int index;
		int depth;
		HashSet<Integer> children = new HashSet<>();
		
		Node(int index) {
			this.index = index;
		}
		
		@Override
		public String toString() {
			String type = children.size() > 1 ? "node" : "leaf";
			return "Node{" +
					       "index=" + (index + 1) +
					       ", depth=" + depth +
					       ", type=" + type +
					       '}';
		}
	}
}