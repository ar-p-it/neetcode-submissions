class Solution {
    List<List<Integer>> result = new ArrayList<>();

    // 1. Removed 'static' so it can access the 'result' list seamlessly
    public void helper(int i, int n, int k, List<Integer> current) {
        // Base Case: If we have gathered exactly k elements, save this combination
        if (current.size() == k) {
            // 2. Fixed syntax to copy using a concrete ArrayList implementation
            result.add(new ArrayList<>(current));
            return;
        }
        
        // If we run out of numbers to pick from, turn back
        if (i > n) {
            return;
        }

        // CHOICE 1: Take the current number 'i'
        current.add(i);
        helper(i + 1, n, k, current);
        
        // BACKTRACK: Remove the last added element before trying the next choice
        current.remove(current.size() - 1);

        // CHOICE 2: Do not take the current number 'i'
        helper(i + 1, n, k, current);
    }

    public List<List<Integer>> combine(int n, int k) {
        // 3. Fixed capitalization layout on ArrayList instantiation
        List<Integer> current = new ArrayList<>();
        
        // Start processing numbers from 1 up to n
        helper(1, n, k, current);
        
        return result;
    }
}