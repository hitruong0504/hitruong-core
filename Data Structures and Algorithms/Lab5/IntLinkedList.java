public class IntLinkedList implements ListInterface{
    //attributes
    private Node head;
    private int numNode;

    //constructor
    public IntLinkedList() {
        this.head = null;
        this.numNode = 0;
    }


    @Override
    public void addFirst(int data) {
        head = new Node(data, head);
        numNode++;
    }

    private boolean contains(int data){
        Node tmp = head;
        while (tmp != null){
            if(tmp.getData() == data) return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public boolean addLast(int data) {
        if (contains(data)) {
            return false;
        }
        if(head == null){
            addFirst(data);
            return true;
        }else{
            Node tmp = head;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(data));
            numNode++;
        }
        return true;
    }

    @Override
    public boolean removeAt(int position) {
        if(position > numNode){
            return false;
        }

        if(position == 1){
            head = head.getNext();
            numNode--;
            return true;
        }

        Node tmp = head;
        int runner = 1;
        while (tmp != null){
            if((runner + 1) == position){
                tmp.setNext(tmp.getNext().getNext());
                return true;
            }
            tmp = tmp.getNext();
            runner++;
        }
        return false;
    }

    @Override
    public int countOdd() {
        int oddNumber = 0;
        if(head == null) return 0;
        Node tmp = head;
        while(tmp != null){
            if(tmp.getData() % 2 == 1){
                oddNumber++;
            }
            tmp = tmp.getNext();
        }
        return oddNumber;
    }

    @Override
    public int searchKey(int key) {
        int KEY = 1;
        if(head == null) return -1;
        Node tmp = head;
        while(tmp != null){
            if(tmp.getData() == key) return KEY;
            tmp = tmp.getNext();
            KEY++;
        }
        return -1;
    }

    @Override
    public boolean checkSorted() {
        /*
        * 0 element: null
        * 1 element: 1 or n
        * 2 element: 8 9 or 9 8
        * are sorted
        */
        if(numNode < 3) return true;
        /*-------------------------------------------------*/
        /*
        * 8 5 x x x x
        * 8 8 5 x x x
        * 8 8 8 9 x x
        * 8 8 8 8 8 8
        */
        int direction = 0; //accending order or descending order
        Node tmp = head.getNext();
        while(tmp != null && tmp.getData() == head.getData()){
            tmp = tmp.getNext();
        }
        // tmp run to null
        if(tmp == null) return true;
        //otherwise
        if(tmp.getData() > head.getData()){
            direction = 1; // accending order
        }else{
            direction = -1; // descending order
        }
        while(tmp.getNext() != null){
            Node nextNode = tmp.getNext();

            int before = tmp.getData();
            int after = nextNode.getData();

            // c meaning condition.
            boolean c1 = (direction == 1 && before > after);
            boolean c2 = (direction == -1 && before < after);

            if(c1 || c2) return false;

            tmp = tmp.getNext();
        }
        return true;
    }

    public void print(){
        if(head == null){
            System.out.println("List is empty!!!");
            return;
        }
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.getData());
            tmp = tmp.getNext();
            if(tmp != null){
                System.out.print(" -> ");
            }else
                System.out.println();
        }
    }
}
