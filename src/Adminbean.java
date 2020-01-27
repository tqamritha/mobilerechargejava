
public class Adminbean {
	
	private int id;
	private String operator;
	private String des;
	private int rate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Adminbean [id=" + id + ", operator=" + operator + ", des=" + des + ", rate=" + rate + "]";
	}

	
	
	
}
