package ja_0729;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_1 {
	
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
//		TreeSet set = new TreeSet(Collections.reverseOrder());
		
//		HashSet 과는 달리 TreeSet 은 이진 탐색 트리 구조로 이루어져 있습니다.
//		정렬, 검색에 높은 성능을 보이는 자료구조입니다.
//		그렇기에 HashSet 보다 데이터의 추가와 삭제는 시간이 더걸리지만
//		검색과 정렬에는 유리합니다.
//		TreeSet 은 데이터를 저장할시 이진 탐색트리 의 형태로 데이터를 저장합니다.
		
		int[] score = {75,48,66,93,37,55,10,75,63,84};
		
		
		for(int i=0;i<score.length;i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println("65 보다 작은 값"+set.headSet(new Integer(65)));
		System.out.println("65 보다 큰 값"+set.tailSet(new Integer(65)));
		
		
		
		
		
		
		
		
	}

}





















