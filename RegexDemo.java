import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegexDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the emaild id ");
        String email=sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-z0-9][a-zA-z0-9]*@[a-zA-z0-9]+(([.][a-zA-z]+)+)");
        Matcher m=p.matcher(email);
        if(m.find() && m.group().equals(email)){
            System.out.println("valid00");
        }
        else{
            System.out.println("invalid");
        }

    }
}

