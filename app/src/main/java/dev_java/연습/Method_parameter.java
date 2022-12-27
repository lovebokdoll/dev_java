package dev_java.연습;

public class Method_parameter {
        //메소드 파라미터로 입력받아서 사용하기 
        public void numbering(int limit){
                             //매개변수 - parameter
            //limit 이라는 변수를 정의해줌 
            int i=0;
            while(i<limit){
                System.out.println(i);
                i++;
            }
        }
        public static void main(String[] args) {
            Method_parameter method_parameter = new Method_parameter();
            method_parameter.numbering(5);// 이 영역에 가변적인 부분이 들어간다
                                   //입력을 위한 도구 - 인자 argument!!
            //입력값을 사용하는것..
           
        }
    }

