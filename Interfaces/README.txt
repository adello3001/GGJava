[인터페이스]

인터페이스(interface)

1. 객체의 사용 방법을 정의한 타입이다.
2. 객체의 교환성을 높여 주기 위한 역할
3. 객체와 객체 사이의 통신하는 접점
4. 함수의 명세(시그니처)만 정의
5. 상속을 통한 구현 클래스를 통해서만 객체로 만들 수 있다.
6. 클래스를 규격화(모듈화, 컴포넌트화)

(관련용어)
1. IDL(Interface Definition Language)
2. API ( Application Programming Interface)
3. Static Library
4. Dynamic Library(DLL)
5. Shared Library(SO)
6. RMI (Java Remote Method Invocation)
7. COM (Component Object Model)
8. DCOM (Distributed Component Object Model)

(자바 인터페이스)
interface name {
	type constant = value;						// 상수필드
	type method(parameter, ...);				// 추상 메소드
	
	// 자바에 특화된 기능
	default type method(parameter, ...) { ... }	// 디폴트
	static type method(parameter, ...) { ... };	// 정적 메소드
}

(예)
interface IAbc {
	void plus();
}


