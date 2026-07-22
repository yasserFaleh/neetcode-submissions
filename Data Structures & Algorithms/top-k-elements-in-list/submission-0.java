class Solution {

    class Element implements Comparable<Element> {
        int data;
        int priority;
        Element (int data, int priority){
            this.data = data;
            this.priority = priority;
        }
        @Override
        public int compareTo(Element other) {
            return Integer.compare(other.priority, this.priority); 
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.putIfAbsent(num, 0);
            count.put(num, count.get(num) + 1);
        }
        
        PriorityQueue<Element> queue = new PriorityQueue<Element>(); 
        count.forEach((c,v) -> queue.add(new Element(c, v)));
        int [] res = new int[k];
        for (int i = 0; i < k; i++){
            res[k-i-1] = queue.poll().data; 
        }
        return res;
    }
}
