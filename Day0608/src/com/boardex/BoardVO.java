package com.boardex;

public class BoardVO {
	// �Ӽ� ������

	private String register;
	private String subject;
	private String email;
	private String content;
	private String passwd;

	// ��Ʈ ����Ʈ s �� ����ϱ�!!!!!!!!!
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
		return "�ۼ��� =" + register + ", ���� = " + subject + ", email = " + email + ", ���� = " + content
				;
	}
	
	
}
