public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(1, "SKO");
        tree.insert(25, "sld");
        tree.insert(37,"dsds");
        tree.insert(45,"fdlks");
        tree.insert(53,"dkjssf");
        tree.insert(71,"dslfkdsf");
        tree.insert(62,"fsjfkf");
        tree.insert(66,"dsds");
        tree.insert(77,"fdlks");
        tree.insert(88,"dkjssf");
        tree.insert(99,"dslfkdsf");
        tree.insert(12,"fsjfkf");
        tree.insert(13,"dsds");
        tree.insert(14,"fdlks");
        tree.insert(15,"dkjssf");
        tree.insert(16,"dslfkdsf");
        tree.insert(17,"fsjfkf");


        System.out.println(tree.findLeafs(tree.find(1)));


    }





}
