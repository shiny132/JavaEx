package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		// ������ ����
		StringBuffer sb = new StringBuffer("This");
		
		//	���ڿ� �߰� : append()
		sb.append(" is pencil");
		
		//	���ڿ� ���� : insert()
		sb.insert(7, "my");
		
		//	���ڿ� ġȯ : replace()
		sb.replace(8, 10, "your");
		
		System.out.println(sb);
		
		sb.setLength(10);	//	���� ���� ����
		System.out.println(sb);
		
		/*String s = new StringBuffer("This")
								.append(" is")
								.append(" pencil")
								.insert(8, "my")
								.replace(8, 10, "your ")
								.toString();
		*/
		
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is")
				.append(" pencil")
				.insert(8, "my")
				.replace(8, 10, "your ");
		
		String s = sb2.toString();
		
		System.out.println(s);

	}

}
