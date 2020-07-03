import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    private List<Student> students;
    Cohort trinity = new Cohort();

    @Before
    public void objectSetup() {
     Student helen = new Student(11111, "Helen");
        Student roger = new Student(99999, "Roger");
        trinity.addStudent(helen);
        trinity.addStudent(roger);
        helen.addGrade(90);
        helen.addGrade(89);
        roger.addGrade(75);
        roger.addGrade(98);
    }

    @Test
//	A Cohort instance can add a Student to the List of students.
    public void testAddStudent() {
//        Student helen = new Student(11111, "Helen");
//        Student roger = new Student(99999, "Roger");
//        trinity.addStudent(helen);
//        trinity.addStudent(roger);
//        helen.addGrade(90);
//        helen.addGrade(89);
//        roger.addGrade(75);
//        roger.addGrade(98);
        assertEquals(2, trinity.getStudents().size());
    }

    @Test
//	A Cohort instance can get the current List of students.
    public void testGetStudents() {
//        Student helen = new Student(11111, "Helen");
//        Student roger = new Student(99999, "Roger");
//        trinity.addStudent(helen);
//        trinity.addStudent(roger);
        assertNotNull(trinity.getStudents());
    }

    @Test
//	A Cohort instance can get the average and it's being calculated correctly.
    public void testGetCohortAverage() {
//        Student.helen.addGrade(90);
//        trinity.helen.addGrade(90);
//        helen.addGrade(90);
//        students.helen.addGrade
        trinity.getCohortAverage();
        assertEquals(88,trinity.getCohortAverage(), 0);
    }


}