class Solution {
    public String convertToTitle(int columnNumber){
    StringBuilder anu = new StringBuilder();

    while(columnNumber > 0){
        columnNumber--;
        anu.append((char) ('A' + columnNumber % 26));
        columnNumber /= 26;

    }
    return anu.reverse().toString();
    }
    
}