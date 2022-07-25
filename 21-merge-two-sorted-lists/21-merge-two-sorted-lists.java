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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode  Node  =new ListNode();      
        ListNode  SortedNode  =     Node;
        while(list1!=null && list2!=null ){
            if(list1.val<list2.val){
                SortedNode.next=list1;
                list1=list1.next;
               
            }else{
                SortedNode.next=list2;
                list2=list2.next;
               
            }
           SortedNode=SortedNode.next;                        
        }
        while(list1!=null){
                SortedNode.next=list1;
                list1=list1.next;
                SortedNode=SortedNode.next;                
          }
        while(list2!=null){
          SortedNode.next=list2;
                list2=list2.next;
                SortedNode=SortedNode.next;                
      }
    return Node.next;
    }
}