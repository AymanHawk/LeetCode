package Notes.DataStructures.LinkedList;

import java.util.LinkedList;

/*
* Linked List stores values in containers such that each container has reference to ONLY the next container not previous
* Linked List is better for fetching data and storing data, ArrayList is better for manipulating data
* */

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(34);
        nums.add(545);
        nums.add(91);
        nums.add(1);
        nums.add(20);
        nums.add(73);
        System.out.println(nums);

        nums.addFirst(34);
        nums.addLast(10000);
        nums.removeFirst();
        nums.removeLast();
        Integer index1 = nums.getFirst();
        Integer indexN = nums.getLast();
        System.out.println(nums + "\n" + "First index: " + index1 + "\nLast Index: " + indexN);

    }
}
