import java.io.*;
import java.util.*;

public class EdgeList implements Graph{
    private Vector<IntegerTriple> edge;
    private int edges;
    private int vertices;
    private String temp = "";

    public EdgeList(){
        this.edge = new Vector<IntegerTriple>();
    }

    public void addEdge(int w, int u, int v){
        edge.add(new IntegerTriple(w, u, v));
    }


    @Override
    public void read(String path) throws FileNotFoundException {
        // read file with parameter: path
        Scanner sc = new Scanner(new File(path));
        // create a variable: count to count number of edges
        int count = 0;
        while(sc.hasNextLine()){
            count++;
            String tmp[] = sc.nextLine().split(" ");
            addEdge(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
            if(!contains(temp, tmp[1])) temp += tmp[1] + ",";
            if(!contains(temp, tmp[2])) temp += tmp[2] + ",";

        }
        // calculate number of edges
        this.edges = count;
        this.vertices = temp.split(",").length;
        // close file
        sc.close();
    }

    private boolean contains(String tmp, String element){
        for(String t : tmp.split(",")){
            if(t.equals(element)) return true;
        }
        return false;
    }

    @Override
    public int numOfVertices() {
        return vertices;
    }

    @Override
    public int numOfEdges() {
        return this.edges;
    }

    @Override
    public void enumerateNeighbours(int u) {
        String tmp = u + "";
        if(!contains(temp, tmp)) throw new RuntimeException("u is not exists!!!");
        for (int i = 0; i < edges; i++) {
            if(edge.get(i).getSource() == u) System.out.print(edge.get(i).getDestination() + " ");
        }
        for (int i = 0; i < edges; i++) {
            if(edge.get(i).getDestination() == u) System.out.print(edge.get(i).getSource() + " ");
        }
        System.out.println();
    }

    @Override
    public boolean hasEdge(int u, int v) {
        if(!contains(temp, u + "") || !contains(temp, v + "")) throw new RuntimeException("Input error");
        for (int i = 0; i < edges; i++) {
            if(edge.get(i).getSource() == u && edge.get(i).getDestination() == v) return true;
            if(edge.get(i).getSource() == v && edge.get(i).getDestination() == u) return true;
        }
        return false;
    }

    @Override
    public void print() {
        System.out.println("--------------------");
        for (int i = 0; i < edge.size(); i++) {
            System.out.println(edge.get(i));
        }
        System.out.println("--------------------");
    }
}
