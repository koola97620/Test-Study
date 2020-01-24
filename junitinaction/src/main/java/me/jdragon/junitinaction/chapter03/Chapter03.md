# 03 JUnit 마스터하기

- @Beford,@After 메서드는 @Test 메서드의 성공 실패 여부는 상관없다
- @BeforeClass, @AfterClass 는 클래스 안에 정의된 모든 테스트 메서드들을 수행하기 전과 후에 한번씩만 실행

JUnit 모범 사례 : 한 번에 하나의 객체만 테스트하라
- 단위테스트는 잘게 나뉘어져야 한다
- 한번에 두개 이상의 객체를 테스트한다면 어느 한 객체가 수정되어도 서로 간에 어떤 영향을 줄지 예측이 어렵다
- 테스트 대상 객체가 다른 복잡한 객체와 상호작용한다면, 복잡한 객체 대신 예측 가능한 테스트용 도우미 객체들로 감싸서 테스트한다

JUnit 모범 사례 : 테스트 메서드에 의미 있는 이름을 부여하라
- 무엇을 테스트 하는 건지 이름만 보고 알 수 있어야 한다

JUnit 모범 사례 : assert 호출 시에는 실패 원인을 기숧하라

JUnit 모범 사례 :  하나의 @Test 메서드에서는 하나의 테스트만 수행하라
- 여러 테스트를 하나의 메서드에 넣지 말자
- 단위 테스트는 잘 동작하던 기능이 오작동할 때 바로 알려줄 거라는 확신을 심어준다
- 두 개 이상의 테스트 수행한다면, 문제 원인을 파악하기 어렵다
- 같은 테스트 클래스 안의 모든 테스트 메서드는 같은 픽스처를 공유하고, JUnit 이 테스트 스위트까지
  알아서 만들어주기 때문에 단위 테스트당 하나의 메서드를 할당한다

JUnit 모범 사례 : 실패할 가능성이 있는 모든 것을 테스트하라
- 메서드가 어떤 방식으로건 파라미터나 필드의 값을 수정한다면, 테스트가 피요한 고유 기능이 존재한다는 것을 의미

JUnit 모범 사례 : 테스트를 통해 코드를 개선하라
- 테스트 도중 사용하기 불편한점이 발견되면, 주저하지 말고 리패토링 하자

JUnit 모범 사례 : 같은 패키지, 다른 디렉토리
- 테스트 클래스와 도메인 클래스는 같은 패키지를 공유하되, 물리적으로는 다른 디렉토리를 구조를 사용해라