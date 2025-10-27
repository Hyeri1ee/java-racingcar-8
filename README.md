# java-racingcar-precourse

### 설계
1. Main에서의 진입점 최소
2. 도메인의 역할 분리 (Car, Game) => /domain Car, Game 클래스 생성
3. Car도 여러개, Game도 여러개 -> CarController, GameController 로 각 도메인의 행위를 분리하여 통제

### 구현

1. 