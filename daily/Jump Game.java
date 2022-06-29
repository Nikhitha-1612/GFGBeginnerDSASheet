class Solution {
    static int canReach(int[] A, int N) {
        // code here
       int maxreachable=0;
        for(int i=0;i<N;i++){
           maxreachable = Math.max(maxreachable,A[i]+i);
           if(maxreachable >=N-1){
               return 1;
           }
          if(maxreachable == i){
               return 0;
           }
        }
        return  -1;
    }
}
