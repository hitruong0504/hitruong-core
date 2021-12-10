import java.io.FileNotFoundException;

public interface Graph {

    public void read(String path) throws FileNotFoundException;

    public int numOfVertices();

    public int numOfEdges();

    public void enumerateNeighbours(int u);

    public boolean hasEdge(int u, int v);

    public void print();
}
