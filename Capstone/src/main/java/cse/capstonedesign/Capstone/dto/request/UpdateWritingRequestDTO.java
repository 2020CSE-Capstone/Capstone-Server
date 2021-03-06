package cse.capstonedesign.Capstone.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UpdateWritingRequestDTO {
	private String title;
	private String content;
	
	public UpdateWritingRequestDTO() {

	}

	public UpdateWritingRequestDTO(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
