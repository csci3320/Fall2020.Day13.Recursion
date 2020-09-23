//Generates an HTML view of our tree

import java.nio.file.*;

public class Main {

    String html;
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        BinaryTree<String> myCollection = new BinaryTree();
        System.out.println(myCollection.size());
        myCollection.add("mike");
        System.out.println(myCollection.size());
        myCollection.add("golf");
        System.out.println(myCollection.size());
        myCollection.add("sierra");
        System.out.println(myCollection.size());
        myCollection.add("alpha");
        System.out.println(myCollection.size());

        html = "<!doctype html><html><head><title>Binary Tree</title></head><body><div style='position:relative'>";

        Node<String> root = myCollection.root;

        addName(root, 0,0,1000);


        html += "</div></body></html>";

        try {
            Files.write(Paths.get("./binary.html"), html.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addName(Node<String> parent, int depth, int left, int right) {
        if(parent == null) return;

        int middle = (right - left)/2 + left;

        html += "<div style='position:absolute;left:" + (middle) + "px;top:" + ((depth * 100) + 50) + "px;'>" + parent.getValue() + "</div>";
        addName(parent.getLeft(), depth + 1, left, middle);
        addName(parent.getRight(), depth + 1, middle, right);
        
    }
}
