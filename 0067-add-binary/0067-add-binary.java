class Solution {
    public String addBinary(String a, String b) {
        int first=Integer.parseInt(a,2);
        int second= Integer.parseInt(b,2);
        int sum= first+second;
        return Integer.toBinaryString(sum);
    }
}