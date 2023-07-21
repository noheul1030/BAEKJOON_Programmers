class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String one = "";
        String two = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                one += num_list[i];
            }else{
                two += num_list[i];
            }
        }
        answer = Integer.parseInt(one) + Integer.parseInt(two);
        return answer;
    }
}