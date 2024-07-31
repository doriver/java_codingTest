package programmers.kit.sort;

import java.util.Arrays;

public class Level01 {

	// 틀림
	//	배열 array의 일부분을 정렬할 때마다 원본 배열을 수정해야함
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for (int i=0; i < commands.length; i++) {
        	Arrays.sort(array, commands[i][0]-1, commands[i][1]-1);
        	answer[i] = array[commands[i][0]+commands[i][2]-2];
        	
        }
        
        
//        		commands[0][0] commands[0][1] commands[0][2]
//        Arrays.sort(array, i-1, j-1);
//        array[i+k-2]
        
        return answer;
    }
}
