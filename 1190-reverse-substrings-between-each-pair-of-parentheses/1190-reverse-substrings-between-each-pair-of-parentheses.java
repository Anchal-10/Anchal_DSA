class Solution {
    public String reverseParentheses(String s) {
       Stack<Integer> stack = new Stack<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            if (c == '(') 
                stack.push(i);
            else if (c == ')')
                reverseSubstring(arr, stack.pop(), i);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != '(' && c != ')')
                sb.append(c);
        }

        return sb.toString();
    }

    public static void reverseSubstring(char[] arr, int start, int end) {
        int l = start;
        int h = end;

        while (l <= h) {
            char t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
            l++;
            h--;
        }
    }
}