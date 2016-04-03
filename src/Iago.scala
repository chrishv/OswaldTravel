object Iago extends App {

  // Define the locations on offer
  val birmingham = new Location("Birmingham")
  val london = new Location("London")
  val newcastle = new Location("Newcastle")
  
  //Let's create the customers
  val man1 = new Customer("Alan","Alpabet","Married",newcastle,"Male")
  val woman1 = new Customer("Adele","Alpabet","Married",london,"Female")
  val man2 = new Customer("Boris","Becker","Married",newcastle,"Male")
  val woman2 = new Customer("Betty","Alpabet","Married",london,"Female")
  
  println("Alan is a " + man1.whatIsYourMaritalStatus + " " + man1.sex) 
  
}