class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i< numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
int inorder[]=new int[numCourses];
        for(int i=0;i<graph.size();i++){
            for(int j: graph.get(i)){
                inorder[j]++;
            }
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==0){
                queue.offer(i);
            }
        }
        int c=0;
        while(!queue.isEmpty()){
            int m=queue.poll();
            c++;
            for(int i: graph.get(m)){
                inorder[i]--;
                if(inorder[i]==0){
                    queue.offer(i);
                }
            }
        }
        return c==inorder.length;
    }
}