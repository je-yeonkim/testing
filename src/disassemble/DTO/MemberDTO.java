package disassemble.DTO;

public class MemberDTO implements IMemberDTO{
	private String email;
	private String password;
	private String name;
	private String registerDate;
	
	@Override
	public void setEmail(String email) {
		
		this.email= email;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void setRegisterDate(String registerDate) {
		// TODO Auto-generated method stub
		this.registerDate=registerDate;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getRegisterDate() {
		// TODO Auto-generated method stub
		return registerDate;
	}

	

	

}
