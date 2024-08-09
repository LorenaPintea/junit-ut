package springboot.junitut.stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @Test
    void testFindTotal() {
        StudentService studentService = new StudentService(new StudentDaoStub());
        int total = studentService.findTotal();
    }
}