[�������̽�]

�������̽�(interface)

1. ��ü�� ��� ����� ������ Ÿ���̴�.
2. ��ü�� ��ȯ���� ���� �ֱ� ���� ����
3. ��ü�� ��ü ������ ����ϴ� ����
4. �Լ��� ��(�ñ״�ó)�� ����
5. ����� ���� ���� Ŭ������ ���ؼ��� ��ü�� ���� �� �ִ�.
6. Ŭ������ �԰�ȭ(���ȭ, ������Ʈȭ)

(���ÿ��)
1. IDL(Interface Definition Language)
2. API ( Application Programming Interface)
3. Static Library
4. Dynamic Library(DLL)
5. Shared Library(SO)
6. RMI (Java Remote Method Invocation)
7. COM (Component Object Model)
8. DCOM (Distributed Component Object Model)

(�ڹ� �������̽�)
interface name {
	type constant = value;						// ����ʵ�
	type method(parameter, ...);				// �߻� �޼ҵ�
	
	// �ڹٿ� Ưȭ�� ���
	default type method(parameter, ...) { ... }	// ����Ʈ
	static type method(parameter, ...) { ... };	// ���� �޼ҵ�
}

(��)
interface IAbc {
	void plus();
}


