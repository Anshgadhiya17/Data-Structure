import java.util.*;
public class Binary_Tree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        // int[] arr= {10,20,30,40,50,45,60,15,70};
        System.out.print("Enter Array Size==> ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            tree.root=tree.Insert(tree.root,arr[i]);
        }  
        System.out.print("Pre Order Traversal : ");
        tree.preOrder(tree.root);
        System.out.print("\nInOrder Traversal : ");
        tree.inOrder(tree.root);
        System.out.print("\nPostorder Traversal : ");
        tree.postOrder(tree.root);
    }
}

class Node{
    int value;
    Node left,right;

    Node(int value){
        this.value = value;
        left = right = null;
    }
}

class BinaryTree{
    Node root;

    public Node Insert(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<root.value){
             root.left=Insert(root.left,value);
        }
        else{
             root.right=Insert(root.right,value);
        }
        return root;
    }

    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }
}