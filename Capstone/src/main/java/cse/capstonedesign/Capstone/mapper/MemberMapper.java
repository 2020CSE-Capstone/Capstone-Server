package cse.capstonedesign.Capstone.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cse.capstonedesign.Capstone.model.Member;

@Mapper
public interface MemberMapper {
	public List<Member> getAllMembers();

	public Member getMemberById(@Param("id") int id);

	public int insertMember(@Param("member") Member member);

	public int updateMember(@Param("id") int id, @Param("member") Member member);

	public int deleteMember(@Param("id") int id);
}