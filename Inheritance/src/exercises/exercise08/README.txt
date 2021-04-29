[문제8]

8. A, B, C, D, E, F 클래스가 다음과 같이 상속 관계에 있을 때 다음 빈칸에 들어올 수 없는 코드는?
정답: 2번
해설: 부모 객체를 자식 객체로 강제 캐스팅은 안됨 

1) B b = new B()
2) B b = (B) new A()   // 강제 타입 변환
3) B b = new D()       // 자동 타입 변환
4) B b = new E()       // 자동 타입 변환


메소드 선언: void method(B b) {...}
메소드 호출: method(...)

1) method(new B())
2) method((B) new A())
3) method(new D())
4) method(new E())

