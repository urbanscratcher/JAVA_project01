package com.apple.score.domain;

import com.apple.cmn.DTO;

public class ScoreVO extends DTO implements Comparable
{
	private String memId;			//아이디
	private String pjSeqNo;			//강의시퀀스넘버 //프로젝트에선 "1"로 고정한다
	private String assignNo;			//과제시퀀스넘버 //출석10, 과제20,
	private int score;				//점수
	private String scComment;		//점수코멘트
	private String scSeqNo;			//점수파일count시퀀스
	
	public ScoreVO() 
	{
		
	}

	public ScoreVO(String memId, String pjSeqNo, String assignNo, int score, String scComment, String scSeqNo) 
	{
		super();
		this.memId = memId;
		this.pjSeqNo = pjSeqNo;
		this.assignNo = assignNo;
		this.score = score;
		this.scComment = scComment;
		this.scSeqNo = scSeqNo;
	}

	public String getMemId() 
	{
		return memId;
	}

	public void setMemId(String memId) 
	{
		this.memId = memId;
	}

	public String getpjSeqNo() 
	{
		return pjSeqNo;
	}

	public void setpjSeqNo(String pjSeqNo) 
	{
		this.pjSeqNo = pjSeqNo;
	}

	public String getAssignNo() 
	{
		return assignNo;
	}

	public void setAssignNo(String assignNo) 
	{
		this.assignNo = assignNo;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}

	public String getScComment() 
	{
		return scComment;
	}

	public void setScComment(String scComment) 
	{
		this.scComment = scComment;
	}

	public String getScSeqNo() 
	{
		return scSeqNo;
	}

	public void setScSeqNo(String scSeqNo) 
	{
		this.scSeqNo = scSeqNo;
	}

	@Override
	public String toString() 
	{
		return "ScoreVO [memId=" + memId + ", pjSeqNo=" + pjSeqNo + 
				 ", assignNo=" + assignNo + ", score=" + score + 
				 ", scComment=" + scComment + ", scSeqNo=" + scSeqNo + 
				 ", toString()=" + super.toString() + "]";
	}
	
	// ---compareTo------------------------------------------------------- by AssignmentVO
	// 최신 글이 가장 상단에 위치하도록 함
	@Override
	public int compareTo(Object o) {
		ScoreVO vo = (ScoreVO) o;
		return vo.getScSeqNo().compareTo(this.getScSeqNo());
	}
	
	


	
	
	
	
}
