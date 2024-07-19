package programmers.kit.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Level01 {

/*
 * 		포켓몬
 * 
 * 1. 서로다른 원소 개수
 * 배열의 서로다른 원소 개수
 * : 배열의 원소들을 set에 넣어 set의 크기로
 * 
 */
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
	
/*
 * 		완주하지 못한 선수
 * 문제 특성상 HashSet은 안됨
 * 
 *  1. 배열 정렬
 *  배열 정렬하면 뭔가 고유해짐
 * 
 *  2. HashMap
 *  key(이름) , value(명수)
 */
    public String solution01(String[] participant, String[] completion) {
        String answer = "";
        
        // 1. 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때까지 찾는다
        int length = completion.length;    
        for(int i = 0; i < length; i++) {
           if( ! participant[i].equals(completion[i]) ) {
               return participant[i];
            }   
        }
        
        // 3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미이다.
        answer =  participant[length]; 
        
        return answer;
    }
    
    public String solution02(String[] participant, String[] completion) {
    	String answer = "";
    	HashMap<String, Integer> hm = new HashMap<>();
    	
    	// key(이름) , value(명수)
    	for ( String player : participant ) {
    		hm.put(player, hm.getOrDefault(player, 0) + 1);
    	}
    	
    	// 완주x 빼고 다 0명으로 됨
    	for ( String player : completion ) {
    		hm.put(player, hm.get(player) - 1);
    	}
    	
    	for (String key : hm.keySet()) {
    		if (hm.get(key) != 0) {
    			answer = key;
    		}
    	}
    	
    	return answer;
    }
}
