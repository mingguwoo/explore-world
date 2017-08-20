package com.woo.explore.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wujunyu
 * @version 2016年11月25日 
 */
public class AssignmentApplicant {
		
	private Long id; //主键
	private String applicantPIN; //达人PIN
	private Long applicantId; //达人id
	private Long assignmentId; //任务id
	private Integer assignmentType; //任务类型（0普通任务,1直播任务）
	private Integer contentType; //任务内容类型（0不限,1咨询,2单品,3清单,4搭配,5视频）
	private Integer status; //任务状态
	private String signupReason; //报名理由
	private BigDecimal commission;//佣金
	private Date docUploadDate; 
	private Long docId; //素材id
	private Integer subChannelId; //子渠道id
	private String rate;
	private String rateComment; //评语
	private Date selectedTime;
	private Date docAccpetTime;
	private Date docRejectTIme;
	private String operator;
	private Date created;
	private Date modified;
	private String attachmentKey; //附件Key
	private Date deadline; //交付稿件截止日期
	private BigDecimal quote; //达人报价
	private String ext; //完成pv,uv

	public Date getSelectedTime() {
		return selectedTime;
	}
	public void setSelectedTime(Date selectedTime) {
		this.selectedTime = selectedTime;
	}
	public Date getDocAccpetTime() {
		return docAccpetTime;
	}
	public void setDocAccpetTime(Date docAccpetTime) {
		this.docAccpetTime = docAccpetTime;
	}
	public Date getDocRejectTIme() {
		return docRejectTIme;
	}
	public void setDocRejectTIme(Date docRejectTIme) {
		this.docRejectTIme = docRejectTIme;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApplicantPIN() {
		return applicantPIN;
	}
	public void setApplicantPIN(String applicantPIN) {
		this.applicantPIN = applicantPIN;
	}
	public Long getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getDocUploadDate() {
		return docUploadDate;
	}
	public void setDocUploadDate(Date docUploadDate) {
		this.docUploadDate = docUploadDate;
	}
	public Long getDocId() {
		return docId;
	}
	public void setDocId(Long docId) {
		this.docId = docId;
	}
	public Integer getSubChannelId() {
		return subChannelId;
	}
	public void setSubChannelId(Integer subChannelId) {
		this.subChannelId = subChannelId;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRateComment() {
		return rateComment;
	}
	public void setRateComment(String rateComment) {
		this.rateComment = rateComment;
	}
	public Long getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}
	public BigDecimal getCommission() {
		return commission;
	}
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	public Integer getAssignmentType() {
		return assignmentType;
	}
	public void setAssignmentType(Integer assignmentType) {
		this.assignmentType = assignmentType;
	}
	public Integer getContentType() {
		return contentType;
	}
	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}
	public String getSignupReason() {
		return signupReason;
	}
	public void setSignupReason(String signupReason) {
		this.signupReason = signupReason;
	}
	public String getAttachmentKey() {
		return attachmentKey;
	}
	public void setAttachmentKey(String attachmentKey) {
		this.attachmentKey = attachmentKey;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public BigDecimal getQuote() {
		return quote;
	}
	public void setQuote(BigDecimal quote) {
		this.quote = quote;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	@Override
	public String toString() {
		return "AssignmentApplicant{" +
				"id=" + id +
				", applicantPIN='" + applicantPIN + '\'' +
				", applicantId=" + applicantId +
				", assignmentId=" + assignmentId +
				", assignmentType=" + assignmentType +
				", contentType=" + contentType +
				", status=" + status +
				", signupReason='" + signupReason + '\'' +
				", commission=" + commission +
				", docUploadDate=" + docUploadDate +
				", docId=" + docId +
				", subChannelId=" + subChannelId +
				", rate='" + rate + '\'' +
				", rateComment='" + rateComment + '\'' +
				", selectedTime=" + selectedTime +
				", docAccpetTime=" + docAccpetTime +
				", docRejectTIme=" + docRejectTIme +
				", operator='" + operator + '\'' +
				", created=" + created +
				", modified=" + modified +
				", attachmentKey='" + attachmentKey + '\'' +
				", deadline=" + deadline +
				", quote=" + quote +
				", ext='" + ext + '\'' +
				'}';
	}
}
