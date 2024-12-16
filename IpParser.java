import java.util.regex.*;
public class IpParser{
    private String result;
    public IpParser(){
        result = "Адрес не соответствует нотации";
    }
    public String parse(String arg){
        if (Pattern.matches("\\b([0-9a-f]{4}:){7}[0-9a-f]{4}\\b", arg))
        {
            result = "Адрес соответствует нотации.";
        }
        return result;
    }


}