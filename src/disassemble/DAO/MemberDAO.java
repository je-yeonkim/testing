package disassemble.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;

import disassemble.DTO.MemberDTO;



public class MemberDAO implements IMemberDAO{
	private HashMap<String, MemberDTO> members;
	
	
	public MemberDAO() {
		members = new HashMap<>();
		
	}
	@Override
	public Collection<MemberDTO> selectAll() {
		return members.values();

	}

	@Override
	public MemberDTO selectEmail(String email) {
	   MemberDTO member = members.get(email);
	    return member;
	}

	@Override
	public void insert(MemberDTO member) {
		members.put(member.getEmail(), member);
		
	}

	@Override
	public void update(MemberDTO member) {
		members.put(member.getEmail(), member);
		
	}

	@Override
	public void delete(String email) {
		members.remove(email);
		
	}

}
