import java.util.Scanner;

class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
public int hashCode() {
    return (name != null ? name.hashCode() : 0) + 31 * age;
    
}
@Override
public String toString(){
   return name+", "+age;
}
}
class Value{
    public int val;
    public int code;
    public Value(int val,int code){
        this.val=val;
        this.code=code;
    }
    @Override
    public String toString(){
        return val+", "+code;
    }
}

public class Hashish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        CBHT<Person,Value> table=new CBHT<>(10);
        for(int i=0;i<n;i++){
            String []input=sc.nextLine().split(" ");
            String name=input[0];
            int age=Integer.parseInt(input[1]);
            int val=Integer.parseInt(input[2]);
            int code=Integer.parseInt(input[3]);
            Person p = new Person(name,age);
            Value v= new Value(val, code);
            table.insert(p, v);
        }
        Person target=new Person("ace", 20);
        System.out.println();
        System.out.println(table.search(target));
    }
}
