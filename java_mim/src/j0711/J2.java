package j0711;
class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}

public class J2 {
	static void setPassword(String password) throws PasswordException {
		if(password==null)
			throw new PasswordException("비밀번호를 입력하세요");
		if(password.length()<8)
			throw new PasswordException("8자 이상 입력하세요.");
		if(password.matches("[a-zA-Z]+"))
			throw new PasswordException("비밀번호 숫자나 특수문자 포함");
	}
	public static void main(String[] args) {
		try {
			setPassword("12345");
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
