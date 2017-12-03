import java.util.List;

/**
 * Created by Ксюша on 23.11.2017.
 */
public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> myList = new MyLinkedList<String>();

        myList.addFirst("Oksi");

        myList.addFirst("Kate");

        myList.addFirst("Lena");

        System.out.println(myList.getFirstNode());

        System.out.println(myList.getLastNode());






    }


}
