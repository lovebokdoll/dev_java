package dev_java.연습;

public class Method_parameter_return {

        public static String numbering(int init ,int limit){
            //numbering 메소드가 return할 값이 반드시 String이라는것 의미함!!
            int i=init;
            //만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈값을 주었다.
            String output="";
            while(i<limit){
                //숫자를 화면에 출력하는 대신 변수 output에 담았다.
                output += i;
                //output = output + i ; 와 동일
                i++;
            }
            //output에 담겨있는 문자열을 메소드외부로 반환하려면 return에 담아야 한다
            return output;
        }
        public static void main(String[] args) {
            //메소드 numbering이 리턴한 값이 변수 result에 담긴다.
           String result = numbering(1, 5);
           System.out.println(result);
        }
    }

