package jun.yu.maven.test.PowerMockito;

public class Human {
    public String name1;
    public int age1;
    public String address;
    public Puppy puppy;

    public Human(String name1) {
        this.name1 = name1;
    }

    public void buyPuppy(String name){
        puppy = Puppy.createPuppy(name, this);
    }

    public void walkWithPuppy() {
        puppy.goOnWalk(15);
    }

    public static void main(String[] args) {
        Human john = new Human("John");
        john.buyPuppy("Gatsby");
        john.puppy.performPuppyTasks();
        john.walkWithPuppy();
    }

    public void isSoHappy() {
        System.out.println("Yay!");
    }

    public int getAge() {
        return age1;
    }

    public void setAge(int age1) {
        this.age1 = age1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
