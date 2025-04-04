class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getPrice() {return this.price;}
    public void setPrice(int price) {this.price = price;}
//=========================================================================   
    @Override
    public String toString() {
        return "이름: 메뉴 설명";
    }

    public String addOption() {
        return "옵션 추가 기능은 각 음식에 따라 다릅니다.";
    }
}
//=========================================================================
class Burger extends MenuItem {
    public Burger(String name, int price) {
        super(name, price);
    }
    
    @Override
    public String toString() {
        return getName() + ": 패티와 빵이 조화를 이루는 메뉴";
    }

    @Override
    public String addOption() {
        return this.getName() + "→ 치즈 추가";
    }
}
//===========================================================================
class Pizza extends MenuItem {
    public Pizza(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + "치즈 듬뿍, 모두의 인기 메뉴";
    }

    @Override
    public String addOption() {
        return this.getName() + "→ 엣지 변경: 치즈 크러스트";
    }
}

//===========================================================================
class Salad extends MenuItem {
    public Salad(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + ": 신선한 채소로 만든 건강식";
    }

    @Override
    public String addOption() {
        return this.getName() + "→ 드레싱 선택: 발사믹";
    }
}

//=============================================================================

public class FoodOrderApp {
    public static void main(String[] args) {
        MenuItem[] order = new MenuItem[3];
        order[0] = new Burger("치즈버거", 6000);
        order[1] = new Pizza("페퍼로니 피자", 8000);
        order[2] = new Salad("그린 샐러드", 5000);

        int total =0;
        
        for (int i=0; i<order.length; i++) {
            System.out.println(order[i].toString());
            total += order[i].getPrice();
        }

        System.out.println("총 가격:" + total + "원");

        System.out.println("옵션 적용");

        for (int i=0; i<order.length; i++) {
            System.out.println("\t" + order[i].addOption());
        }
    }
}