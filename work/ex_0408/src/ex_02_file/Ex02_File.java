package ex_02_file;

import java.io.File;
import java.util.Arrays;

public class Ex02_File {
    public static void main(String[] args) {
        // 실제 디렉토리 경로로 수정 (예시)
        String path = "D:\\JAVA";  // 디렉토리 경로로 수정
        
        File f = new File(path);
        
        // isDirectory() - 경로가 폴더인지 확인
        if (f.isDirectory()) {
            // list() - 디렉토리 안의 파일 목록을 반환
            String[] names = f.list();
            
            if (names != null) {
                // 디렉토리 안에 있는 하위 요소들의 이름을 출력
                System.out.println(Arrays.toString(names));
            } else {
                System.out.println("디렉토리 안에 파일이 없습니다.");
            }
        } else {
            System.out.println("주어진 경로는 디렉토리가 아닙니다.");
        }
    }
}