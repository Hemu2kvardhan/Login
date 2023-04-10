package Login;

import java.util.ArrayList;

import java.util.Scanner;

public class Sort_duplicate_elements_in_unorder {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter no.of elements in list1  : ");
        int n = x.nextInt();

        System.out.print("Enter the elements of the list1 \n");

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list1.add(x.nextInt());
        }

        System.out.print("Enter no.of elements in list2  : ");
        int n1 = x.nextInt();
        System.out.print("Enter the elements of the list2 \n");
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= n1; i++) {
            list2.add(x.nextInt());
        }

        ArrayList<Integer> merging = new ArrayList<Integer>();
        merging.addAll(list1);
        merging.addAll(list2);
        System.out.println("Merging of list1 & list2 elements :" + merging);

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer element : list1) {
            if (list2.contains(element)) {
                duplicates.add(element);
            }
        }
        System.out.println("Duplicate elements: " + duplicates + "\n");

        Integer[] duplicatesArray = duplicates.toArray(new Integer[0]);

        System.out.println("Sorted Duplicate elements: ");

        for (int i = 0; i < duplicatesArray.length; i++) {
            for (int j = i + 1; j < duplicatesArray.length; j++) {
                if (duplicatesArray[i] > duplicatesArray[j]) {
                    int temp = duplicatesArray[i];
                    duplicatesArray[i] = duplicatesArray[j];
                    duplicatesArray[j] = temp;

                }
            }
        }

        for (int b : duplicatesArray) {
            System.out.println(b);
        }
        // Arrays.sort(duplicatesArray);
        // System.out.println("Sorted Duplicate elements: " +
        // Arrays.toString(duplicatesArray));

    }

}
