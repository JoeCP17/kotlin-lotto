# kotlin-lotto

# Step1 - 문자열 덧셈 계산기 
## 도메인 ( Domain )
- 문자열 식 ( Expression )
- 계산기 ( Calculator )
- 결과 값 ( FinalResult )

## 고려해야하는 사항 
- 음수가 입력되어 있을 경우 예외를 처리해야한다 ( Runtime Exception )
- 구분자는 , 외 : 도 사용할 수 있다.

# Step2 - 로또 ( Lotto )
## 도메인 ( Domain )
- 구매금액 ( BuyAmount )
- 로또 번호 ( Number )
- 로또 ( Lotto ) - 일급 컬렉션
- 로또 상점 ( LottoStore )
- 구매한 로또 티켓들 ( LottoTickets ) 
- 로또 당첨 확인 ( WinningLotto )
- 로또 최종 결과 ( LottoResult )
- 번호생성기 ( NumberGenerator )

## 고려해야하는 사항
- 구매금액
  - 구매 금액은 0원보다 많아야 한다. 
  - 로또의 한장 가격은 1000원이다.
- 로또 상점
  - 구매 금액에 따른 로또번호 발급이 이뤄진다. 
  - 이전 당첨 번호 입력을 통해 당첨 내역 확인이 가능하다. 
- 로또 번호
  - 로또 번호는 1 ~ 45 사이의 숫자이다.
  - 로또 번호는 중복될 수 없다.
- 번호생성기 
  - 각 전략을 통해 번호 생성이 가능하다.
- 로또 티켓
  - 로또 티켓은 구매한 수량만큼 번호가 생성된다.
- 로또 결과
  - 당첨 내용에 따른 통계 계산이 가능하다.
  - 이전 당첨번호를 통해 당첨 여부 확인이 가능하다.
  - 로또의 총 금액은 0보다 커야한다.

# Step3 - 로또 2등구현 ( Lotto )
추가적인 요구사항 
- 지난 주 당첨번호 입력이 완료된 이후, 보너스 볼 입력이 이뤄져야 한다. 
- 당첨 통계 시, 5개 일치 + 보너스 볼 일치의 경우 2등으로 처리한다.

개인적인 수정사항
- 로또 당첨율 View를 수정한다. ( ex. 0.01 )과 같이 소수점 2자리까지 표현한다.
- Main 함수 내, 비지니스 흐름을 파악할 수 있도록 리펙토링을 재 진행한다. 

추가한 도메인 
- 보너스 숫자 ( BonusNumber )

# Step4 - 로또 수동 구매 ( Lotto )
추가적인 요구사항
- 사용자가 수동으로 추첨번호를 입력할 수 있도록 해야한다.
- 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야한다.
- 수동 생성 번호는 자동 생성 번호와 중복될 수 없다.
- 구매한 금액에서 수동 생성한 티켓을 제외한 나머지가 생성되어야 한다. 
