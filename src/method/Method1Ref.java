package method;

public class Method1Ref {

    public static void main(String[] args) {
        int sum1 = add(5, 10);

        int sum2 = add(15, 20);
    }

    // 1. 메서드 반환타입 정의
    // 2. 호출 시 넘기는 값과 파라미터의 타입이 일치해야함
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    // 1. void 함수는 반환 값이 없을때 사용한다.
    // 2. 반환값이 없어도 return문이 있어야 하지만 컴파일러가 자동으로 넣어주기 때문에 안넣어도 된다.
    // 3. return문을 만나면 함수가 종료된다.
    public static void print1(){
        System.out.println("반환 값이 없는 void 함수");
    }

}
