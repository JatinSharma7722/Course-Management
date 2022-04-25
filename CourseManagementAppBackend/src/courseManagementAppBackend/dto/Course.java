package courseManagementAppBackend.dto;

public class Course {
		private Integer courseId;
		private String courseName;
		private Integer courseDuration;
		private Integer coursePrice;
		
		public Course() {
			
		}

		public Integer getCourseId() {
			return courseId;
		}

		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Integer getCourseDuration() {
			return courseDuration;
		}

		public void setCourseDuration(Integer courseDuration) {
			this.courseDuration = courseDuration;
		}

		public Integer getCoursePrice() {
			return coursePrice;
		}

		public void setCoursePrice(Integer coursePrice) {
			this.coursePrice = coursePrice;
		}
		
}
