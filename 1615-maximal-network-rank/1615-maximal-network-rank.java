class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        List<Integer>[] list = new List[n];
    for(int i = 0; i < n; i++){
        list[i] = new ArrayList<>();
    }
    int roadIndex = 0;
    for(int[] r : roads){
        list[r[0]].add(roadIndex);
        list[r[1]].add(roadIndex);
        roadIndex++;
    }
    int res = 0;
    for(int i = 0; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            if(i == j) continue;
            Set<Integer> set = new HashSet<>();
            set.addAll(list[i]);
            set.addAll(list[j]);
            res = Math.max(set.size(), res);
        }
    }
    return res;
    }
}