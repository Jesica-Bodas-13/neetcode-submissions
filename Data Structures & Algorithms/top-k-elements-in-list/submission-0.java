class Solution {

    // public void insertHeap (ArrayList <Integer> heap,  int value){
    //     heap.add(value);

    //     int index = heap.size() - 1;

    //     while (index > 0 && heap.get((index - 1 )/2) < heap.get(index)){
    //         int temp = heap.get(index);
    //         heap.set(index, heap.get((index -1 ) / 2))
    //         heap.set((index-1)/2 , temp)

    //         index = (index - 1 ) / 2; 
    //     }
    // }

    public int[] topKFrequent(int[] nums, int k) {

        //First create the hashmap to have all the frequencies

        HashMap <Integer, Integer> frequencyMap = new HashMap <> ();

        for (int i = 0 ; i < nums.length; i ++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 1) + 1 );
        }

        PriorityQueue<Integer> maxHeap = new  PriorityQueue <>((a,b) -> frequencyMap.get(b) - frequencyMap.get(a));

        frequencyMap.forEach((num, count) -> {
            maxHeap.offer(num);
        });

        int [] kElements = new int [k];

        for (int j = 0 ; j < k ; j ++){
            kElements[j] = maxHeap.poll();
          
        }

        
        return kElements;
    }
}

    
