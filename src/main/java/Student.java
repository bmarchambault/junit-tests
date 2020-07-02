import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private List<Integer> grades;
    public Student() {
    }

    public Student( long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade){
        grades.add(grade);
}


    public double gradeAverage() {
    double sum = 0;
    for(Integer grade : grades){
        sum += grade;
    }
    return sum/grades.size();
    }

    public void updateGrade( int gradeIndex, int newGrade ){

           grades.set(gradeIndex, newGrade);

        }


        public void removeGrade(int gradeIndex){
        grades.remove(gradeIndex);
        };

//committing to student branch
}