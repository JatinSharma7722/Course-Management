package courseManagementAppBackend.dto;

public class CourseEnrolled {
	private Integer courseEnrolledId;
	private Integer rollNo;
	private Integer courseId;
	public CourseEnrolled() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCourseEnrolledId() {
		return courseEnrolledId;
	}
	public void setCourseEnrolledId(Integer courseEnrolledId) {
		this.courseEnrolledId = courseEnrolledId;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	
	
}
