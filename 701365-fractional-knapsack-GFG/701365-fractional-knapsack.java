import java.util.*;
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        double total_profit = 0;
        double[] ratio = new double[val.length];
        for (int i = 0; i < val.length; i++) {
            ratio[i] = (double) val[i] / wt[i];
        }
        
        selectionSort(ratio,val,wt,n);
        
        double remaining = capacity;
        for (int i = 0; i < val.length; i++) {
            if (remaining >= wt[i]) {
                total_profit += val[i];
                remaining -= wt[i];
            } else {
                total_profit += (double) val[i] * (remaining / wt[i]);
                break;
            }
        }
        return total_profit;
        
    }
    
    public void selectionSort(double[] ratio, int[] val, int[] wt, int n){
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (ratio[j] > ratio[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap ratio
            double tempR = ratio[maxIdx];
            ratio[maxIdx] = ratio[i];
            ratio[i] = tempR;
            // Swap value
            int tempV = val[maxIdx];
            val[maxIdx] = val[i];
            val[i] = tempV;
            // Swap weight
            int tempW = wt[maxIdx];
            wt[maxIdx] = wt[i];
            wt[i] = tempW;
        }
    }
}