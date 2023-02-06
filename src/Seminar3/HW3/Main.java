package Seminar3.HW3;

public class Main {
    public static void main(String[] args) {
        LinkList<Integer> linkedList = new LinkList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);

        for (Integer item : linkedList) {
            System.out.println(item);
        }
    }
}
