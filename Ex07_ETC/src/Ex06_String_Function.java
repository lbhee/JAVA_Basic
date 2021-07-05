
public class Ex06_String_Function {

    public static void main(String[] args) {
        // 우리가 일상적으로 다루는 데이터 : 문자열, 숫자, 날짜 >> 함수(시스템함수)
        String str = "hello";
        String concatstr = str.concat("world"); // 문자열 결합
        System.out.println(concatstr);
        
        
        boolean bo = str.contains("ello"); // 순서대로 이어진값이 있으면 true
        System.out.println(bo);        
        bo = str.contains("elo"); // 다르면 false 
        System.out.println(bo);
        
        
        String str2 = "a b c d"; // [a][][b][][c][][d]
        System.out.println(str2.length()); // 문자열의 길이
        
        
        String filename = "hello java world";
        System.out.println(filename.indexOf("j")); // 입력한 문자의 자리(위치)
        System.out.println(filename.indexOf("java")); // 단어가 시작되는 첫글자의 자리
        System.out.println(filename.indexOf("개폭망")); // 찾는 문자가 없으면 -1 (배열에서 값이없다는 return -1)
        
        if(filename.indexOf("wo") != -1) {
            System.out.println("wo를 하나라도 가지고 있구나.");
        }
                
        System.out.println(filename.lastIndexOf("a")); // 뒤에서 첫번째에 있는 "a"의 값의 위치를 찾아라.
        
        // 자주 사용하는 함수
        // length() , indexOf() , substring() , replace() , split()
        
        String result = "superman";
        System.out.println(result.substring(0)); // 입력한 시점부터 시작하여 뒤에있는 것 모두 출력 
        System.out.println(result.substring(2));
        System.out.println(result.substring(1,2)); // 입력시작위치 ~ 입력마지막위치-1
        System.out.println(result.substring(0,0)); // 0,-1이니까 안나옴
    
        // Quiz
        String filename2 = "h.jpeg"; 
        //파일명이 hong.png 또는 h.tmp 이렇게 바뀌어도
        // 파일명과 확장자를 분리해서 화면에 출력하세요.
        // 파일명 : j   확장자 : jpeg        
        int point = filename2.indexOf(".");        
        String file = filename2.substring(0,point);        
        String extention = filename2.substring(point+1);
        // filename2.substring(point+1, filename2.length()));
        // filename2.substring(++point));        
        System.out.println(file);
        System.out.println(extention);
        
        
        // replace (치환함수)
        String str3 = "ABCDADDDDDDDA";
        String result3 = str3.replace("DDDD", "오늘은 월요일");
        System.out.println(result3);
        
        result3 = str3.replace("A", "B");
        System.out.println(result3);
        
        // ETC
        System.out.println(str3.charAt(0)); // 인덱스위치에 있는 문자 추출
        System.out.println(str3.charAt(3));
        
        System.out.println(str3.endsWith("DDDA")); // 끝에서부터 포함된 문자 있으면 true
        System.out.println(str3.endsWith("DDDB")); // 없으면 false
        
        System.out.println(str3.equalsIgnoreCase("abcDADDDDDDDA")); // 대소문자 구별없이 일치하면 true
    
        // 오늘의 포인트 !!! split !!        
        String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하"; // 구분자를 기준으로 나눠준다.
        String[] namearray = str4.split(",");
        for(String s : namearray) {
            System.out.println(s);
        }
        
        
        // <정규표현식>
        // Java 특수문자
        // 이스케이프 문자 \ >> 특정 문자 앞에
        // char sing = '''; 오류.         
        // ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정 
        char sing = '\'';
        System.out.println(sing);
        
        // 홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력
        // char ename = "홍"길"동"; 오류.
        String ename = "홍\"길\"동";
        System.out.println(ename);
        
        // \\두개가 \한개이다.
        String path = "C:\\Temp"; // C:\Temp
        System.out.println(path);
        
        // 정규표현식은 표준화되어있다. 어떤 언어에서든 공통규칙.
        // 어떠한 문자를 만들때 [규칙] >> 유효성 판단 근거
        // 주민번호 숫자6자리-숫자7자리 -> {\d6}-{\d7}
        // 123-1234567 >> false
        // 핸드폰번호, 차량번호, 우편번호, 한글처리, 도메인주소, 이메일주소 등등
        // 정규표현식은 이미 찾아보면 다 있다. (만들지는 못해도 보고 읽을줄은 알아야한다)
        /*
        String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
        String[] namearray = str4.split(".");
        for(String s : namearray) {
            System.out.println(s);
        }
        */
        // 여기서 구분자인 . 이 정규표현식 문법이기때문에 출력이 안되는것이다.
        // \. 이것은 이스케이프문자이기때문에 이것초자도 다시 이스케이프 문자로 처리해주어야 한다.
        // 따라서 \\. 을 입력해주어야지 .을 구분자로 인식한다. 
        
        
        // 공백을 제거해서 저장해야함
        String str6 = "홍       길         동";
        
        // 가운데 공백을 제거하는 함수는 없다.
        System.out.println(str6.replace(" ", "")); // 공백을 공백이 아닌것으로 바꾸기
        
        // 양쪽공백을 제거하는 함수는 있다.
        String str7 = "      홍길동        ";
        System.out.println(">" + str7 + "<");
        System.out.println(">" + str7.trim() + "<"); // 양쪽공백제거
        
         
        String str8 = "   홍    길  동      ";
        /*
        String result5 = str8.trim();
        String result6 = result5.replace(" ", "");
        System.out.println(result6);
        */
        
        // 여러개의 함수를 적용할 때 (method chain 기법)
        System.out.println(str8.trim().replace(" ", ""));
        System.out.println(str8.trim().replace(" ", "").substring(2));
        
        // Quiz-1
        // 문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
        int sum = 0;
        String[] numarr = {"1","2","3","4","5"};
        for(String s : numarr) {
            sum += Integer.parseInt(s);            
        }
        System.out.println(sum);
        
        
        // Quiz-2
        // 위 주민번호의 합을 구하세요
        String jumin = "123456-1234567";
        
      //위 주민번호의 합을 구하세요_1
        int sum2=0;
        for(int i = 0 ; i < jumin.length() ; i++) {
            String numstr =jumin.substring(i, i+1);
            if(numstr.equals("-")) continue;
            sum2+= Integer.parseInt(numstr);
        } 
        System.out.println("주민번호 합:" + sum2);
        
      //위 주민번호의 합을 구하세요_2
        String[] numarr2 = jumin.replace("-","").split("");
        int sum3=0;
        for(String i : numarr2) {
            sum3+= Integer.parseInt(i);
        }
        System.out.println("주민번호 합2:" + sum3);
        
      //위 주민번호의 합을 구하세요_3
        String jumin4 = jumin.replace("-", "");
        int sum4=0;
        for(int i = 0 ; i < jumin4.length() ;i++) {
            sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
        }
        System.out.println("주민번호 합4:" + sum4);
    }
    
    

}
