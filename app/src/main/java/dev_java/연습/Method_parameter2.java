package dev_java.연습;

public class Method_parameter2 {
        //메소드 파라미터로 입력받아서 사용하기 
        public void numbering(int init ,int limit){
            //limit 이라는 변수를 정의해줌 
            int i=init;
            while(i<limit){
                System.out.println(i);
                i++;
            }
        }
        public static void main(String[] args) {
            Method_parameter2 method_parameter2 = new Method_parameter2();
            method_parameter2.numbering(3,5);// 이 영역에 가변적인 부분이 들어간다
           
        }
    }

