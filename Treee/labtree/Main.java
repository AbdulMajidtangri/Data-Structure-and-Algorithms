package labtree;

import java.util.ArrayList;
import java.util.List;

class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    // Add a child node
    public void addChild(TreeNode<T> child) {
        this.children.add(child);
    }

    // Display the tree in a simple format
    public void display(String prefix) {
        System.out.println(prefix + data);
        for (TreeNode<T> child : children) {
            child.display(prefix + "--");
        }
    }
    public void displayChildren(String prefix) {
        for (TreeNode<T> child : children) {
            System.out.println(prefix + child.data);
        }
    }

 
    public boolean isLeaf() {
        return children.size() == 0;
    } public void printLeaf() {
        if (isLeaf()) {
            System.out.println("Leaf: " + data);
        } else {
            for (TreeNode<T> child : children) {
                child.printLeaf();
            }
        }
    }
}

class Tree<T> {
    TreeNode<T> root;

    public Tree(T rootData) {
        root = new TreeNode<>(rootData);
    }

    public void display() {
        if (root != null) {
            root.display("");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a tree with root node "A"
        Tree<String> tree = new Tree<>("A");

        // Add children to root node
        TreeNode<String> nodeB = new TreeNode<>("B");
        TreeNode<String> nodeC = new TreeNode<>("C");
        tree.root.addChild(nodeB);
        tree.root.addChild(nodeC);

        // Add children to node B
        TreeNode<String> nodeD = new TreeNode<>("D");
        TreeNode<String> nodeE = new TreeNode<>("E");
        nodeB.addChild(nodeD);
        nodeB.addChild(nodeE);

        // Add children to node C
        TreeNode<String> nodeF = new TreeNode<>("F");
        nodeC.addChild(nodeF);

        // Display the tree
        // tree.display();
        // tree.display();
        System.out.println("Displaying the childerns :");
        nodeB.displayChildren(" ");
        
    }
}
