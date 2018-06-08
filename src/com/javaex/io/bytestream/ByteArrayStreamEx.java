package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		//	��ǲ �ҽ�
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//	�ƿ�ǲ Ÿ��
		byte[] outSrc = null;
		
		//	��ǲ �ҽ��� Ȯ��
		System.out.println(Arrays.toString(inSrc));
		
		//	��ǲ ��Ʈ���� �ƿ�ǲ ��Ʈ���� ���� ���ڽ��ϴ�.
		try {
			//	��ǲ ��Ʈ�� ����
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0;	//	��ǲ ��Ʈ�����κ��� �Ѿ���� ������ ����
			
			while((data = bis.read()) != -1) {
				System.out.println("Read Data:" + data);
				bos.write(data);
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
		} catch (IOException e) {
			//	IO ���ܴ� �̰����� ó��
		} catch (Exception e) {
			//	������ ó������ ���� ���ܴ� �̰����� ó��
		}

	}

}
