public class Rectangle2 {
    int x, y, width, height;
    public  Rectangle2(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int square(){
        return width*height;
    }
    public void show(){
        System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "X" + height + "인 사각형");
    }
    public boolean contains(Rectangle2 r){  // 해당 사각형이 현 사각형의 안에 있는지 확인
        if(x < r.x && y < r.y)
            if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
                return true;
        return false;
    }

    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(2, 2, 8, 7);
        Rectangle2 s = new Rectangle2(5, 5, 6, 6);
        Rectangle2 t = new Rectangle2(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
