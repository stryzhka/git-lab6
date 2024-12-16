import java.util.Scanner; 
 
public class UserInput{ 
    
    public String getInput(){ 
        System.out.print("Введите текст, который нужно проверить: "); 
        Scanner in = new Scanner(System.in); 
        return in.nextLine(); 
    } 
}