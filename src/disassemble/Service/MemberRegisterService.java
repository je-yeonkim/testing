package disassemble.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;
import disassemble.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void regist(RegisterRequest req) {
		// password == confirmPassword
		if(req.getPassword().equals(req.getConfirmPassword()) == false) {
			System.out.println("암호가 일치하지 않습니다.");
			return;
		}
		
		// email로 계정 등록 여부 확인
		MemberDTO check = memberDao.selectEmail(req.getEmail());
		if(check == null) {
			// memberDao.insert() 계정 등록
			MemberDTO member = new MemberDTO();
			member.setEmail(req.getEmail());
			member.setPassword(req.getPassword());
			member.setName(req.getName());
	 
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	        String formatedNow = sdf.format(new Date());

			member.setRegisterDate(formatedNow);
			
			memberDao.insert(member);
			System.out.println(req.getEmail() + "정보가 등록되었습니다.");
		}else {
			System.out.println("등록된 이메일입니다.");
		}
		
		
	}

}












