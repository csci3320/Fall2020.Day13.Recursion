
public class BinaryTree<T extends Comparable> implements MyCollection<T>{

    private Node<T> root;

    public BinaryTree(){
        root = null;
    }

    public void add(T toAdd){
        Node<T> node = new Node<T>(toAdd);
        if(root == null){
            root = node;
        }
        else{
            addNode(root, node);
        }
    }

    public void addNode(Node<T> parentNode, Node<T> toAdd){
        if(toAdd.getValue().compareTo(parentNode.getValue()) <= 0){
            //Go left
            if(parentNode.getLeft() == null){
                parentNode.setLeft(toAdd);
            }
            else{
                addNode(parentNode.getLeft(), toAdd);
            }
        }
        else{
            //Go right
            if(parentNode.getRight() == null){
                parentNode.setRight(toAdd);
            }
            else{
                addNode(parentNode.getRight(), toAdd);
            }

        }

    }

    public int size(){
        return size(root);
    }

    public int size(Node<T> parent){
        if(parent == null) return 0;
        int leftSize = size(parent.getLeft());
        int rightSize = size(parent.getRight());
        return leftSize + rightSize + 1;
    }

    public boolean isEmpty(){
        return false;
    }

    public void remove(T toRemove){

    }

    public boolean contains(T element){
        return false;
    }

}
