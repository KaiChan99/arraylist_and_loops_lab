import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2,"Islay");

//        4. Print out the index position of "Skye"
        System.out.println("Index of Skye: "+scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
       int numberIslands = scottishIslands.size();
        System.out.println("The number of islands in the arraylist: " + numberIslands );

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
        for ( String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> even = new ArrayList<>();


        for(int i=0;i<numbers.size();i++) {
            if (numbers.get(i) % 2 == 0) {
                even.add(numbers.get(i));
            }
        }

        System.out.println(even);


//        2. Print the difference between the largest and smallest value

        int largest = numbers.get(0);
        int smallest = numbers.get(0);

        for(int g = 0 ;g < numbers.size(); g++) {
//            numbers[i] = numbers.get(i);



                if (smallest > numbers.get(g)) {
                    smallest = numbers.get(g);
                }
                if (largest < numbers.get(g)) {

                    largest = numbers.get(g);
                }


        }
        System.out.println("Smallest " + smallest + " Largest " + largest);
        int difference = (largest - smallest);
        System.out.println("Difference between largest and smallest is " + difference);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 7.

    }

}
