import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        // Exercise 1
        AdjacencyMatrix matrix =  new AdjacencyMatrix();
        matrix.read("AM.txt");
//        System.out.println(matrix.numOfVertices());
//        matrix.print();
//        System.out.println(matrix.numOfEdges());
//
//        matrix.enumerateNeighbours(7);
//        System.out.println(matrix.hasEdge(1, 7));

       matrix.BFS(matrix.source, matrix.destination);
//        matrix.BFS(4);
//        System.out.println();
//        matrix.DFS(4);
//        System.out.println();
//        matrix.DFSWithoutRecursion(4);

        // Exercise 2
//        AdjacencyList list = new AdjacencyList();
//        list.read("AL.txt");
//        System.out.println(list.numOfVertices());
//        list.print();
//        System.out.println(list.numOfEdges());

//        AdjacencyList listConvert = matrix.convertAL();
//        listConvert.print();

//        list.enumerateNeighbours(7);
//        System.out.println(list.hasEdge(1, 5));

        // Exercise 3
//        EdgeList eList = new EdgeList();
//        eList.read("EL.txt");
//        System.out.println(eList.numOfEdges());
//        System.out.println(eList.numOfVertices());
//        eList.print();
//        eList.enumerateNeighbours(1);
//        System.out.println(eList.hasEdge(3, 0));

    }

}