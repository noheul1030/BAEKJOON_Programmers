class Solution {
    public int solution(int[] num_list) {
        int one = 0;
        int two = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0) one += num_list[i];
            else two += num_list[i];
        }
        if(one > two) return one;
        else if (one < two) return two;
        else return one;
    }
}