public class Dragun extends Protosss {

    public Dragun(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
        //TODO Auto-generated constructor stub----팔레트 1
    }

    @Override
    public void move(String position) {
        // TODO Auto-generated method stub----팔레트 2
        System.out.printf("[Dragun] %s(이)가 %s까지 천천히 이동합니다. \n",this.getName(), position);
    }

    @Override
    public void attack(String target) {
        // TODO Auto-generated method stub----팔레트2
        System.out.printf("[Dragun]%s(이)가 %s(을)를 칼로 찌릅니다. >> 데미지: %d\n",
                   this.getName(), target, this.getDps());
    }
    
}
