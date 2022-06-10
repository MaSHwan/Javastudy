package com.boardmap;

public class BoardVO {
	// 속성 데이터

	private String register;
	private String subject;
	private String email;
	private String content;
	private String passwd;

	// 알트 쉬프트 s 꼭 기억하기!!!!!!!!!
	public BoardVO(String register, String subject, String email, String content, String passwd) {
		super();
		this.register = register;
		this.subject = subject;
		this.email = email;
		this.content = content;
		this.passwd = passwd;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "작성자 =" + register + ", 제목 = " + subject + ", email = " + email + ", 내용 = " + content
				;
	}
	
	
}
