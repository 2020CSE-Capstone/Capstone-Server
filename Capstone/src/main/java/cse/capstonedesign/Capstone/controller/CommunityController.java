package cse.capstonedesign.Capstone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cse.capstonedesign.Capstone.dto.request.InsertWritingRequestDTO;
import cse.capstonedesign.Capstone.dto.request.UpdateWritingRequestDTO;
import cse.capstonedesign.Capstone.service.CommunityService;

@RestController
@RequestMapping("/api/community")
public class CommunityController {

	private final CommunityService communityService;

	public CommunityController(CommunityService communityService) {
		this.communityService = communityService;
	}

	@GetMapping("/recent")
	public ResponseEntity getRecentAllWritings() {
		return communityService.getRecentAllWritings();
	}
	
	@GetMapping("/popular")
	public ResponseEntity getLikeAllWritings() {
		return communityService.getLikeAllWritings();
	}
	
	@GetMapping("/mypage/{user_id}")
	public ResponseEntity getUserAllWritings(@PathVariable("user_id") int user_id) {
		return communityService.getUserAllWritings(user_id);
	}
	
	@GetMapping("/search/{key_word}")
	public ResponseEntity getSearchWritings(@PathVariable("key_word") String key_word) {
		return communityService.getSearchWritings(key_word);
	}

	@GetMapping("/{board_no}")
	public ResponseEntity getWritingDetailByNo(@PathVariable("board_no") int board_no) {
		return communityService.getWritingDetailByNo(board_no);
	}

	@PostMapping("")
	public ResponseEntity insertWriting(@RequestBody InsertWritingRequestDTO newWriting) {
		return communityService.insertWriting(newWriting);
	}

	@PutMapping("/{board_no}")
	public ResponseEntity updateWriting(@PathVariable("board_no") int board_no, @RequestBody UpdateWritingRequestDTO updated_writing) {
		return communityService.updateWriting(board_no, updated_writing);
	}

	@DeleteMapping("/{board_no}")
	public ResponseEntity deleteWriting(@PathVariable("board_no") int board_no) {
		return communityService.deleteWriting(board_no);
	}
}