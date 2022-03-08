import java.util.*;
// Example for object and class
class Student
{
    String name;
    int id;
    void create(String name1,int id1)
    {
        name=name1;
        id=id1;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }

}
public class ObjectClassExample
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name1=scan.nextLine();
        System.out.println("Enter the id: ");
        int id1=scan.nextInt();
        Student student=new Student();
        student.create(name1,id1);
        student.display();
        Student student1=new Student();
        student1.create("efgh",456);
        student1.display();
    }
}
/*

Output:

Enter the name:
abcd
Enter the id:
123
Name: abcd
Id: 123
Name: efgh
Id: 456

 */