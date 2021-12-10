import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AVL {
    private Node root;

    public Node getRoot(){
        return this.root;
    }

    // insert case
    public void insert(int data){
        root = insert(root, data);
    }

    private Node insert(Node root, int data){
        if(root == null) return new Node(data);
        if(data == root.data) return root;
        if(data > root.data){
            root.right = insert(root.right, data);
        }else if(data < root.data){
            root.left = insert(root.left, data);
        }else{
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalanced(root);

        // left left case
        if(balance > 1 && data < root.left.data) return rotateRight(root);
        // right right case
        if(balance < -1 && data > root.right.data) return rotateLeft(root);
        // left right case
        if(balance > 1 && data > root.left.data) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        // right left case
        if(balance < -1 && data < root.right.data){
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }

    // delete case
    public void delete(int data){ root = delete(root, data); }

    private Node delete(Node root, int data){
        if(root == null) return root;
        if(data < root.data) root.left = delete(root.left, data);
        else if(data > root.data) root.right = delete(root.right, data);
        else{
            // root with only one child or no child
            if(root.left == null || root.right == null){
                Node temp = null;
                if(temp == root.left) temp = root.right;
                else temp = root.left;
            // root with no child
                if(temp == null){
                    temp = root;
                    root = null;
                }else{
                    root = temp;
                }
            }else{
                // node with 2 children
                Node temp = min(root.right);
                root.data = temp.data;
                root.right = delete(root.right, temp.data);
            }
            if(root == null) return root;

            // update height
            root.height = 1 + Math.max(height(root.left), height(root.right));

            // check balance
            int balance = getBalanced(root);

            // left left case
            if(balance > 1 && getBalanced(root.left) >= 0) return rotateRight(root);
            // right right case
            if(balance < -1 && getBalanced(root.right) <= 0) return rotateLeft(root);
            // left right case
            if(balance > 1 && getBalanced(root.left) < 0){
                root.left = rotateLeft(root.left);
                return rotateRight(root);
            }
            // right left case
            if(balance < -1 && getBalanced(root.right) > 0){
                root.right = rotateRight(root.right);
                return rotateLeft(root);
            }
        }
        return root;
    }

    private Node min(Node node){
        Node tmp = node;
        while(tmp.left != null){
            tmp = tmp.left;
        }
        return tmp;
    }

    public void print(){
        print(root, 0);
    }

    private void print(Node node, int level){
        if(node == null) return;
        print(node.right, level + 1);
        for (int i = 1; i <= level; i++) {
            System.out.print("\t");
        }
        System.out.println(node.data);
        print(node.left, level + 1);
    }

    private int height(Node node){
        if(node == null) return 0;
        return node.height;
    }

    private int getBalanced(Node node){
        return node == null ? 0: height(node.left) - height(node.right);
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    public AVL createFormFile(String path) throws IOException {
        AVL myTree = new AVL();
        try{
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                int tmp = Integer.parseInt(sc.nextLine());
                myTree.insert(tmp);
            }
            sc.close();
            return myTree;
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
