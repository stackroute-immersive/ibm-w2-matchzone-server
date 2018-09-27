package com.stackroute.matchzone.controller.test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.matchzone.controller.UserController;
import com.stackroute.matchzone.exceptions.UserAlreadyExistsException;
import com.stackroute.matchzone.exceptions.UserNotFoundException;
import com.stackroute.matchzone.model.User;
import com.stackroute.matchzone.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest
public class UserControllerTest {

	

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private User user;
    @MockBean
    private UserService userService;
    @InjectMocks
    private UserController userController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        user = new User();
        user.setUserName("Jhon Simon");
        user.setUserPassword("123456");
        user.setUserEmail("jhonsimon@gmail.com");
    }

        @Test
        public void registerUserSuccess() throws UserAlreadyExistsException, UserNotFoundException {

            when(userService.createUser(user)).thenReturn(true);
            assertNotNull(userService.getUser("Jhon Simon"));
            try {
				mockMvc.perform(post("/api/v1/user")
				        .contentType(MediaType.APPLICATION_JSON).content(asJsonString(user)))
				        .andExpect(status().isCreated()).andDo(MockMvcResultHandlers.print());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }

        @Test
        public void registerUserFailure() throws UserAlreadyExistsException, UserNotFoundException {

            when(userService.createUser(any())).thenThrow(UserAlreadyExistsException.class);
            assertNotNull(userService.getUser("Jhon Simon"));
            try {
				mockMvc.perform(post("/api/v1/user")
				        .contentType(MediaType.APPLICATION_JSON).content(asJsonString(user)))
				        .andExpect(status().isConflict()).andDo(MockMvcResultHandlers.print());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
        @Test
        public void updateUserSuccess() throws UserNotFoundException {
            user.setUserPassword("23456789");
            assertNotNull(userService.getUser("Jhon Simon"));
            when(userService.updateUser(eq(user.getUserEmail()), any())).thenReturn(user);
            try {
				mockMvc.perform(put("/api/v1/user/Jhon123")
				        .contentType(MediaType.APPLICATION_JSON).content(asJsonString(user)))
				        .andExpect(status().isOk()).andDo(MockMvcResultHandlers.print());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }

        @Test
        public void updateUserFailure() throws UserNotFoundException {
                user.setUserPassword("23456789");
                assertNotNull(userService.getUser("Jhon Simon"));
                when(userService.updateUser(eq(user.getUserEmail()), any())).thenThrow(UserNotFoundException.class);
                try {
					mockMvc.perform(put("/api/v1/user/Jhon123")
					        .contentType(MediaType.APPLICATION_JSON).content(asJsonString(user)))
					        .andExpect(status().isOk()).andDo(MockMvcResultHandlers.print());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

        }
        @Test
        public void deleteUserSuccess() throws UserNotFoundException {
            when(userService.deleteUser("Jhon123")).thenReturn(true);
            assertNotNull(userService.getUser("Jhon Simon"));
            try {
				mockMvc.perform(delete("/api/v1/user/Jhon123")
				        .contentType(MediaType.APPLICATION_JSON))
				        .andExpect(status().isOk())
				        .andDo(MockMvcResultHandlers.print());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }


        @Test
        public void deleteUserFailure() throws UserNotFoundException {
            when(userService.deleteUser("Jhon123")).thenThrow(UserNotFoundException.class);
            assertNotNull(userService.getUser("Jhon Simon"));
            try {
				mockMvc.perform(delete("/api/v1/user/Jhon123")
				        .contentType(MediaType.APPLICATION_JSON))
				        .andExpect(status().isNotFound())
				        .andDo(MockMvcResultHandlers.print());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
        @Test
        public void getByUserIdSuccess() throws UserNotFoundException {

            when(userService.getUser("Jhon123")).thenReturn(user);
            assertNotNull(userService.getUser("Jhon Simon"));
            try {
				mockMvc.perform(get("/api/v1/user/Jhon123").contentType(MediaType.APPLICATION_JSON))
				        .andExpect(status().isOk())
				        .andDo(MockMvcResultHandlers.print());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        @Test
        public void getByUserIdFAilure() throws UserNotFoundException {

            when(userService.getUser("Jhon123")).thenThrow(UserNotFoundException.class);
            assertNotNull(userService.getUser("Jhon Simon"));
            try {
				mockMvc.perform(get("/api/v1/user/Jhon123").contentType(MediaType.APPLICATION_JSON))
				        .andExpect(status().isNotFound())
				        .andDo(MockMvcResultHandlers.print());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }


        public static String asJsonString(final Object obj) {
            try {
                return new ObjectMapper().writeValueAsString(obj);
            } catch (Exception e) {
            	return e.getMessage();
            }
        }

}
