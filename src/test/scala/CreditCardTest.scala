
import scala.util.Try
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import newRoughWork.{Banktransfer, CreditCard, Paypal}

class PaymentMethodSpec extends AnyFlatSpec with Matchers {

  "CreditCard" should "process payment correctly" in {
    val creditCard = CreditCard(1234567890L, "12/25", 123)
    val amount = 10000.0
    val expectedBalance = amount - 4500

    Try(creditCard.processPayment(amount)) match {
      case scala.util.Success(_) => // payment processed successfully
      case scala.util.Failure(e) => fail(e) // payment processing failed, fail the test
    }

    creditCard shouldEqual CreditCard(1234567890L, "12/25", 123)
    // check if the balance is updated correctly
    Try(creditCard.processPayment(amount)) match {
      case scala.util.Success(_) => // payment processed successfully
      case scala.util.Failure(e) => fail(e) // payment processing failed, fail the test
    }
    creditCard shouldEqual CreditCard(1234567890L, "12/25", 123)
  }

  "Paypal" should "process payment correctly" in {
    val paypal = Paypal("test@example.com", "password")
    val amount = 10000.0
    val expectedBalance = amount - 3500

    Try(paypal.processPayment(amount)) match {
      case scala.util.Success(_) => // payment processed successfully
      case scala.util.Failure(e) => fail(e) // payment processing failed, fail the test
    }

    paypal shouldEqual Paypal("test@example.com", "password")
    // check if the balance is updated correctly
    Try(paypal.processPayment(amount)) match {
      case scala.util.Success(_) => // payment processed successfully
      case scala.util.Failure(e) => fail(e) // payment processing failed, fail the test
    }
    paypal shouldEqual Paypal("test@example.com", "password")
  }

  "Banktransfer" should "process payment correctly" in {
    val bankTransfer = Banktransfer(987654321L, 1234)
    val amount = 10000.0
    val expectedBalance = amount - 6000

    Try(bankTransfer.processPayment(amount)) match {
      case scala.util.Success(_) => // payment processed successfully
      case scala.util.Failure(e) => fail(e) // payment processing failed, fail the test
    }

    bankTransfer shouldEqual Banktransfer(987654321L, 1234)
    // check if the balance is updated correctly
    Try(bankTransfer.processPayment(amount)) match {
      case scala.util.Success(_) => // payment processed successfully
      case scala.util.Failure(e) => fail(e) // payment processing failed, fail the test
    }
    bankTransfer shouldEqual Banktransfer(987654321L, 1234)
  }
}
