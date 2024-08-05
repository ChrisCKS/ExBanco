package entities;

public class Cliente {

	private String holder;
	private int account;
	private double balance;


	public Cliente() {
	}
	
	public Cliente (String holder, int account, double initialDeposit) {
		this.holder = holder;
		this.account = account;
		deposito(initialDeposit);
	}
	
	public Cliente(String holder, int account) {
		this.holder = holder;
		this.account = account;
	}
	
	//O nome pode ser obtido
	public String getHolder() {
		return holder;
	}
	 //O nome pode ser modificado
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	//O numero da conta podera ser apenas obtido, mas não modificado
	public int getAccount() {
		return account;
	}
	
	//O saldo podera ser apenas obtido, sera modificado apenas com saques e depositos
	public double getBalance() {
		return balance;
	}
	
	public void deposito(double balance) {
		this.balance += balance;
	}
	
	public void saque(double balance) {
		this.balance -= balance + 5.0;
	}
	
	public String toString() {
		return "Account "
			+ account
			+ ", Holder: "
			+ holder
			+ ", Balance: $ "
			+ String.format("%.2f", balance);
	}
}