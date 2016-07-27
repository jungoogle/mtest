package jun.yu.code.coverage.jacocotest;

public class Student {
    //add comment to id field
    private int id;
    private String name;
    private String address;
    private String address2;
    private int score;
    
    public Student(int id, String name, int score,String address) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.address=address;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    public String getAddress(){
        return address;
    }
    public String getAddress2(){
        return address2;
    }
}
