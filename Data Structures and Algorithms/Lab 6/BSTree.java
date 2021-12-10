public class BSTree {
    private Node root;

    public Node getRoot(){
        return this.root;
    }

    public void insert(int data){
        root = insert(root, data);
    }

    private Node insert(Node node, int data){
        if(node == null){
            return new Node(data);
        }

        if(data > node.data){
            node.right = insert(node.right, data);
        }else if(data < node.data){
            node.left = insert(node.left, data);
        }
        return node;
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

    //exercise 3
    public void printAscending(){
        printAscending(root);
    }

    private void printAscending(Node node){
        if(node == null) return;
        printAscending(node.left);
        System.out.print(node.data + " ");
        printAscending(node.right);
    }

    //exercise 4
    public void printDescending(){
        printDescending(root);
    }

    private void printDescending(Node node){
        if(node == null) return;
        printDescending(node.right);
        System.out.print(node.data + " ");
        printDescending(node.left);
    }

    //exercise 5
    public boolean contains(int key){
        return contains(root, key);
    }

    private boolean contains(Node node, int key){
        if(node == null) return false;
        if(node.data == key) return true;
        if(node.data < key){
            return contains(node.right, key);
        }else if(node.data > key){
            return contains(node.left, key);
        }
        return false;
    }
    //exercise 6
    public void deleteMax(){
        root = deteleMax(root);
    }

    private Node deteleMax(Node node){
        if(node.right == null) return node.left;
        node.right = deteleMax(node.right);
        return node;
    }

    //exercise 7
    //exercise 8
    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    //exercise 10
    public int sum(){
        return sum(root);
    }

    //exercise 9
    public int sum(Node node){
        if(node == null) return 0;
        return node.data + sum(node.right) + sum(node.left);
    }
}
