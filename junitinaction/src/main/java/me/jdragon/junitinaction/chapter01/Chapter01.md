# 01 JUnit 첫 걸음

단위 테스트란 ?
작업의 한 단위(unit)의 동작을 검사하는 테스트를 말한다

이 책에서는 단위 테스트를 다른 단위들에 종속되지 않은 하나의 단위에 대한 테스트 라는 의미로 사용한다

단위 테스트는 명확한 작업 단위의 동작을 검사한다
자바 애플리케이션에서의 명확한 작업 단위는 보통 하나의 메서드로 간주된다

통합테스트나 인수테스트는 다양한 컴포넌트 사이의 상호작용을 검증한다

단위 테스트의 모토는 프로그램에서 자동화된 테스트를 거치지 않은 기능은 존재하지 않는다

애플리케이션의 어딘가가 수정이 발생할 때마다 여전히 잘 동작하는지 확인하기 위한 것, 즉 테스트가 필요하다

Calculator 의 add 메서드를 예로

add 메서드의 반환값이 계산 결과의 예상 값과 일치하는지 확인하는 프로그램을 작성하면?

add 메서드에 어떠한 수정이 생겼을때!
테스트 메서드를 돌려서 수정 전과 후의 반환값이 일치하는지 확인할 수 있다.

단위테스트의 규칙
- 단위 테스트는 다른 모든 단위 테스트들과 독립적으로 실행되어야 한다
- 프레임워크는 테스트 각각의 오류를 식별하고 보고해야 한다
- 어떤 테스트를 실행할지 선택하기 쉬워야 한다
