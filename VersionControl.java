/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int low=1;
        int high = n;
        int mid = 0;
        boolean res = false;
        
        if(n==1){
            return 1;
        }        
        
        while(low<high)
            {
                    mid = low+(high-low)/2;
                    res= isBadVersion(mid);
                    if(res==false){
                        low= mid+1;
                    }
                    else{ 
                        high=mid;
                    }
            }
            return low;
        }
    }