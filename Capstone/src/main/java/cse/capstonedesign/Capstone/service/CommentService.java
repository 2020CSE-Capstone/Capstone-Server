package cse.capstonedesign.Capstone.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import cse.capstonedesign.Capstone.dto.request.GetCommentReplyRequestDTO;
import cse.capstonedesign.Capstone.dto.request.InsertCommentRequestDTO;
import cse.capstonedesign.Capstone.dto.response.CommentResponseDTO;
import cse.capstonedesign.Capstone.mapper.CommentMapper;

@Service
public class CommentService {

	private final CommentMapper commentMapper;

	public CommentService(CommentMapper commentMapper) {
		this.commentMapper = commentMapper;
	}

	public List<CommentResponseDTO> getAllComments(@PathVariable("board_no") int board_no) {
		return commentMapper.getAllComments(board_no).stream().map(CommentResponseDTO::of).collect(Collectors.toList());
	}
	
	public List<CommentResponseDTO> getAllReplyComments(@RequestBody GetCommentReplyRequestDTO reply) {
		return commentMapper.getAllReplyComments(reply).stream().map(CommentResponseDTO::of).collect(Collectors.toList());
	}

	public boolean insertComment(@RequestBody InsertCommentRequestDTO newComment) {
		return commentMapper.insertComment(newComment) != 0;
	}
}
