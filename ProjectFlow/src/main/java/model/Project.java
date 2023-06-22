package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String projectName;
	private String descriprion;
	private Date startDate;
	private Date endDate;
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "user", orphanRemoval = true)
    private List<Task> tasks = new ArrayList<>();
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="user_id",updatable = false,nullable = false)
	private User user;
	  
	public Project() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescriprion() {
		return descriprion;
	}
	public void setDescriprion(String descriprion) {
		this.descriprion = descriprion;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date created_At) {
		this.createdAt = created_At;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updated_At) {
		this.updatedAt = updated_At;
	}
	
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", descriprion=" + descriprion + ", startDate="
				+ startDate + ", endDate=" + endDate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", tasks=" + tasks + ", user=" + user + "]";
	}

}
