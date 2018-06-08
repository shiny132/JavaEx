package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom{
		//	�ʵ�
		private String subject;
		private String roomName;
		
		//	������
		public ClassRoom(String subject) {
			this.subject = subject;
		}
		
		public ClassRoom(String subject, String roomName) {
			this(subject);
			this.roomName = roomName;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof ClassRoom) {
				return obj.hashCode() == this.hashCode();
			}
			return super.equals(obj);
		}

		@Override
		public int hashCode() {
//			return super.hashCode();
			return subject.hashCode();
		}

		@Override
		public String toString() {
			String output = "Class(subject=" + subject
					+ ", room=" + roomName + ")";
			return output;
		}
		
}

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<>();
		
		//	�ʿ� ������ �ֱ�
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("401", new ClassRoom("Linux", "R401"));
		
		System.out.println(map);
		//	������ ����
		
		//	�ʿ��� �����͸� ������ ���ô�
		System.out.println(map.get("301"));
		
		//	���� �����͸� ����
		map.put("201", new ClassRoom("C#", "R201"));
		System.out.println(map.get("201"));
		System.out.println(map);
		
		//	Ű�� �ִ��� Ȯ��
		System.out.println(map.containsKey("301"));
		System.out.println(map.containsKey("501"));
		
		//	subject�� Java�� ClassRoom�� �޾ƿ� ����
		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		//	Iterator
		System.out.println("Iterator=====");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		//	���� ��� ���ô�.
		map.clear();
		System.out.println(map);
	}

}
