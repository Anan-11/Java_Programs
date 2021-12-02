topics: JDBC, Custom Exception, Java Regex



import java.util.Scanner;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Excp1 extends RuntimeException
{
    Excp1(String s)
    {
        super(s);
    }
}

public class E2internal {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e2data", "root", "");
        PreparedStatement S = con.prepareStatement("insert into info values (?,?)");
        int count = 0;


        Pattern p1 = Pattern.compile("(0|[+]91)?[96][0-9]{9}");
        Pattern p2 = Pattern.compile("[a-zA-Z0-9._]+@gmail.com");
        Matcher m1 = p1.matcher(str);
        Matcher m2 = p2.matcher(str);
        int flag = count;
        try {
            if (m1.find() && m2.find()) {
                while (m1.find() && m2.find()) {
                    count++;
                    S.setString(1, m1.group());


                    S.setString(2, m2.group());

                    S.executeUpdate();
                }
            } else {
                throw new Excp1("no match found");
            }
        } catch (Excp1 obj) {
            System.out.println(obj.getMessage());
        }
    }
}
