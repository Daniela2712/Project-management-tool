package model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String descriprion;
	private String status;
	private String priority;
	private Date createdAt;
	private Date updatedAt;
	private String createdBy;
	private Date dueDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id")
	private Project project;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private String assignedUser;
	
	public Task() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescriprion() {
		return descriprion;
	}
	public void setDescriprion(String descriprion) {
		this.descriprion = descriprion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String getAssignedUser() {
		return assignedUser;
	}
	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", descriprion=" + descriprion + ", status=" + status
				+ ", priority=" + priority + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", createdBy="
				+ createdBy + ", dueDate=" + dueDate + ", project=" + project + ", assignedUser=" + assignedUser + "]";
	}
	
}
