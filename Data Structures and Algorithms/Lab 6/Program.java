public class Program {

    //exercise 2
    public static BSTree createTree(String input){
        String[] items = input.split(" ");
        BSTree tree = new BSTree();

        for(String item : items){
            int data = Integer.parseInt(item);
            tree.insert(data);
        }
        return tree;
    }

    public static void main(String[] args) {
        BSTree tree = createTree("50 30 70 20 40 60 80 91 15 46 52 68 77 33 27");
        tree.print();
//        tree.printAscending();
//        System.out.println();
//        tree.printDescending();
        tree.deleteMax();
        System.out.println("\n\n----------------------\n\n");
        tree.print();
//        System.out.println(tree.contains(45));
//        System.out.println("Height of tree= " + tree.height());
//        System.out.println("Sum of BST= " + tree.sum(tree.getRoot().right));
    }
}
