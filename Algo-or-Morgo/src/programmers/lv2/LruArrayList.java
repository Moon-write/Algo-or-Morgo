package programmers.lv2;

import java.util.ArrayList;

public class LruArrayList {

	public static void main(String[] args) {

		// �ð� üũ
		int sec =0;
		
		// ĳ�õ�����
		int cacheSize = 2;
		ArrayList<String> cache = new ArrayList<String>();
			
		// �׽�Ʈ�� �����̸�
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		String [] arr = {"Jeju", "Pangyo", "NewYork", "newyork"};
//		String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

		// ĳ�ð� 0�϶�
		if(cacheSize==0) {
			sec = arr.length*5; 
		} else {
				for(int i =0;i<arr.length;i++) {
				String city = arr[i].toLowerCase();
				int result = cache.indexOf(city);
				if(result!=(-1)) {
					// ������
					sec += 1;
				} else {
					// ������
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

	} // ���θ޼ҵ� ����
} // Ŭ���� ����
