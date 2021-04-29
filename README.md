# EcommerceMicroService 

## Eureka - Service Discovery
- Spring Cloud Netflix Eureka  
    [실습 구성]
    - discoverservice 패키지 : eureka 서버
    - user-service 패키지 : eureka 서버에 등록할 클라이언트 서버 
 
## API Gateway Service
- Netflix Zuul  
    [실습 구성]
    - zuul-service 패키지  
         -> gateway 역할로 요청 url에 맞는 서비스 호출, ZuulFilter를 오버라이드하여 gateway로 들어오는 요청정보를 확인 할 수 있다.
    - first-service 패키지
    - second-service 패키지 
    
