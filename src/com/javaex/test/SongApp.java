package com.javaex.test;

public class SongApp {
	// product VO(Value Object, Ŭ����)�� ����
	public static void main(String[] args) {
		Song s1 = new Song();
		Song s2 = new Song();
		Song s3 = new Song();
		
		s1.setTitle("������");
		s1.setArtist("������");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.setComposer("�̹μ�");
		s1.showInfo("������", "���座��");
		
		s2.setTitle("������");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setYear(2007);
		s2.setTrack(2);
		s2.setComposer("G-DRAGON");
		s2.showInfo();
		
		s3.setTitle("���ɿ���");
		s3.setArtist("����Ŀ����Ŀ");
		s3.setAlbum("����Ŀ����Ŀ1��");
		s3.setYear(2012);
		s3.setTrack(4);
		s3.setComposer("�����");
		s3.showInfo();
		
		
		
	}

}
