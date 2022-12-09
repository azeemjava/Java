package in.triton.all.mapping;

import java.util.List;
import org.springframework.stereotype.Component;
import in.triton.all.entity.Course;
import in.triton.all.entity.CourseStudent;
import in.triton.all.request.CourseRequest;
import jakarta.validation.Valid;

@Component
public class CourseRequestMapper {

	public CourseStudent modelToEntitys(@Valid CourseRequest courseRequest, int id) {
		
		List<Course> cours = courseRequest.getCourses();
		
		CourseStudent courseStudent = new CourseStudent();
		int number = 0;
		for (Course courses : cours) {

			number = courses.getCourseId();
			courseStudent.setCourseId(number);
			courseStudent.setStudentId(id);
		}

		return courseStudent;

	}

}
