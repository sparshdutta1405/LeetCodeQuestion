class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        return s;

        StringBuilder[] sb = new StringBuilder[numRows];
        
        for(int i = 0; i < sb.length ; i++){
            sb[i] = new StringBuilder("");
        }

        int i = 0;
        boolean down = true;

        for(char ch: s.toCharArray()){
            sb[i].append(ch);

            if(i == numRows-1){
                down=false;
            }
            else if (i == 0){
                down = true;
            }

            if(down){
                i++;
            }
            else{
                i--;
            }
        }
        StringBuilder result = new StringBuilder("");
            for(StringBuilder pp: sb){
                result.append(pp);
            }

            return result.toString();

    }
}