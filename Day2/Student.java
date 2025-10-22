import java.util.*;

class Student{
    int id,marks,roll;
    public Student(int id,int marks,int roll){
        this.id=id;
        this.marks=marks;
        this.roll=roll;
    }
    public void display(){
        System.out.println("ID: "+id+" Marks: "+marks+" Roll: "+roll);
    }
    public static void deletebyId(List<Student> students, int id){
        students.removeIf(s -> s.id == id);
    }
}
class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        switch(sc.nextInt()){
            case 1:
                int id=sc.nextInt();
                int marks=sc.nextInt();
                int roll=sc.nextInt();
                students.add(new Student(id,marks,roll));
                break;
            case 2:
                for(Student s:students){
                    s.display();
                }
                break;
                case 3:
                Student.deletebyId(students,sc.nextInt());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
