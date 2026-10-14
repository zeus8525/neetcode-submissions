
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> q = new LinkedList<>();
        int []counts = new int[numCourses];
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int []pair: prerequisites){
            counts[pair[0]]++;
            mp.putIfAbsent(pair[1],new LinkedList<>());
            mp.get(pair[1]).add(pair[0]);
            mp.putIfAbsent(pair[0],new LinkedList<>());
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]==0)
                q.offer(i);
        }
        while(!q.isEmpty()){
            int poll = q.poll();
            if(mp.get(poll)==null)continue;
            for(int m:mp.get(poll)){
                counts[m]--;
                if(counts[m]==0){
                    q.offer(m);
                }
            }
            mp.remove(poll);
        }

        return mp.isEmpty();
    }
}