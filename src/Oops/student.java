package Oops;

public class student {
    String name;
    String city;
    int student_id;

    student(String n,String c,int id){
        name=n;
        city=c;
        student_id=id;
    }

    public void studentinfo(){
        System.out.println("my name is "+name);
        System.out.println("my city is "+city);
        System.out.println("my id is "+student_id);
    }

    public static void main(String[] args) {
        student st=new student("ram","cuttack",102);
        st.studentinfo();
    }
}
