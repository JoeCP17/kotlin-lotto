package camp.nextstep.edu.step.step2.view

import camp.nextstep.edu.step.step2.domain.amount.BuyAmount
import camp.nextstep.edu.step.step2.domain.lotto.Lotto
import camp.nextstep.edu.step.step2.domain.number.BonusNumber
import camp.nextstep.edu.step.step2.domain.number.Number

object InputView {

    fun getInputValueAndReturnBuyAmount(): BuyAmount {
        println("구입금액을 입력해 주세요.")
        return BuyAmount(readLine()!!.toLong())
    }

    fun inputLastWeekWinningNumbers(): Lotto {
        println("지난 주 당첨 번호를 입력해 주세요.")
        return Lotto.ofInputValues(numbers = readLine()!!)
    }

    fun inputBonusNumber(): BonusNumber {
        println("보너스 볼을 입력해 주세요.")
        return BonusNumber(number = Number(number = readLine()!!.toInt()))
    }

}
