public class Node {
    int data;
    Node left;
    Node right;
    int height;

    public Node(int data){
        this.data = data;
        this.height = 1;
        this.left = this.right = null;
    }
}
