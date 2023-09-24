package co.edureka.web.models;

public class Account {
	private Long accountNo;
	private String accountName;
	private Float accountBal;

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Float getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(Float accountBal) {
		this.accountBal = accountBal;
	}

}
