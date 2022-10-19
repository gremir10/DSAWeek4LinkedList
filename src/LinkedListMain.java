public class LinkedListMain
{
    public static void main(String[] args)
    {      //make new list
        OgLinkedList testList = new OgLinkedList();
        testList.append("A");
        testList.append("B");
        testList.append("C");

        System.out.println("List size: " + testList.getSize());
        testList.printList();   //prints A B C

        System.out.println("----------------");
        testList.insert("1", 0);
        testList.insert("2", 2);
        testList.insert("3", 4);
        testList.insert("4", 6);

        testList.insert("4", 99); //check if you're going beyond size of current list
        testList.append("Append"); //check to make sure you're not inserting new tail w an index #
        testList.printList();

    }
}