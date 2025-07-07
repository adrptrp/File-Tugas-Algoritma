package Linked;

public class Linkedlistmanipulations {
    public static void main(String[] args) {
        List list = new List(); // create the List container

        // insert integers in list
        list.insertAtFront(-1); 
        list.print();             
        list.insertAtFront(0); 
        list.print();            
        list.insertAtBack(1);  
        list.print();            
        list.insertAtBack(5);  
        list.print();            

        // remove objects from list; print after each removal
        try {
            Object removedObject = list.removeFromFront();
            System.out.printf("%s removed\n", removedObject);
            list.print();

            removedObject = list.removeFromFront();
            System.out.printf("%s removed\n", removedObject);
            list.print();

            removedObject = list.removeFromBack();
            System.out.printf("%s removed\n", removedObject);
            list.print();

            removedObject = list.removeFromBack();
            System.out.printf("%s removed\n", removedObject);
            list.print();
        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
