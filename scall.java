import java.util.*;
class call{
static int a=5;
void callbyvalue(int a){
 a=a+5;}
void callbyobject(call obj){
 a=a+10;
}
public static void main(String arg[]){
call obj=new call();
System.out.println("before call "+obj.a);
obj.callbyvalue(a);
System.out.println("callbyvalue "+a);
obj.callbyobject(obj);
System.out.println("callbyobject "+a);}
}

