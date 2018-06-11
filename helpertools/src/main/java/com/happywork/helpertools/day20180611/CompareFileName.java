package com.happywork.helpertools.day20180611;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Admin-Dcb
 * output different file name according to two file directories
 *
 */
public class CompareFileName {
	
	public static void main(String[] args) {
		if(args.length != 2) {
			return;
		}
		List<String> fileNameList1 = readFileName(args[0]);
		List<String> fileNameList2 = readFileName(args[1]);
		
		
		for (String name : fileNameList1) {
			if(!fileNameList2.contains(name) ) {
				System.out.println("different file name:" + name);
			}
		}
		
		
	}

	private static List<String> readFileName(String filepath) {
		List<String> fileNameList = new ArrayList<String>();
		File file = new File(filepath);
		File[] files = file.listFiles();
		for (File s : files) {
			fileNameList.add(s.getName());
		}
		return fileNameList;
	}
	
	

}
