class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++){
            swap(s, i, s.length-1-i);
        }
        for (int i = 0; i< s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
    
    private static void swap(char c[], int a, int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
