import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileIPOPStreamJava {
public static void main(String[] args) {
FileInputStream fin=null;
FileOutputStream fout=null;
try{
fin=new FileInputStream("/home/durgaprasad/Documents/Programs/fin.txt");
fout=new FileOutputStream("/home/durgaprasad/Documents/Programs/fout.txt");
try {
System.out.println("Total Number of Bytes : "+fin.available());
int i;
while ((i=fin.read())!=-1) {
fout.write(i);
}
fin.close();
fout.close();
} catch (IOException e) {
System.out.println("An error occurred while performing input/.");
}
}catch(FileNotFoundException e){
System.out.println("The File is not found here");
}
}
}
