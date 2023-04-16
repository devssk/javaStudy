package chapter3_primitiveVariable;

// 형 변환(type conversion)
// 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통힐하는 것
// 묵시적 형 변환(implicit type conversion, 자동 형 변환)과 명시적 형 변환(explicit type conversion, 강제 형 변환)이 있다.
// 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 진다.
// byte(1바이트) -> short,char(2바이트) -> int(4바이트) -> long(8바이트)
// 덜 정밀한 자료형에서 더 정밀한 자료형으로의 형 변환은 자동으로 이루어 진다.
// float(4바이트) -> double(8바이트)
public class TypeConversionTest {
    public static void main(String[] args) {
        double dNum = 1.2;
        float fNum = 0.9f;

        // 각각 타입캐스팅으로 형변환이 일어나므로 1 + 0
        int iNum1 = (int)dNum + (int)fNum;
        // dNum과 fNum을 더할때는 fNum이 자동으로 double로 형 변환이 일어나고 2.1의 double값이 타입캐스팅으로 형변환이 일어나므로 2
        int iNum2 = (int)(dNum + fNum);
        System.out.println("iNum1 = " + iNum1);
        System.out.println("iNum2 = " + iNum2);

        int num = 10;
        // 작은 자료형으로 가기 때문에 명시적 형 변환을 해준다.
        // 작은 자료형의 범위가 넘어가는 수가 명시적 형 변환을 해준다면 값 손실이 일어난다.
        byte bNum = (byte)num;
        System.out.println("bNum = " + bNum);

    }
}
