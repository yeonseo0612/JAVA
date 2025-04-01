package EX06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MenuItem> order = new ArrayList<>(); // 주문을 저장할 리스트

        again:while (true) {
            System.out.println("===카페 주문 시스템===");
            System.out.println("1.메뉴 보기");
            System.out.println("2.주문 추가");
            System.out.println("3.결제 하기");
            System.out.println("4.주문 취소");
            System.out.println("5.종료");
            System.out.print("번호 선택 : ");
            int choose = sc.nextInt();

            if (choose == 1) {
                // 메뉴 보기
                System.out.println("1. 아메리카노 - 4000원");
                System.out.println("2. 에이드 - 3000원");
                System.out.println("3. 차 - 2000원");
                System.out.println("4. 라떼 - 4500원");
                
            } else if (choose == 2) {
                // 주문 추가
                System.out.print("메뉴 번호 선택 : ");
                int choose_menu = sc.nextInt();
                MenuItem selectedMenu = MenuItem.createMenuItem(choose_menu);

                if (selectedMenu != null) {
                    order.add(selectedMenu); // 선택한 메뉴를 주문 리스트에 추가
                    System.out.println(selectedMenu.getMenu_name() + "가 주문에 추가되었습니다.");
                } else {
                    System.out.println("잘못된 메뉴 번호입니다.");
                }

            } else if (choose == 3) {
                // 결제 하기
                if (order.isEmpty()) {
                    System.out.println("주문 내역이 없습니다. 주문을 먼저 추가하세요.");
                } else {
                    System.out.println("[결제 내역]");
                    int total = 0;
                   
                    for (MenuItem orderList : order) {
                        int res = orderList.getPrice();
                        total += res;
                        System.out.println(orderList.getMenu_name() + " - " + res + "원");
                    }
                    System.out.println("총 금액: " + total + "원");
                    System.out.println("결제가 완료되었습니다.");
                    
                    order.clear(); // 주문했으니 장바구니 초기화.
                }
                
            }else if(choose == 4) {
            	//취소
            	//orderList가 비어있으면
            	//주문내역이 없습니다 출력
            	//비어있지 않으면
            	//[현재 주문 내역]
            	//1. 아메리카노 - 3000
            	//2. 라떼 - 3500
            	 if (order.isEmpty()) {
                     System.out.println("주문 내역이 없습니다. 주문을 먼저 추가하세요.");
                 } else {
	                     System.out.println("[현재 주문내역]");
	                     int count = 0;
	                     for (MenuItem orderList : order) {
		                    	 count++;
		                         int res = orderList.getPrice();
		                         System.out.println(count+"." + orderList.getMenu_name() + " - " + res + "원");
	                     }
	                    //최소할 주문번호를 입력하세요
	                 	//orderList에서 remove하면됩니다.
	                     System.out.println("취소할 주문번호를 입력하세요");
	                     int cancel = sc.nextInt();
	                     	if(cancel >= 1 && cancel <= order.size()) {
			                     System.out.println(order.get(cancel -1).getMenu_name() + " 주문을 취소하였습니다.");
			                     order.remove(cancel - 1);
			                     continue again;
		                     }else {
		                    	 System.out.println("취소할 주문번호가 없습니다.");
		                     }
	                 }
            	}else if (choose == 5) {
                // 종료
	                System.out.println("시스템을 종료합니다.");
	                break;
            } else {
                System.out.println("잘못된 번호입니다.");
            }
        }

        sc.close();
    }
}