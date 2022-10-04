class Sample{
    public int a;
    public int b;  //접근지정자 private라면 아래에서 출력 불가
    int c;
}

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 10;
        aClass.c = 10;
    }
}
