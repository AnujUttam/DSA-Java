import java.util.*;

class Solution {

    int index = 0;

    public List<String> braceExpansionII(String expression) {
        Set<String> result = dfs(expression);

        List<String> ans = new ArrayList<>(result);
        Collections.sort(ans);

        return ans;
    }

    // Parse an expression until } or end
    private Set<String> dfs(String s) {
        Set<String> result = new HashSet<>();

        // For concatenation
        Set<String> current = new HashSet<>();
        current.add("");

        while (index < s.length() && s.charAt(index) != '}') {

            char ch = s.charAt(index);

            Set<String> next;

            // Case 1: { ... }
            if (ch == '{') {
                index++; // skip {

                next = dfs(s);

                index++; // skip }
            }

            // Case 2: lowercase letter
            else {
                next = new HashSet<>();
                next.add(String.valueOf(ch));

                index++;
            }

            // Concatenate current × next
            Set<String> temp = new HashSet<>();

            for (String a : current) {
                for (String b : next) {
                    temp.add(a + b);
                }
            }

            current = temp;

            
            if (index < s.length() && s.charAt(index) == ',') {
                result.addAll(current);
                current.clear();
                current.add("");

                index++;
            }
        }

        
        result.addAll(current);

        return result;
    }
}