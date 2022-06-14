package fms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	final static String file = "lang.txt";
	
	boolean insert(String newData) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			bw.write(newData+"\r\n");
			bw.close();
			
			return true;
			
		} catch (IOException e) {
		}
		return false;
	}
	
	String selectAll() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String result = "";
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				result += line+"\n";
			}
			
			return result;
		} catch (FileNotFoundException fnfe) {
		} catch (IOException ioe) {
		}
		return null;
		
		
	}
	
	boolean delete(String delData) {
		String result = "";
		boolean flag = false;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//정상적으로 한줄을 읽어왔다는 뜻
				if(line.equals(delData)) {
					flag = true;
				}else {
					result += line+"\r\n";
				}
			}
			
			if(flag) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(result);
				bw.close();
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException ioe) {
		}
		
		return flag;
	}
	
	boolean modify(String delData, String newData) {
		String result = "";
		boolean flag = false;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				
				if(line.equals(delData)) {
					result += newData+"\r\n";
					flag = true;
				}else {
					result += line+"\r\n";
				}
			}
			
			if(flag) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				
				bw.write(result);
				bw.close();
			}
		} catch (FileNotFoundException e) {
		} catch (IOException ioe) {
		}
		
		return flag;
	}
	
	
	
}



























