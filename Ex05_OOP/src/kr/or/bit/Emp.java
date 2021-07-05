package kr.or.bit;

public class Emp { // extends Object
    private int empno;
    private String ename;
    
    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    // Object가 가지는 재정의
    @Override
    public String toString() {
        return "Emp [empno=" + empno + ", ename=" + ename + "]";
    }
    
    // Object는 toString()을 가지고 있는데 원하면 재정의해서 쓰면됨
    // 멤버필드값들을 검증하는 용도로 많이 쓴다!
    //
    
    
  
}
