package Day_03.app1_lamda;

@FunctionalInterface //인터페이스가 반드시 단 하나의 추상메서드만 가지도록 강제하는 어노테이션이다.
public interface Flyer {
    public abstract void fly();
}
