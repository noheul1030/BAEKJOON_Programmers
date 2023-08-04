class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 1; i < food.length; i++){
            if(food[i] > 1){
                for(int j = 0; j < food[i] / 2; j++){
                    sb.append(Integer.toString(i));
                }
            }
        }
        return sb.toString() + "0" + sb.reverse().toString();
    }
}