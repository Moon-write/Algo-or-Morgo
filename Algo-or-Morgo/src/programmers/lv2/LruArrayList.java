package programmers.lv2;

import java.util.ArrayList;

public class LruArrayList {

	public static void main(String[] args) {

		// 시간 체크
		int sec =0;
		
		// 캐시데이터
		int cacheSize = 2;
		ArrayList<String> cache = new ArrayList<String>();
			
		// 테스트용 도시이름
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		String [] arr = {"Jeju", "Pangyo", "NewYork", "newyork"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

		// 캐시가 0일때
		if(cacheSize==0) {
			sec = arr.length*5; 
		} else {
				for(int i =0;i<arr.length;i++) {
				String city = arr[i].toLowerCase();
				int result = cache.indexOf(city);
				if(result!=(-1)) {
					// 있을때
					sec += 1;
				} else {
					// 없을때
					if(cache.size()==0) {
						cache.add(city);
						sec += 5; 
					} else {
						if(cache.size() == cacheSize ) {
							cache.remove(cache.size()-1);
						}
						cache.add(0, city);
						sec += 5; 
					}
					
				}
				System.out.println(cache);
			}
		}
		System.out.println(sec);

	} // 메인메소드 종료
} // 클래스 종료
