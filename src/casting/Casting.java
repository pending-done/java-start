package casting;

public class Casting {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long은 기본적으로 가능 (작은걸 큰 그릇에 넣으니까 당연히됨)

        doubleValue = intValue; // int -> double (10.0)




    }
}
