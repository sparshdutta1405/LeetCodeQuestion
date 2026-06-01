class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        int n=cost.length;
        Arrays.sort(cost);
        
        if(n==1){
            return cost[0];
        }

        if (n==2){
            return cost[0]+cost[1];
        }

        if(n==3){
            return cost[2]+cost[1];
        }

        if (n==4){
            return cost[0]+cost[2]+cost[3];
        }

        if (n%2!=0){
            if (n>4){
                for (int i=cost.length-1;i>=0;i=i-3){
                    if(i==0){
                        sum+=cost[0];
                    }
                    else{
                        sum+=cost[i]+cost[i-1];    
                    }        
                }
            }
        }

        if (n%2==0){
            if (n>4){
                for (int i=cost.length-1;i>=0;i=i-3){
                    if (i==0){
                        sum=sum+cost[0];
                    }
                    else{
                        sum+=cost[i]+cost[i-1];  
                        System.out.println(sum);          
                    }   
                }
            }       
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna