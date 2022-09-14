public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int [] number=new int[3];
        number [0]=1;
        number [1]=2;
        number [2]=3;
        double [] bnumber={1.57, 7.654, 9.986};
        int [] cnumber={13,9,14};
        System.out.println("Задание 2");
        System.out.println(number [0]+", "+number[1]+", "+number[2]+", "+bnumber [0]+", "+bnumber[1]+", "+bnumber[2]);
        for (int i=0; i<3; i++) {
            System.out.println(cnumber[i]);
        }
        System.out.println("Задание 3");
        System.out.println(number [2]+", "+number[1]+", "+number[0]+", "+bnumber [2]+", "+bnumber[1]+", "+bnumber[0]+", "+cnumber [2]+", "+cnumber[1]+", "+cnumber[0]);

        System.out.println("Задание 4");
        int [] dnumber=new int[3];
        dnumber [0]=1;
        dnumber [1]=2;
        dnumber [2]=3;
        for (int i=0; i<3; i++) {
            if (dnumber[i]%2!=0) {
                dnumber [i]=dnumber[i]+1;
            }
        }
        System.out.println(dnumber [0]+", "+dnumber[1]+", "+dnumber[2]);
    }
}