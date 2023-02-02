class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int great = great(str1.length(), str2.length());
        return str1.substring(0, great);
    }

        private int great(int a, int b){
            return b == 0 ? a : great(b, a % b);
        }
    }
