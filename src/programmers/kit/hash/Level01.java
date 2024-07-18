package programmers.kit.hash;

import java.util.HashSet;
import java.util.Set;

public class Level01 {

/*
 * 		서로다른 원소 개수
 * 
 * 배열의 서로다른 원소 개수
 * : 배열의 원소들을 set에 넣어 set의 크기로
 * 
 */
	// 포켓몬
	// 서로다른 숫자개수를 set에 넣어서 set의 크기로 > set이랑 HashSet
	public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length;
        
        Set<Integer> set = new HashSet<>();     
        for (int i = 0; i < count; i++) {
        	set.add(nums[i]);
        }
        
        int different = set.size();
        int choice = count / 2;
        
        if (different >= choice) {
        	answer = choice;
        } else {
        	answer = different;
        }

        return answer;
    }
	
}
