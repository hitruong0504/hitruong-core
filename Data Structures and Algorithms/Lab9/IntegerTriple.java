public class IntegerTriple {
    private Integer weight, source, destination;

    public IntegerTriple(Integer w, Integer s, Integer d){
        this.weight = w;
        this.source = s;
        this.destination = d;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getSource() {
        return source;
    }

    public Integer getDestination() {
        return destination;
    }

    public String toString(){
        return weight + " " + source + " " + destination;
    }
}
