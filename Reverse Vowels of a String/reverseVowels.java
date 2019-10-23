class Solution {
    public String reverseVowels(String s) {
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char ch[] = s.toCharArray();
        int i = 0, j = s.length()-1;
        while(i<j){ 
            if (list.contains(ch[i]) && list.contains(ch[j])){
                swap(ch, i, j);
            }
            else if(!list.contains(ch[i])){
                i++;
                continue;
            }
            else if(!list.contains(ch[j])){
                j--;
                continue;
            }
            i++;
            j--;
        }
        return new String(ch);
    }
    public static void swap(char[] ch, int a, int b){
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
}
