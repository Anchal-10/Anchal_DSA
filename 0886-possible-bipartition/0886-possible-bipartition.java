class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<dislikes.length;i++){
            list.get(dislikes[i][0]).add(dislikes[i][1]);
                        list.get(dislikes[i][1]).add(dislikes[i][0]);

        }
                int [] color=new int[n+1];
        Arrays.fill(color,-1);

        for(int i=1;i<=n;i++){
            if(color[i]==-1){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(i);
        //Arrays.fill(color,-1);
        color[i]=1;
        while(!queue.isEmpty()){
            int m=queue.poll();
            for(int e: list.get(m)){
                if(color[e]==-1){
                    color[e]=1-color[m];
                    queue.offer(e);
                }
                else if(color[e]==color[m]){
                    return false;
                }
            }
        }
            }
        }
        return true;
    }
        
            
        }