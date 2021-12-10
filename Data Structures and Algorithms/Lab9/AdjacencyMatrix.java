import java.io.*;
import java.util.*;

public class AdjacencyMatrix implements Graph {
    private int adj[][];
    private int size;
    private int edges;

    int source;
    int destination;

    public void read(String path) throws FileNotFoundException {
        // read file with parameter: path
        File file = new File(path);
        // create variable sum to calculate edges
        int sum = 0;
        // create Scanner
        Scanner sc = new Scanner(file);
        // read the size
        String []temp = sc.nextLine().split(" ");
        this.size = Integer.parseInt(temp[0]);
        this.source = Integer.parseInt(temp[1]);
        this.destination = Integer.parseInt(temp[2]);
        //sc.nextLine(); // jump the next line (from second line)
        // create the matrix with size x size
        this.adj = new int[size][size];

        // read line by line and assign value into adj
        for (int i = 0; i < size; i++) {
            String line = sc.nextLine();
            String numbers[] = line.split(" ");
            for (int j = 0; j < size; j++) {
                int tmp = Integer.parseInt(numbers[j]);
                sum += tmp;
                adj[i][j] = tmp;
            }
        }
        this.edges = sum;
        // close the file
        sc.close();
    }

    private boolean check() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (adj[i][j] != adj[j][i]) return false;
            }
        }
        return true;
    }

    public int numOfVertices() {
        return size;
    }

    public int numOfEdges() {
        if (check()) return this.edges / 2;
        return edges;
    }

    public void enumerateNeighbours(int u) {
        // check u
        if (u < 1 || u > size) {
            throw new RuntimeException("u is not exists");
        }
        /*
           user transmitted from 1 to 7 but the program work from 0 to 6
           so we should minus 1.
        */
        int row = u - 1;
        for (int i = 0; i < size; i++) {
            if (adj[row][i] == 1) System.out.println((i + 1) + " ");
        }
        System.out.println();
    }

    public boolean hasEdge(int u, int v) {
        if (u < 1 || u > size || v < 1 || v > size) throw new RuntimeException("u or v not exists");
        /*
           user transmitted from 1 to 7 but the program work from 0 to 6
           so we should minus 1.
        */
        u--;
        v--;
        return adj[u][v] == 1;
    }

    @Override
    public void print() {
        System.out.println("-----------------");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    public AdjacencyList convertAL() {
        LinkedList<Integer>[] list = new LinkedList[this.size];
        for (int i = 0; i < this.size; i++) {
            list[i] = new LinkedList<>();
        }
        int i, j;
        for (i = 0; i < this.size; i++) {
            for (j = 0; j < adj.length; j++) {
                if (adj[i][j] == 1) list[i].addLast(j);
            }
        }

        return new AdjacencyList(this.size, list, this.edges);
    }


    public void BFS(int v){
        boolean visited[] = new boolean[size];
        Queue <Integer > queue = new LinkedList <Integer >();

        visited[v] = true;
        queue.add(v);

        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x + " ");

            for(int i = 0; i < size; i++){
                if(adj[x][i] != 0 && visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void BFS(int s, int d){
        boolean visited[] = new boolean[size];
        Queue <Integer > queue = new LinkedList <Integer>();

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty() || visited[d] == false){
            int x = queue.poll();
            System.out.print(x + 1 + " ");

            for(int i = 0; i < size; i++){
                if(adj[x][i] != 0 && visited[i] == false){
                    if(visited[d] == true){
                        break;
                    }
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public void DFS(int v){
        boolean visited[] = new boolean[size];
        DFS(v, visited);
    }

    public void DFS(int v, boolean []visited){
        visited[v] = true;
        System.out.print(v + " ");

        for(int i = 0; i < size; i++){
            if(adj[v][i] != 0 && visited[i] == false){
                DFS(i, visited);
            }
        }
    }

    public void DFSWithoutRecursion(int v){
        Stack<Integer> stack = new Stack<>();
        boolean []visited = new boolean[size];

        v -= 1;
        stack.push(v);
        while(!stack.isEmpty()){
            int result = stack.pop();
            System.out.print(result +  " ");

            for (int i = 0; i < size; i++) {
                if(!visited[i] && adj[result][i] == 1){
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }

}