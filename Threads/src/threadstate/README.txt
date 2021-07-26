[스레스 상태]

1. 스레드 객체 생성(NEW)
   - 스레드 객체가 생성된 상태
   - start()가 호출되지 않은 상태


2. 실행 대기(RUNNABLE)
   - 시작(start) 된 상태
   - 실행 가능한 상태


3. 실행(RUNNING)
   - 실행되고 있는 상태

4. 일시정지상태
   - WAITING : 대기상태
   - TIMED_WAITING : 주어딘 시간동안 대기 상태
   - BLOCKED : 락이 풀리기는 기다리는 상태, synchronized method, synchronized block 대기 상태, ...

5. 종료(TERMINATED)
   - 스레드의 실행이 완전히 종료된 상태
   
   