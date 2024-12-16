public class Main{ 
    public static void main(String[] args){ 
        System.out.println("Составить регулярное выражение, определяющее является ли заданная строка IPv6 адресом, записанным в шестнадцатеричном виде."); 
        IpParser p = new IpParser(); 
        UserInput i = new UserInput(); 
        System.out.println(p.parse(i.getInput())); 
    } 
}