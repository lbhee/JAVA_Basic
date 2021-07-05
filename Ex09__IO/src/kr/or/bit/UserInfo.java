package kr.or.bit;

import java.io.Serializable;

/*
 * 객체통신
 * 객체(Car, Tv)를 네트워크, 또는 파일(txt write, read), 프로세스간의 통신
 * 직렬화 : 객체를 분해해서 줄을 세워 보내는 전반적인 과정
 * 역직렬화 : 객체를 다시 조립하는 과정
 * 
 * 실습
 * 대상 -> 파일 >> UserInfo 객체를 write (직렬화)
 * 대상 -> 파일 >> 직렬화된 UserInfo 객체를 read해서 다시 조립 (역직렬화)
 * 
 * 조립 -> 본드식, 레고식
 * 레고식 : class UserInfo implements Serializable -> 조립분해 가능
 * 
 */
public class UserInfo implements Serializable{
    private String name;
    private String pwd;
    private int age;
    
    public UserInfo() {
        super();
    }    
    public UserInfo(String name, String pwd, int age) {
        super();
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public String getPwd() {
        return pwd;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
    }
    
    
}
