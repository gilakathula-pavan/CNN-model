class Variables{
int age=22;
static String name="pavan";
public static void var(int a){
System.out.println(a);
}
public static void main(String[] args){
Variables v1=new Variables();
int marks=69;
v1.var(marks);
System.out.println(v1.age);
System.out.println(name);
}
}
