import newRoughWork.{Banktransfer, CreditCard, Paypal}

import scala.io.StdIn
object PaymentMethodMain extends App {
  val objOfCreditCard = CreditCard(89768768L, "12/mar", 324)
  val objOfPaypal = Paypal("ajit.kumar@knoldus.com", "Pass@123")
  val objOfBankTransfer = Banktransfer(7865467983L, 1234)
  println(s"Enter a option to add payment \n1. CreditCard\n2. Paypal\n3. AccountTransfer")
  val resultOption = StdIn.readInt()
  if (resultOption == 1)
    objOfCreditCard.processPayment(8000)
  else if (resultOption == 2)
    objOfPaypal.processPayment(14000)
  else
    objOfBankTransfer.processPayment(23000)
}
