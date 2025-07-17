class Pavan{
int age=22;
static String name="Pavan";
public void  walk(String name){
	System.out.println(name);
}
public void  sleep(String action){
System.out.println(action);
}
public static void  eat(String eat){
System.out.println(eat);
}
public static void main(String[] args){
Supraja d1=new Supraja();
d1.walk("hello");
d1.sleep("sleeping");
eat("eating");
System.out.println(d1.age);
System.out.println(name);
}
}
