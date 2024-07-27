package programmers.kit.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Level01 {
/*
 * 연속된 두 수를 비교위해
 * stack에 넣으면서
 * 맨 마지막에 넣은거랑, 앞으로 넣을거 비교
 * 
 * 맨 마지막에 넣은거를 peek할수 있어야함
 */
	
	public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> st = new Stack<>();
    	st.push(arr[0]);
    	
    	for (int i = 1; i < arr.length; i++) {
    		if (st.peek() != arr[i]) {
    			st.push(arr[i]);
    		}
    	}

    	answer = new int[st.size()];
    	
    	for (int i = 0; i < answer.length; i++) {
    		answer[answer.length - i - 1] = st.pop();
    	}
        return answer;
    }
}
