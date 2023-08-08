class StringDuplicate{
public static void main(String[] args){
String str="google";
int count=0;
char[] jo=str.toCharArray();
System.out.println("Duplicate Characters are:");
for(int i=0;i<str.length();i++){
for(int j=i+1;j<str.length();j++){
if(jo[i]==jo[j]){
System.out.println(jo[j]);
count++;
break;
}
}
}
}
}