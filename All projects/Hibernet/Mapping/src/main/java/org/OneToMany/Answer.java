package org.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	@ManyToOne
//	@JoinColumn(name="-----")
	private Question question;
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	public Answer(int answerId, String answer, Question question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}
	public Answer() {
		super();
		
	}
	
}
