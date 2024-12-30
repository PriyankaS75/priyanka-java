import java.util.Random;
public class Passwordgenerator{
public static void main(String[] args){
int length=10;
System.out.println("Generated Password:"+generatePassword(length));
}
public static String generatePassword(int length){
String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzz0123456789!@#$%^&*()";
Random random =new Random();
StringBuilder password = new StringBuilder();
for(int i=0;i<length;i++){
password.append(chars.charAt(random.nextInt(chars.length())));
}
return password.toString();
}
}