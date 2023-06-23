package disassemble.Service;

import java.util.Collection;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberAllService {
	private MemberDAO memberDao;
	
	public MemberAllService(MemberDAO memberDao){
		this.memberDao = memberDao;
	}
	
	public void selectAll() {
		Collection<MemberDTO> members = memberDao.selectAll();
		if(members.isEmpty()) {
			System.out.println("등록된 정보가 없습니다.");
		}else {
			for(MemberDTO member : members) {
				System.out.println("이메일 : " + member.getEmail());
				System.out.println("이름 : " + member.getName());
				System.out.println("암호 : " + member.getPassword());
				System.out.println();
			}
		}
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
	}

}
