package ex_02_file;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		 String path = "D:\\JAVA\\aaa\\bbb";
		 
		 File f = new File(path);
		 
		 //목적지까지의 경로가 존재하는지 -> exists() -> 존재하면 true 
		 
		 if(!f.exists()) {
			 System.out.println("폴더생성");
			 //복수의 폴더를 생성해준다. -> mkdirs()
			 f.mkdirs();
		 } 
		 //File클래스의 역할
		 //폴더를 만들어준다거나
		 //목적지까지의 검증(파일, 폴더, 존재하냐)
		 //폴더일때 목록의 반환
		 //목적지의 크기도 반환

		 
		 //내용을 읽거나 쓰는 기능은 없다
//	}
//	   String path = "D:\\JAVA\\aaa\\bbb";
//       
//       File f = new File(path);
//       
//       // 경로가 존재하는지 확인
//       if (!f.exists()) {
//           // 경로가 없다면 폴더 생성
//           boolean success = f.mkdirs();
//           
//           if (success) {
//               System.out.println("폴더가 성공적으로 생성되었습니다.");
//           } else {
//               System.out.println("폴더 생성에 실패했습니다.");
//           }
//       } else {
//           System.out.println("폴더가 이미 존재합니다.");
//       }
//   }
}
}
