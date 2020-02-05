package ua.lviv.lgs;

public class Robot {
    private String name;
    private int age;

    public String getName(){ return name;};
    public void setName(String name){this.name=name;};

    public int getAge(){return age;};
    public void setAge(int age){this.age=age;}

    Robot(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void work(){
        System.out.println( "Я Robot - я просто працюю ");
    }

    @Override
    public String toString() {
        return "Robot[name="+name+", age="+age+"]";
    }
}
