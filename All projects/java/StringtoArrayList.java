import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class StringtoArrayList{
public static void main(String[] args){
String strings="99,12,34,54,67,77";
String str[]=strings.split(",");
List nl=new ArrayList();
nl=Arrays.asList(str);
for(String s: nl){
System.out.println(s);
}
}
}