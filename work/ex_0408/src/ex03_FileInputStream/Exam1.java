package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Exam1 {
	public static void main(String[] args) {
			//file.txt를 만들고
			//문장을 입력하고 저장을 한다.
			//FileInputStream으ㅡ로 읽어온 뒤, 회문인지 아닌지 검증하세요
		
			String path = "D:\\JAVA\\file.txt";
			
			File f = new File(path);
			byte[] read = new byte[(int)f.length()]; 
			
			FileInputStream fis = null;
			String str = "";
			if(f.exists()) {
				try {
					fis = new FileInputStream(f);
					fis.read(read);
					String res = new String(read, "UTF-8"); 
					
					for(int i = res.length()-1; i>=0; i--) {
						str+=res.charAt(i);
					}//for
					if(res.equals(str)) {
						System.out.println(res + "는 회문입니다");
					} else {
						System.out.println(res + "는 회문이 아닙니다");
					}
					
					
			
				} catch (Exception e) {
					// TODO: handle exception
				}finally {
					try {
						if(fis != null) {
							fis.close();
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
			
			
			
	}
}
