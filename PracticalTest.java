import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

class NotPassException extends Exception
{
    NotPassException(String s)
    {
        super(s);
    }
}

class stu
{
    private int rollno;
    private String name;
    private int marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class TestMain
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        ArrayList<stu> list1=new ArrayList<>();
            for(int i=1;i<=2;i++)
            {
                stu obj1=new stu();
                obj1.setRollno(sc.nextInt());
                obj1.setName(sc.next());
                obj1.setMarks(sc.nextInt());
                if(obj1.getMarks()>=35)
                {
                    list1.add(obj1);
//
                }
                else
                {
                    try {
                        throw new NotPassException("Not Pass");
                    }
                    catch(NotPassException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }

            }

        Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/etest","root","");
                   PreparedStatement p=con.prepareStatement("insert into student values(?,?,?)");

           for(stu res:list1)
           {
               p.setInt(1,res.getRollno());
               p.setString(2,res.getName());
               p.setInt(3,res.getMarks());
               p.executeUpdate();
           }
           Statement s=con.createStatement();
           ResultSet rs=s.executeQuery("select * from student");
           while (rs.next())
           {
               System.out.println(rs.getInt(1) +" " + rs.getString(2) +" "+ rs.getInt(3));
           }
    }
}
