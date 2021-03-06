package be.abis.exercise;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;

import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import be.abis.exercise.service.CourseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbisCourseServiceTest {

	@Autowired
	CourseService courseService;
	
	@Test
	public void findCourseByIdShouldFindTitle() {
		assertThat(courseService.findCourse(7900),is(IsNull.notNullValue()));
	}
	
	@Test
	public void checkThatPricePerDayOfCourse7900isHigherThan400() {
		assertThat(courseService.findCourse(7900).getPricePerDay(), is(greaterThan(400.0)));
	}
	
}
