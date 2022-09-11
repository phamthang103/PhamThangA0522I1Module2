package tuan8;

public class MyArrayList <E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;

    private E elements[];

    public MyList1() {
        elements= (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList1(int size) {
        elements= (E[]) new Object[size];
    }

    public void add(E e) {
        if(size==elements.length){
            size++;
        }
        elements[size++]=e;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public boolean addToIndex(int index, E e){
        if(index>=0 && index<=size){
            size++;
            for(int i=size-1; i>=index; i--){
                elements[i+1]= elements[i];
            }
            elements[index]= e;
            return true;
        }
        return false;
    }
    public boolean removeToIndex(int index){
        if(index>=0 && index<size){
            for(int i=index; i<size;i++){
                elements[i]= elements[i+1];
            }
            size--;
            return true;
        }
        return false;
    }
    public int getSize() {
        return size;
    }


    @Override
    public MyList1 clone() {
        MyList1<E> clone = new MyList1<>(elements.length);
        for (E x : elements) {
            clone.add(x);
        }
        return clone;
    }
    public boolean contains(E e){
        for(int i=0; i<size;i++){
            if(elements[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        for(int i=0; i<size;i++){
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    public E get(int index){
        return elements[index];
    }
    public  void clear(){
        for(int i=0; i<size;i++){
            elements[i]=null;
        }
        ensureCapacity(DEFAULT_CAPACITY);
    }
    public void ensureCapacity(int minCapacity){
        this.size=DEFAULT_CAPACITY;
    }
    public static void main(String[] args) {

        MyList1<String> myList1= new MyList1<String>();

        myList1.addToIndex(0,"tham");
        System.out.println("List: ");
        for(int i=0; i<myList1.size;i++){
            System.out.println(myList1.get(i));
        }
    }

}
