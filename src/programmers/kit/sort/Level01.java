package programmers.kit.sort;

import java.util.Arrays;

public class Level01 {

	
	public int[] solutionOO(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
	
		for (int i=0; i < commands.length; i++) {
			int[] cutted = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(cutted);
			answer[i] = cutted[commands[i][2]-1];
		}
		
		return answer;
	}
	
				// {1,5,2,6,3,7,4}   ,   {{2,5,3},{4,4,1},{1,7,3}}
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int indexAnswer = 0;
		
		for (int i=0; i < commands.length; i++) {
			int[] cutted = new int[commands[i][1] - commands[i][0] + 1];
			int indexCutted = 0;
			
			for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++ ) {
				cutted[indexCutted++] = array[j];
			}
			
			Arrays.sort(cutted);
			answer[indexAnswer++] = cutted[commands[i][2]-1];
		}
		
		return answer;
	}
	
	
	// 틀림
	// 배열 array의 일부분을 정렬할 때마다 원본 배열이 수정됨
	public int[] solutionxx(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for (int i=0; i < commands.length; i++) {
        	Arrays.sort(array, commands[i][0]-1, commands[i][1]-1);
        	answer[i] = array[commands[i][0]+commands[i][2]-2];
        	
        }
        
        return answer;
    }

	
}
