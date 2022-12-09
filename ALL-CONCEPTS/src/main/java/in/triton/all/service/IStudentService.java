package in.triton.all.service;

import in.triton.all.api.response.ApiResponse;
import in.triton.all.request.CourseRequest;
import in.triton.all.request.StudentRequest;
import jakarta.validation.Valid;

public interface IStudentService {
	
	public ApiResponse saveAll(StudentRequest studentRequest)  ;

	public ApiResponse getAll();

	public ApiResponse getOne(int id);

	public ApiResponse update(@Valid StudentRequest studentRequest, int id);

	public ApiResponse delete(int id);

	public ApiResponse deleteAll();

	public ApiResponse saveAll(@Valid CourseRequest courseRequest, int id);


}
