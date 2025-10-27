# java-racingcar-precourse

### 설계
1. Main에서의 진입점 최소
2. 도메인의 역할 분리 (Car, Game) => /domain Car, Game 클래스 생성
3. Car도 여러개, Game도 여러개 -> GameController 로 각 도메인의 행위를 분리하여 통제

### 구현시 주의한 부분

1. Car은 Game에서, Game의 내부 메소드는 GameController에서 사용되도록 함
2. Application 의 진입점 최소화
3. ErrorMessage Enum화 (숫자, 자동차이름, 공통 구분)
4. 명령어 또한 Enum화

### 구현후 배우고 싶은거/의문점

1. missionUtils의 assertSimpleTest 함수의 편의성
2. 값이 특정될수 없고 예측 불가능한 경우 어떻게 테스트를 하는게 효과적인지
3. 오류 메시지가 다르고, 다른 클래스에서 같은 기능을 검사하는 메소드는 어떻게 처리해야 좋은가
    ```java
   // Car.java
   //이름 빈 값인지, 5자 초과인지 판별
   private void validateName(String name) {
   if (name == null || name.isEmpty()) {
   throw new IllegalArgumentException(ErrorMessage.CARNAME_NOTEMPTY.getMessage());//깔끔?
   }...
    ```
   ```java
    //Input.java
   //위 두 함수에 공통 적용
   private static void validateIsEmpty(String input) {
   if (input == null || input.trim().isEmpty()) {
   throw new IllegalArgumentException(ErrorMessage.INPUT_EMPTY.getMessage());
   }
   }
   ```