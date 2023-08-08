package Atmm;
public interface AtmOperationImpl implements AtmOpetarionInterface{
	Machine atm= new Machine();

	public void viewBalance(){
		System.out.println("Available balance is:" +atm.getbalance());
}
	public void withdrawAmount(double withdrawAmount){
}
	public void depositeAmount(double depositeAmount){
		System.out.println(depositeAmount+ " Deposited successfully !!");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
}
	public void viewMiniStatement(){
}
}