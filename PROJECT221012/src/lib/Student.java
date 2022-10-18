package lib;

public class Student {
    int id;
    String tel;
    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }
    public int getId(){
        return this.id;
    }
    public String getTel(){
        return this.tel;
    }
}
