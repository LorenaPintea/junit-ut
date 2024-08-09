package springboot.junitut.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock
    StudentDao studentDaoMock;

    @InjectMocks
    StudentService studentService;

    @Test
    void testFindTotal() {
        when(studentDaoMock.getMarks()).thenReturn(new int[]{1,2,3,4,5,6,7,8,9});
        assertEquals(45, studentService.findTotal());
    }

}