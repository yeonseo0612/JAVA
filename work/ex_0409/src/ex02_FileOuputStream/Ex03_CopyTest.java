package ex02_FileOuputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\admin\\Desktop\\JAVA\\image.jpg");
			fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\JAVA\\wall_copy.jpg");
			
            byte[] buffer = new byte[1024];  // 버퍼 크기는 1024바이트로 설정
            int bytesRead;
            
            // 현재 시간을 밀리초 단위로 측정
            long start = System.currentTimeMillis();
            System.out.println("이미지 읽기 시작");
            
            // 파일을 읽어서 복사할 파일에 쓴다.
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);  // 읽어온 데이터를 파일에 쓴다.
            }
            
            System.out.println("이미지 읽기 종료");
			//현재 시간을 m/s단위로 나타냄
			
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			//종료시간 - 시작시간 = 총 소요시간
			
			double time = (double)(end - start) / 1000;
			
			System.out.println(time + "초");
		}catch (Exception e) {
			
		}finally {
			
			try {
				if(fos != null) {
					fos.close();
				}
				
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
//직접 복사하는 것보다 바이트배열을 이용하여 이미지를 복사했을 때 속도가 매우 빠르다.
