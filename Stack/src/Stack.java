public class Stack<T, E> {

    // Instance Data

    private int size;
    private StackNode topItem;

    // Constructors

    public Stack(){
        size = 0;
    }

    // Methods

    public void push(E element){

        StackNode newItem = new StackNode(element);

        if (size == 0){
            topItem = newItem;
        } else{
            StackNode subItem = topItem;
            topItem = newItem;
            topItem.setChildNode(subItem);
        } size++;
    }

    public T pop(){
        T value = (T) topItem.getValue();
        topItem = topItem.getChildNode();
        return value;
    }

    public T peek(){

    }
    public boolean isEmpty(){

    }

    public int size(){

    }
}
