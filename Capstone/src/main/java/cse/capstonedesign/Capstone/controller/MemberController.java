package cse.capstonedesign.Capstone.controller;

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
	public boolean saveMember(@RequestBody Member newMember) {
		return memberService.saveMember(newMember);
	}

	@GetMapping("")
	public List<Member> getAllMembers() {
		return memberService.getAllMembers();
	}

	@GetMapping("/{memberId}")
	public Member getMemberById(@PathVariable("memberId") int memberId) {
		return memberService.getMemberById(memberId);
	}

	@PutMapping("/{memberId}")
	public boolean putMember(@PathVariable("memberId") int memberId, @RequestBody Member puttedMember) {
		return memberService.putMember(memberId, puttedMember);
	}

	@DeleteMapping("/{memberId}")
	public boolean deleteMember(@PathVariable("memberId") int memberId) {
		return memberService.deleteMember(memberId);
	}
}