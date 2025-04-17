//package org.LinkedList;
//
//import java.util.Arrays;
//import java.util.List;
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//
//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        if (l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }
//
//    // Helper method to convert List<Integer> to ListNode
//    public static ListNode fromList(List<Integer> values) {
//        ListNode dummy = new ListNode(0);
//        ListNode current = dummy;
//
//        for (int val : values) {
//            current.next = new ListNode(val);
//            current = current.next;
//        }
//
//        return dummy.next;
//    }
//
//    // Helper method to print linked list
//    public static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val);
//            if (head.next != null) System.out.print(" -> ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//}
//
//public class MergeTwoLinkedList {
//    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(1, 2, 4);
//        List<Integer> list2 = Arrays.asList(1, 3, 4);
//
//        ListNode l1 = ListNode.fromList(list1);
//        ListNode l2 = ListNode.fromList(list2);
//
//        ListNode merged = ListNode.mergeTwoLists(l1, l2);
//
//        ListNode.printList(merged); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
//    }
//}
