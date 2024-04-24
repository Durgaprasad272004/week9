import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ExHandJava extends Thread{
@SuppressWarnings("null")
public static void main(String[] args){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection
connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/sai","root","pass");
System.out.println("Connection established.");
connect.close();
}catch(ClassNotFoundException e){
    System.out.println("The dataBase is not connected.");
}catch (SQLException e) {
e.printStackTrace();
}
//Interrupted Exception
//Thread obj=new Thread();
//try{
//Thread.sleep(4000);
//System.out.println("The thread suspended its work for 4 seconds.");
//}catch(InterruptedException e){
// Thread.currentThread().interrupt();
// System.out.println("The thread is been interrupted");
//}
//obj.start();
//obj.interrupt();
try{
int a[]={1,2,3,4,5};
System.out.println(a[6]);
}catch(IndexOutOfBoundsException e){
System.out.println("The index given is out of range.");
}
try{
Integer num=null;
System.out.println(num.intValue());
}catch(NullPointerException e){
System.out.println("The value is not assigned.");
}
try{
int a=2/0;
System.out.println(a);
}catch(ArithmeticException e){
System.out.println("Division by zero is not possible.");
}
}
}

