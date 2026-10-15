class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int p : piles){
            high = Math.max(p, high);
        }

        while(low <= high){
            int k = low + (high - low) / 2;
            long totalTime = 0;

            for(int p : piles){
                totalTime += (int)Math.ceil((double) p/k);
            }
            if(totalTime <= h){
                high = k - 1; //k works, try a slower speed
            }
            else{
                low = k + 1; //k is v slow, try faster speed
            }
        }
        return low;
    }
}
