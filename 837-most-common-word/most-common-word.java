class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) bannedSet.add(b.toLowerCase());

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z ]", " "); 
        String[] words = paragraph.split(" +"); 

        Map<String, Integer> count = new HashMap<>();
        String res = "";
        int max = 0;

        for (String w : words) {
            if (w.isEmpty() || bannedSet.contains(w)) continue;

            count.put(w, count.getOrDefault(w, 0) + 1);

            if (count.get(w) > max) {
                max = count.get(w);
                res = w;
            }
        }

        return res;
    }
}