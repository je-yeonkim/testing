package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class ChangePasswordService {
	private MemberDAO memberDao;
	
	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void changePassword(String email, String oldPw, String newPw) {
		MemberDTO members = memberDao.selectEmail(email);
		if(members == null) {
			System.out.println("등록된 정보가 없습니다.");
		}else {
			if(members.getPassword().equals(oldPw)) {
				members.setPassword(newPw);
				memberDao.update(members);
				System.out.println("비밀번호가 수정되었습니다.");
			}else {
				System.out.println("비밀번호를 틀렸습니다.");
			}
		}
		// 이메일 등록여부 확인.
		// 패스워드 확인 및 MemberDAO.update() 호출 
	}

}
