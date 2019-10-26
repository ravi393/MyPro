
public class MyAccount {
	int Accno;
	String AccN;
	int Bal;
	public int getAccno() {
		return Accno;
	}
	public void setAccno(int accno) {
		Accno = accno;
	}
	public String getAccN() {
		return AccN;
	}
	public void setAccN(String accN) {
		AccN = accN;
	}
	public int getBal() {
		return Bal;
	}
	public void setBal(int bal) {
		Bal = bal;
	}
	@Override
	public String toString() {
		return "MyAccount [Accno=" + Accno + ", AccN=" + AccN + ", Bal=" + Bal + "]";
	}
	

}
