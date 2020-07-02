import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class StudentTest {
//    private long id;
//    private String name;
//    private List<Integer> grades;
// Student student;
//    public long random = (long) (Math.random() * 200000);
    public long testID = 12345;
    Student mike = new Student(123456, "Mike");


    @Before
    public void objectSetup(){
//        this.name = "Mike";
//        this.id = random;
//        this.grades = new ArrayList<>();
        mike.addGrade(78);
        mike.addGrade(28);
        mike.addGrade(100);
    }
//    long random1 = (long) (Math.random() * 200000);
    @Test
    public void testProperties(){

        Student student = new Student(testID, "John");
        assertEquals(testID, student.getId());
        assertEquals("John", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
public void testSettersAndGetters(){
//        Student mike = new Student();
//        mike.setName("Mike");
//        mike.setGrades(new ArrayList<>());
//        mike.setId(random);
        assertSame("Mike", mike.getName());
        assertEquals(123456, mike.getId());
        assertNotNull(mike.getGrades());
    }
    @Test
    public void testAddGrade(){
        assertEquals(3, mike.getGrades().size());//check expected initial size first:
        mike.addGrade(80);//you should have it red first, then write the code to make red go away. (method definition with empty code)
        assertEquals(4, mike.getGrades().size());//this test should initially fail if your method is empty.  wrtie code to pass.

    }

    @Test
    public void testGradeAverage(){
       double mikesGradeAve = mike.gradeAverage();
       assertEquals(68.67, mikesGradeAve, .1);

    }
    @Test
    public void testUpdateGrade(){
//       mike.getGrades();
       mike.updateGrade(0, 75);
        assertEquals(75,  75, 0);
    }
    @Test
    public void testRemoveGrade(){
//        mike.getGrades();
        mike.removeGrade(0);
        assertEquals(0, 0,0);
    }

}//any reference of the this keyword will refer to the class (StudentTest) not the object (Student)



