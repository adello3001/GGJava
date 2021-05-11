[문제1] 예외에 대한 설명 중 틀린 것은?
정답: 4번
해설: 사용자 정의를 통해서 애플리케이션 예외를 처리할 수 있다.
1) 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.
2) RuntimeException의 하위 예외는 컴파일러 예외 처리 코드를 체크하지 않는다.
   - 컴파일러 예외를 처리하기 위해서는 Exception의 하위 예외를 체크하면 된다.
3) 예외는 try-catch 블록을 사용해서 처리된다.
4) 자바 표준 예외만 프로그램에서 처리할 수 있다.


[문제2] try-catch-finally 블록에 대한 설명 중 틀린 것은?
정답: 3번
해설: finally 블록은 무조건 실행된다.
1) try {} 블록에는 예외가 발생할 수 있는 코드를 작성한다.
2) catch {} 블록은 try {} 블록에서 발생한 예외를 처리하는 블록이다.
3) try {} 블록에서 return문을 사용하면 finally {} 블록은 실행되지 않는다.
4) catch {} 블록은 예외의 종료별로 여러 개를 작성할 수 있다.

[문제3] throws에 대한 설명으로 틀린 것은 무엇인가?
정답: 4번
해설: throws는 예외를 처리할 위치를 지정한다.(예외 떠넘기기)
1) 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.
2) throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.
3) 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성할 수 있다.
4) 새로운 예외를 발생시키기 위해 사용된다.

[문제4] throw에 대한 설명으로 틀린 것은 무엇인가?
정답: 2번
해설: throws
1) 예외를 최초로 발생시키는 코드이다.
2) 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.
3) throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
4) throw 키워드 뒤에는 예외 객체 생성 코드가 온다.

[문제5] 다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇인가?
public void method1() throws NumberFormatException, ClassNotFoundException { ... } 
정답: 3번
해설: 예외 클래스에서  상위 클래스는 catch의 뒤쪽(후순위)으로 기술해야 한다.
1) try { method1(); } catch(Exception e) {}
2) void method2() throws Exception { method1(); }
3) try { method1(); } catch(Exception e) {} catch(ClassNotFoundException e) {}
4) try { method1(); } catch(ClassNotFoundException e) {} catch(Exception e) {}
