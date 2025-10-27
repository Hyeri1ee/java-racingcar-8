# java-racingcar-precourse

### 설계
1. Main에서의 진입점 최소
2. 도메인의 역할 분리 (Car, Game) => /domain Car, Game 클래스 생성
3. Car도 여러개, Game도 여러개 -> CarController, GameController 로 각 도메인의 행위를 분리하여 통제

### 구현시 주의한 부분

1. Car은 Game에서, Game의 내부 메소드는 GameController에서 사용되도록 함
2. Application 의 진입점 최소화
3. ErrorMessage Enum화 (숫자, 자동차이름, 공통 구분)
4. 명령어 또한 Enum화

### 구현후 배우고 싶은거/의문점

1. missionUtils의 assertSimpleTest 함수의 편의성
2. //값이 특정될수 없고 예측 불가능한 경우 어떻게 테스트를 하는게 효과적인지