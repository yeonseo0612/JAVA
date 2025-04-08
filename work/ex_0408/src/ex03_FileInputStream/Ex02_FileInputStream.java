package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex02_FileInputStream {
	public static void main(String[] args) {
		
		//경로를 저장
		String path = "D:\\JAVA\\새 텍스트 문서.txt";
		
		//File 객체에 경로 알려주기
		File f = new File(path);
		//length()를 통해 내용크기만큼만 만든다.
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				//파일에서 읽어온 내용을 바이트배열에 담는다.
				//read() : 1비트씩 읽어온다
				//read(byte[] b) : 한번에 읽어와서 배열에 담는다.
				fis.read(b_read);
				
				
				//문자열 객체의 생성자에 바이트배열을 전달함으로써 문자열로 변환이 가능하다.
				
				//fis가 읽어온걸 read 배열에 넣어주는데 방 두 개를 점유하면서 한글이 저장된다.
		 		//현재 byte[]인 read에는 test.txt.에서 읽어온 데이터들이 저장되어 있다.
				//이를 문자열 형태로 재조합하여 출력할 수 있다.
				String res = new String(b_read, "UTF-8"); 
				//스트링 클래스에 생성자가 오버로딩이 굉장히 많이 되어있다. 그중에 바이트 배열을 넣어주면 문자열로 바꿔주는 오버로딩이 있다.

				//바이트 형태로 가져오는 바람에 한글이 다 깨진다면 배열을 준비해서 그 배열에 담긴 값을 문자열로 바꿔보면 어때? 라고 하는 차선택이 있다는 겁니다.
				System.out.println(res);

				
			}catch(Exception e){
				
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
