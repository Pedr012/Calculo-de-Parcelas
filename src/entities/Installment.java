package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

//parcelas
public class Installment {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");

	
	private Date dueDate;
	private double amount;

	public Installment (){
	}

	public Installment(Date dueDate, double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f" , amount)  ;
	}
	
	
	
	
	
	
}
