class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode res1 = l1;
        ListNode res2 = l2;
        
        int val1 = 0, val2 = 0, valFinal = 0, sumVal = 0, num = 0, iter = 0;
        
        ListNode outcome = null;
        ListNode another = outcome;
        
        while(res1 != null && res2 !=null){
            val1 = res1.val;
            res1 = res1.next;
            val2 = res2.val;
            res2 = res2.next;
            sumVal = val1 + val2+iter;
            
            ListNode forw = new ListNode();
            
            if(sumVal < 10){
                    forw = new ListNode(sumVal);
                    if(outcome == null){
                    outcome = forw;
                    another = outcome;
                }
                    else{
                    outcome.next = forw;
                    outcome = outcome.next;
            }
                iter = 0;
            }
            
            else{
                num = sumVal%10;
                forw = new ListNode(num);
                if(outcome == null){
                    outcome = forw;
                    another = outcome;
                }
                else{
                    outcome.next = forw;
                    outcome = outcome.next;
            }
                iter = 1;
            }   
        }
        
        while(res1 != null){
            val1 = res1.val;
            res1 = res1.next;
            sumVal = val1 + iter;
            
            ListNode forw = new ListNode();
            
            if(sumVal < 10){
                    forw = new ListNode(sumVal);
                    if(outcome == null){
                    outcome = forw;
                    another = outcome;
                }
                    else{
                    outcome.next = forw;
                    outcome = outcome.next;
            }
                iter = 0;
            }
            
            else{
                num = sumVal%10;
                forw = new ListNode(num);
                if(outcome == null){
                    outcome = forw;
                    another = outcome;
                }
                else{
                    outcome.next = forw;
                    outcome = outcome.next;
            }
                iter = 1;
            }   
        }
        
        while(res2 != null){
            val2 = res2.val;
            res2 = res2.next;
            sumVal = val2 + iter;
            
            ListNode forw = new ListNode();
            
            if(sumVal < 10){
                    forw = new ListNode(sumVal);
                    if(outcome == null){
                    outcome = forw;
                    another = outcome;
                }
                    else{
                    outcome.next = forw;
                    outcome = outcome.next;
            }
                iter = 0;
            }
            
            else{
                num = sumVal%10;
                forw = new ListNode(num);
                if(outcome == null){
                    outcome = forw;
                    another = outcome;
                }
                else{
                    outcome.next = forw;
                    outcome = outcome.next;
            }
                iter = 1;
            }
        }
        if(iter == 1){
            ListNode last = new ListNode(1);
             outcome.next = last;
             outcome = outcome.next;
        }
             return another;
    }  
}
