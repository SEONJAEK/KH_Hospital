package user;

public class UserDTO {
	private String USER_ID;
	private String USER_PW;
	private String USER_NAME;
	private char SEX;
	private int AGE;
	private String PHONE;
	private String ADDRESS;
	private String EMAIL;
	private int IS_ADMIN;
	public String getUSER_ID() {
		return USER_ID;
	}
	public String getUSER_PW() {
		return USER_PW;
	}
	public void setUSER_PW(String uSER_PW) {
		USER_PW = uSER_PW;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public char getSEX() {
		return SEX;
	}
	public void setSEX(char sEX) {
		SEX = sEX;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public int getIS_ADMIN() {
		return IS_ADMIN;
	}
	public void setIS_ADMIN(int iS_ADMIN) {
		IS_ADMIN = iS_ADMIN;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

}
