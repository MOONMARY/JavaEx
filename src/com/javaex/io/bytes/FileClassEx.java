package com.javaex.io.bytes;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	//프로젝트 내의 files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	public static void main(String[] args) {
		//파일 객체 생성
		File root = new File(rootPath);
		//이 파일은 존재하는가?
		System.out.println(rootPath + ":" + root.exists());
		
		if (!root.exists()) {	//존재하지 않으면
			root.mkdirs();	// 디렉터리 생성
			System.out.println(rootPath + "생성되었습니다");
		} else {
			System.out.println(rootPath + "이미 있는 디렉터리 입니다");
		}
		
		File subdir = new File(rootPath + "subdir");
		if (!subdir.exists()) {
			subdir.mkdirs();	//subdir 형성
			System.out.println(subdir + "생성되었습니다");
		} else {
			System.out.println(subdir + "생성하지 못했습니다");
		}
		
		//rootPath 내부에 새 파일 생성하기
		File file = new File(rootPath + "myfile.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했어요");
			}
		}
		
		//파일 지우기
		file.delete();
		
		printInfo(root);
	}
	
	private static void printInfo(File f) {
		System.out.println("-------------");
		
		if (f.isDirectory()) {
			//디렉터리
			System.out.println("Directory: " + f.getName());
			File[] files = f.listFiles();
			
			for (File file: files) {
				printInfo(file);
			}
		} else {
			//파일
			System.out.println(f.canRead() ? "r" : ".");
			System.out.println(f.canWrite() ? "w" : ".");
			System.out.println(f.canExecute() ? "x" : ".");
			
			System.out.print(f.getName() + "\t");
			System.out.println(f.length());
		}
	}

}
