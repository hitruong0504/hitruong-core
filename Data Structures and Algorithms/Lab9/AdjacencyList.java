import java.io.*;
import java.util.*;

public class AdjacencyList implements Graph{
    private int size;
    private LinkedList<Integer> adj[];
    private int edges;

    public AdjacencyList(int size, LinkedList<Integer>[] adj, int edges) {
        this.size = size;
        this.adj = adj;
        this.edges = edges;
    }

    public AdjacencyList() {

    }

    @Override
    public void read(String path) throws FileNotFoundException {
        // read file with parameter: path
        Scanner sc =  new Scanner(new File(path));
        // read the size
        this.size = sc.nextInt();
        // create a variable: count to calculate edges
        int count = 0;
        // from the second line
        sc.nextLine();
        // create adj with size
        this.adj = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            // split each line with " "
            String numbers[] = sc.nextLine().split(" ");
            int index = Integer.parseInt(numbers[0]);
            // each element in array is a linked list, so we create a linked list
            adj[index] = new LinkedList<>();

            for (int j = 1; j < numbers.length; j++) {
                adj[index].addLast(Integer.parseInt(numbers[j]));
                count++;
            }
        }
        // calculate number of edges
        this.edges = count / 2;
        // close file
        sc.close();
    }

    @Override
    public int numOfVertices() {
        return this.size;
    }

    @Override
    public int numOfEdges() {
        return this.edges;
    }

    @Override
    public void enumerateNeighbours(int u) {
        if(u < 1 || u > size) throw new RuntimeException("u is not exists");
        /*
           user transmitted from 1 to 7 but the program work from 0 to 6
           so we should minus 1.
        */
        u--;
        LinkedList<Integer> list = adj[u];
        for(int i = 0; i < list.size(); i++){
            int value = 1 + list.get(i);
            System.out.print(value + " ");
        }
        System.out.println();
    }

    @Override
    public boolean hasEdge(int u, int v) {
        if(u < 1 || u > size) throw new RuntimeException("u is not exists");
        /*
           user transmitted from 1 to 7 but the program work from 0 to 6
           so we should minus 1.
        */
        u--;
        LinkedList<Integer> list = adj[u];

        return list.contains(v);
    }

    @Override
    public void print() {
        System.out.println("------------------------------");
        for (int i = 0; i < size; i++) {
            LinkedList<Integer> list = adj[i];
            System.out.print((i + 1) + "-> ");

            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + 1);
                if(j != list.size() - 1) System.out.print("-> ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}
