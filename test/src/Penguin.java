public class Penguin extends Animal{
    @Override
    public void move(){
        System.out.println("펭귄이 미끄러지듯 이동합니다.");
    }
    
    @Override
    public void makeSound(){
        System.out.println("펭귄이 삐양삐약 울어요! ");
    }

    public void swim() {
        System.out.println("펭귄이 수영합니다.\n");
    }
}
