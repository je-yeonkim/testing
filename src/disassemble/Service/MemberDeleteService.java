package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberDeleteService {
	
	private MemberDAO memberDao;
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void checkPassword(String email, String password, String confirmPassword) {
		MemberDTO members = memberDao.selectEmail(email);
		if(members == null) {
			System.out.println("등록된 정보가 없습니다.");
		}else {
			if(members.getPassword().equals(password) && password.equals(confirmPassword)) {
				memberDao.delete(email);
				System.out.println(email + " 삭제되었습니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		// 패스워드 확인
		// MemberDAO 객체 내 selectEmail() 메소드를 호출 
		// 저장된 회원 정보와 입력된 회원 정보 검증
		// MemberDAO 객체 내 delete() 호출
	}
}
