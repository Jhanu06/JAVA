//creating array of objects

class student
{   
    String name;
    int rollno;
    int marks;
}

public class Dem {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="jhanu";
        s1.rollno=32;
        s1.marks=99;
        student s2=new student();
        s2.name="jhan";
        s2.rollno=2;
        s2.marks=9;
        student s3=new student();
        s3.name="jan";
        s3.rollno=3;
        s3.marks=98;
        student s[]=new student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;
        // for(int i=0;i<s.length;i++)
        // {
        //     System.out.println( s[i].name + " : " + s[i].rollno + " : "+ s[i].marks  );

        // }

    //for each loop
         for(student st : s)
        {
            System.out.println( st.name + " : " + st.rollno + " : "+ st.marks  );

        }
    }
}
