package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    private static final int LIMIT = 3;

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetUsers() {
        List<User> result = apiService.getUsers(LIMIT);
        assertEquals(LIMIT+1, result.size());
    }
}