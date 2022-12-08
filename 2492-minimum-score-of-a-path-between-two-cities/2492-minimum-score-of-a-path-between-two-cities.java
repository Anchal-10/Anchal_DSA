class Solution {
    public int minScore(int n, int[][] roads) {
        int res = Integer.MAX_VALUE;

        List<int[]>[] graph = new List[n + 1];
        for (int i = 0; i < graph.length; i++) graph[i] = new ArrayList<>();
        for(int[] road: roads){
            graph[road[0]].add(new int[]{road[1], road[2]});
            graph[road[1]].add(new int[]{road[0], road[2]});
        }

        Set<Integer> seen = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        seen.add(1);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for(int[] neighbour: graph[node]){
                res = Math.min(res, neighbour[1]);
                if (!seen.contains(neighbour[0])){
                    
                 queue.add(neighbour[0]);
                    seen.add(neighbour[0]);
            }
        }
        }
        return res;
    }
    }

