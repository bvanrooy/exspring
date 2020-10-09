package be.abis.exercise.service;

import java.util.List;

import be.abis.exercise.model.Course;

public interface CourseService {

	public List<Course> findAllCourses();
	public Course findCourse(int id);
	public Course findCourse(String shortTitle);
}
