class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i< asteroids.length;i++){
            
    
            boolean flag=true;
            
                
                while(!stack.isEmpty() && asteroids[i]<0 && stack.peek()>0){
                    
                    if(-asteroids[i]> stack.peek()){
                        stack.pop();
                    }
                    
                    else                     if(-asteroids[i]<stack.peek()){
                        flag=false;
                        break;
                    }
                        else{
                            flag=false;
                            stack.pop();
                                                    break;

                        }
                }
            if(flag){
                    stack.push(asteroids[i]);

            }
        }
        int i=stack.size()-1;
        int ans[]=new int[stack.size()];
        while(!stack.isEmpty()){
            ans[i--]=stack.pop();
        }
        return ans;
    }
}

        

                    
                    
