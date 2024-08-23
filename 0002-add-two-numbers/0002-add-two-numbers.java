/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = "", str2 = "";

        while(l1 != null){
            str1 = String.valueOf(l1.val).concat(str1);
            l1 = l1.next;
        }

        while(l2 != null){
            str2 = String.valueOf(l2.val).concat(str2);
            l2 = l2.next;
        }

        // Use BigInteger to handle large numbers
        BigInteger num1 = new BigInteger(str1.toString());
        BigInteger num2 = new BigInteger(str2.toString());
        
        // Calculate the total sum
        BigInteger total = num1.add(num2);
        String totalStr = total.toString();
        
         // Initialize l3 as null
        ListNode l3 = null;
        ListNode tail = null; // This will keep track of the end of the list
        
        // Traverse totalStr from end to beginning to create nodes
        for (int i = totalStr.length() - 1; i >= 0; i--) {
            int digit = totalStr.charAt(i) - '0'; // Convert char to int
            
            // Create a new node with the digit
            ListNode newNode = new ListNode(digit);
            
            // If l3 is null, this is the head node
            if (l3 == null) {
                l3 = newNode;
                tail = l3; // Initialize tail with l3
            } else {
                // Otherwise, add the new node to the end
                tail.next = newNode;
                tail = newNode; // Move the tail to the new node
            }
        }
        
        // Return the head of the resulting list
        return l3;
    }
}