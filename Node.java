
public class Node<T extends Comparable> {

    private Node<T> left;
    private Node<T> right;
    private T value;

    public Node(T object){
        value = object;
    }

    public T getValue(){
        return value;
    }

    public Node<T> getLeft(){
        return left;
    }
    public Node<T> getRight(){
        return right;
    }
    public void setLeft(Node<T> inLeft){
        left = inLeft;
    }
    public void setRight(Node<T> inRight){
        right = inRight;
    }

}
