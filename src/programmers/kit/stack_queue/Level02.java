package programmers.kit.stack_queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Level02 {

/*
 * 			기능개발 gngb , 좋은 문제인듯
 * 		1.배열로
 * 배포일이 기준, 배포일은 맥락상 첫index의 완료 날짜임   
 * 그 뒤 원소들이 배포일에 완료되면 같이 배포됨
 * 
 * 		2.Queue로
 * 그냥 완료 날짜들 구해서 넣다가
 * 다음에 배포해야할떄 큐 원소개수 답에 넣고, 큐 비움
 * 그니까 큐에 한번에 배포되는것들을 넣는거임   	
 */
	public int[] gngbSolution01(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        int day = 0;
        int[] temp = new int[100];
//        Map<Integer, Integer> temp = new HashMap<>(); // temp를 배열말고 다른걸로 할수 있나?
        
        // 이게 중요한듯
        for ( int i = 0; i < progresses.length; i++ ) {	
            while ( progresses[i] + (speeds[i] * day) < 100 ) {
                day++;
            }
           
            temp[day]++; 
        }
        
        int count = 0;
        for (int n : temp) {
        	if (n != 0) {
        		count++;
        	}
        }
        
        answer = new int[count];
        int index = 0;
        for (int n : temp) {
        	if (n != 0) {
        		answer[index++] = n;
        	}
        }
 
        return answer;
    }
	
	
	public int[] gngbSolution02(int[] progresses, int[] speeds) {
		int[] answer = {};
		
		Queue<Integer> q = new LinkedList<>();
		List<Integer> answerList = new ArrayList<>();
		
		for (int i = 0; i < progresses.length; i++) {
			double remain = (100 - progresses[i]) / (double) speeds[i];
			int date = (int) Math.ceil(remain);
			
			if (!q.isEmpty() && q.peek() < date) {
				answerList.add(q.size());
				q.clear();
			}
			
			q.offer(date);
		}

		answerList.add(q.size());
		
		answer = new int[answerList.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		
        return answer;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
