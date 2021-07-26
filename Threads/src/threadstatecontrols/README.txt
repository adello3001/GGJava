[스레드 상태 제어]

   
1. 일시정지상태 : 실행 -> 일시정지
   - sleep
   - join
   - wait
   - suspend : Deprecated
   
2. 실행대기상태 : 일시정지 -> 실행대기, 실행 -> 실행대기
   - interrupt
   - notify
   - notifyAll
   - resume : Deprecated
   - yield : 실행 -> 실행대기
   
3. 종료
   - stop : Deprecated
   
4. sleep
   - 일시 정지 상태
   - 주어진 시간이 지나면 실행 대기 상태로 전환
   
5. interrupt
   - InterruptException 예외를 발생 시킴

6. notify, notifyAll
   - 실행대기 상태로 만듦
   - wait() 메소드에 의해 정지 상태에 있는 스레드를 실행 대기 상태로 만듦      
   - resume 대신 사용

7. join
   - 일시 정지 상태
   - 다른 스레드가 종료 되기를 기다림
   
8. wait
   - 동기화 블록 내에서 일시 정지 상태
   - 매개값으로 주어진 시간이 지나면 자동으로 실행 대기 상태    
   - 시간이 주어지지 않으면 notify, notifyAll에 의해서 실행 대기 상태
   
9. yield
   - 실행 대기 상태
   - 다른 스레드에게 실행을 양보

10. Deprecated : 사용을 권고하지 않음
   - resume
   - suspend
   - stop   
   
        