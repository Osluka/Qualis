import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class ListEx {

    /*
    public static void main(String[] args) {

        List<String> Forbes = new ArrayList<String>();
        Forbes.add("Emmanuel Diaz Ortega");
        Forbes.add("Oscar Crespo Cabrera");
        System.out.println("2021 Forbes Trillion");
        System.out.println("2021 Forbes Trillion");
        System.out.println(Forbes);
     }
     */
    
    List<String> al = new ArrayList<String>();
    al.add("Chaitanya");
    al.add("Rahul");
    al.add("Ajeet");
    System.out.println("ArrayList Elements: ");
    System.out.print(al);

   List<String> ll = new LinkedList<String>();
   ll.add("Kevin");
   ll.add("Peter");
   ll.add("Kate");
   System.out.println("\nLinkedList Elements: ");
   System.out.print(ll);
    }
}