package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
//	public CourseServiceImpl() {
//		
////		list = new ArrayList<> ();
////		
////		list.add(new Course(324, "Java Core", "Java Programming Language"));
////		list.add(new Course(123, "Spring Boot", "Web Dev Using Spring Boot"));
//	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
//		// TODO Auto-generated method stub
//		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		return courseDao.getOne(courseId);
		
//		Course c = null;
//		
//		for(Course course : list) {
//			
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		
//		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		courseDao.save(course);
		return course;
		
//		list.add(course);
//		
//		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		 Course ent = courseDao.getOne(parseLong);
		 
		 courseDao.delete(ent);
		
	}

}
