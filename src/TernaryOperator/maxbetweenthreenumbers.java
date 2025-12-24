package TernaryOperator;

public class maxbetweenthreenumbers {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

//        String maxnumber = (n1 >= n2) || (n2 >= n3) || (n3 > n1) ? "Greater" : "Smaller";
//        System.out.println(maxnumber);

        int maxnumber1= (n1>=n2) ? (n1>=n3 ? n1:n3) : (n2>=n3?n2:n3);
        System.out.println("Maximum value is "+ maxnumber1);
    }
}
