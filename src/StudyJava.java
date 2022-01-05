public class StudyJava {
    public static void main(String[] args){
        int a = 10, b = -10;

        System.out.println("~ 연산자사용했을때의 값 : " + ~a);
        System.out.println("<< 연산자사용했을때의 값 : " + (a <<  2 ));
        System.out.println(">> 연산자사용했을때의 값 : " + (b >> 2 ));
        System.out.println(">>> 연산자사용했을때의 값 : " + (a >>> 2));
        System.out.println(">>> 연산자사용했을때의 값 : " + (b >>> 2));
    }
}
