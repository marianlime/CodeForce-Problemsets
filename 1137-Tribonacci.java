class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int stored[] = new int[n + 1];
        stored[0] = 0;
        stored[1] = 1;
        stored[2] = 1;
        for(int i = 3; i <= n; i++){
            stored[i] = stored[i-1] + stored[i-2] + stored[i-3];
        }
        return stored[n];
    }
}
