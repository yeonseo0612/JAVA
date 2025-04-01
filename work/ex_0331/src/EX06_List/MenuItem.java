package EX06_List;

public class MenuItem {
    private String menuName; // 메뉴 이름
    private int price;       // 가격

    // 생성자
    public MenuItem(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    // 메뉴 이름 반환
    public String getMenu_name() {
        return menuName;
    }

    // 가격 반환
    public int getPrice() {
        return price;
    }

    // 메뉴 번호에 따라 메뉴 항목 생성
    public static MenuItem createMenuItem(int num) {
        switch (num) {
            case 1:
                return new MenuItem("아메리카노", 4000);
            case 2:
                return new MenuItem("에이드", 3000);
            case 3:
                return new MenuItem("차", 2000);
            case 4:
                return new MenuItem("라떼", 4500);
            default:
                return null;
        }
    }
}