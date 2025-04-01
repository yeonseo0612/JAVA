package EX06_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        List<UserInfo> userInfoList = new ArrayList<>();  // UserInfo 객체를 저장할 ArrayList
       
        Scanner sc = new Scanner(System.in);
       

        again:while (true) {
            System.out.print("아이디 생성 (종료하려면 'exit' 입력): ");
            String userId = sc.next();

            if (userId.equalsIgnoreCase("exit")) {
                break;
            }
           
            boolean id_Check = false;
            for (UserInfo user : userInfoList) {
                if (user.getId().equals(userId)) {
                	id_Check = true;
                    System.out.println("중복된 아이디입니다. 다른 아이디를 입력하세요.");
                    continue again;  
                }
            }
            if (!id_Check) {  
                System.out.print("비밀번호 생성: ");
                int userPwd = sc.nextInt();

               
                UserInfo userInfo = new UserInfo(userId, userPwd);
                userInfoList.add(userInfo);
            }
        }

       
        System.out.println("\n입력된 사용자 정보:");
        for (UserInfo user : userInfoList) {
            System.out.println("생성된 아이디: " + user.getId());
            System.out.println("생성된 비밀번호: " + user.getPwd());
            System.out.println("-----------------------");
        }

        sc.close();
    }
}
//유저의 아이디와 패스워드를 가지는
//UserInfo 클래스를 하나 만들고 -> 필드는 private으로 지정.
//Main 클래스에서 유저의 정보를
//ArrayList에 추가하여 출력해보자
