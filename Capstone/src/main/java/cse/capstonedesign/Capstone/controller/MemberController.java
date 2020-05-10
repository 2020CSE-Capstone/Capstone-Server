package cse.capstonedesign.Capstone.controller;

import cse.capstonedesign.Capstone.dto.request.InsertMemberRequestDTO;
import cse.capstonedesign.Capstone.dto.request.UpdateMemberRequestDTO;
import cse.capstonedesign.Capstone.dto.response.MemberDetailResponseDTO;
import cse.capstonedesign.Capstone.dto.response.MemberSimpleResponseDTO;
import cse.capstonedesign.Capstone.model.Member;
import cse.capstonedesign.Capstone.service.MemberService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

	private final MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@PostMapping("")
	public boolean saveMember(@RequestBody InsertMemberRequestDTO newMember) {
		return memberService.saveMember(newMember);
	}

	@GetMapping("")
	public List<MemberSimpleResponseDTO> getAllMembers() {
		return memberService.getAllMembers();
	}

	@GetMapping("/{memberId}")
	public MemberDetailResponseDTO getMemberById(@PathVariable("memberId") int memberId) {
		return memberService.getMemberById(memberId);
	}

	@PutMapping("/{memberId}")
	public boolean putMember(@PathVariable("memberId") int memberId, @RequestBody UpdateMemberRequestDTO puttedMember) {
		return memberService.putMember(memberId, puttedMember);
	}

	@DeleteMapping("/{memberId}")
	public boolean deleteMember(@PathVariable("memberId") int memberId) {
		return memberService.deleteMember(memberId);
	}
}