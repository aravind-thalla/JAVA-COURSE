package linkedList;

public class main {
  public static void main(String[] args) {
   /*  LL list = new LL();
    list.insertFirst(3);
    list.insertFirst(5);
    list.insertFirst(9);
    list.insertFirst(17);
    list.insertLast(99);
    list.insert(101, 4);
    list.display();
    System.out.println(list.deletFirst());
    list.display();
    //System.out.println(list.get(3));
    list.display();
    System.out.println(list.deleteLast());
    list.display();
    System.out.println(list.delete(2));
    list.display();
    System.out.println(list.find(101));*/

    /*DLL list = new DLL();
    list.insertFirst(3);
    list.insertFirst(5);
    list.insertFirst(9);
    list.insertFirst(17);
    list.insertLast(101);
    list.insert(9, 9);
    list.display();*/

    CLL list = new CLL();
    list.insert(23);
    list.insert(3);
    list.insert(19);
    list.insert(75);
    list.display();
    list.delete(19);
    list.display();
  }

}