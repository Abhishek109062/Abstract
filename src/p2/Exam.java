package p2;

public class Exam {
    int rollno;
    String course;
    int marks;

    Exam() {
        rollno = 0;
        course = "unknown";
        marks = 0;
    }

    public void setvalue(int rollno, int marks)
    {
        this.marks=marks;
        this.rollno=rollno;
    }


    public void setvalue(int rollno, int marks, String course)
    {
        this.course=course;
        this.marks=marks;
        this.rollno=rollno;
    }
    public void display()
    {
        int a=10;
        Integer b=a;
        a=b;
        System.out.println(rollno+"  "+course+"  "+marks);
    }

}
