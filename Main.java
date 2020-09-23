public class Main{
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        MyCollection<String> myCollection = new BinaryTree();
        System.out.println(myCollection.size());
        myCollection.add("mike");
        System.out.println(myCollection.size());
        myCollection.add("golf");
        System.out.println(myCollection.size());
        myCollection.add("sierra");
        System.out.println(myCollection.size());
        myCollection.add("alpha");
        System.out.println(myCollection.size());
    }
}
