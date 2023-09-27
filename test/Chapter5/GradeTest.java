package Chapter5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test

    public void testGradeA(){
        StudentGradeTest grade = new StudentGradeTest();
        grade.setGrade("A");
        assertEquals("A",grade.getGrade());
    }

}