package kr.or.bit;
/* 사원은 사번을 가지고 있고 사번은 숫자 데이터로 관리한다.
 * 사원은 이름을 가지고 있고 이름은 문자 데이터로 관리한다.
 * 사원은 직종을 가지고 있고 직종은(IT, SALSE) 등의 데이터로 관리된다.
 * 사원은 급여를 받고 급여는 숫자 데이터로 관리한다.
 * 사원은 신체정보를 가지고 있고 신체정보는 키와 몸무게 데이터로 관리된다. -> 부품정보(클래스)
 *  >> 신체정보 >> 하나의 타입 >> 사용자(개발자) >> clss
 */
public class Person {

    public int empno; //default 0
    public String ename; //default null
    public String job; //default null 
    public int sal; //default 0
    
    public BodyInfo bodyinfo; //default null
}
