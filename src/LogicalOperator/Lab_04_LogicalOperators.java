package LogicalOperator;

public class Lab_04_LogicalOperators {
    public static void main(String[] args) {
        System.out.println((9*3/9+1)*3);
        System.out.println(!(10>20));
        System.out.println(true||false);

        int salary =12;
        boolean b =  !(salary > 10|| salary < 5);
        System.out.println(b);
        long l = 100l;
        System.out.println(l);
        char a= 'A';
        char b1='B';
        System.out.println(a-b1);
    }
}
