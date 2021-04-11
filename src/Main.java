import java.util.*;

public class Main {

    //1. Create an array of strings and add 10 elements
    public static void main(String[] args) {
        String[] array = new String[10];
        array[0] = "a";
        for (int i = 1; i < 10; i++) {
            array[i] = array[i - 1] + "a";
            System.out.println("I have created an array, and I have added the following elements: "+array[i]);
        }


        //2. Create a linked list and add 10 elements
        LinkedList<String> ll = new LinkedList<>();
        ll.add(0, "a");
        for (int i = 1; i < 10; i++) {
            ll.add(i, ll.getLast() + "a");
        }
        System.out.println("I have created a LinkedList , and I have added the following elements: "+ll);


        //3. Create an array list and add 10 elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "a");
        for (int i = 1; i < 10; i++) {
            arrayList.add(i, arrayList.get(i - 1) + "a");
        }
        System.out.println("I have created an ArrayList , and I have added the following elements: "+ arrayList);

//        5. Create the a list collection that contains 10 elements and iterate with
//        forEach and Iterator over them to print them
        System.out.println("forEach print - linkedList");
        ll.forEach((n) -> System.out.println(n));
        System.out.println("forEach print - arrayList");
        arrayList.forEach((n) -> System.out.println(n));

        System.out.println("iterator print");
        Iterator<String> iter = ll.iterator();
        while (iter.hasNext()) System.out.println(iter.next());

        //    4. Create the most appropriate list collection that contains 10 elements
//    and remove and 3-rd and 7-th element of the initial collection
        ll.remove(2);
        ll.remove(6);
        System.out.println(ll);
        arrayList.remove(2);
        arrayList.remove(6);

        //   8. Create a program using arrays, that will order its contents in descending order.
//    The numbers will be provided from user input (keyboard).
//    Try to create three methods, that each will perform a specific task (get input, print, sort)
        int[] array1 = getInput();
        print(array1);
        System.out.println("Sorted array: ");
        print(sort(array1));

        //   9. Create a program that will find the minimum provided number. The
//    numbers will be provided from user input (keyboard), and numbers are
//    going to be continuously added in the structure till the user provides a
//“n” in the prompt asking him for another number.
        List<Integer> list = getInput2();
        Integer max = Collections.max(list);
        System.out.println("The max of the numbers provided is: " + max);
    }


    static int[] getInput() {
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers are you going to insert?");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Please insert " + size + " numbers");
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }
        return array;
    }


    static List<Integer> getInput2() {
        System.out.println("Please insert several numbers in order to find the maximum of them! " +
                "Press n to stop the process");
        Scanner console = new Scanner(System.in);
        List<String> list = new ArrayList();
        list.add(console.next());
        while (!list.get((list.size() - 1)).equals("n")) {
            System.out.println("Give an other one!");
            list.add(console.next());
        }
        list.remove(list.size() - 1);
        List<Integer> intList = new ArrayList<>();
        for (String s : list) intList.add(Integer.valueOf(s));
        return intList;
    }


    static void print(int[] array) {
        System.out.print("You have inserted: [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
        System.out.println();
    }

    static int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }


        }
        return array;
    }

}