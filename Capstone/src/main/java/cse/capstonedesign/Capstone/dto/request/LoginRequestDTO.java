package cse.capstonedesign.Capstone.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginRequestDTO {
	private String email;
	private String password;

	public LoginRequestDTO() {

	}

	public LoginRequestDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

}
