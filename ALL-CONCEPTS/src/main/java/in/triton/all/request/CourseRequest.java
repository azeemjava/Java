package in.triton.all.request;

import java.util.List;

import org.springframework.stereotype.Component;

import in.triton.all.entity.Course;
import lombok.Data;

@Data
public class CourseRequest {

  private List<Course> courses;
	
}
