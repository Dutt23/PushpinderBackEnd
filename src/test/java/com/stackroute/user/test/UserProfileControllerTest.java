package com.stackroute.user.test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.maverick.controller.UserController;
import com.stackroute.maverick.domain.User;
import com.stackroute.maverick.service.UserService;


@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserProfileControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Mock
	User mockUser;

	@MockBean
	UserService userService;

	@InjectMocks
	private UserController userController;

	@Before
	public void setup() {

		MockitoAnnotations.initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

		mockUser = new User();

		mockUser.setUserId(5);
		mockUser.setUserName("acaec");
		 mockUser.setPassword("qq");
		 mockUser.setEmail("qq");
		mockUser.setAge(2);
		mockUser.setMobile(999999999);
		mockUser.setRole("User");
		mockUser.setImage("hello");
		mockUser.setCoverImage("hello");
		mockUser.setGender("hello");
		mockUser.setLocation("hello");
		mockUser.setLevel(3);
		mockUser.setLevelName("hello");
		mockUser.setAboutMe("hello");
		mockUser.setStatus("hello");
		mockUser.setGameCount(4);

	}

	
	
	
	// @Test
	// public void testDeleteUser() throws Exception {
	//
	// when(userService.deleteUser(mockUser)).thenReturn(mockUser);
	//
	// mockMvc.perform(delete("/api/v1/deleteUser/5")
	//
	// .contentType(MediaType.APPLICATION_JSON)
	//
	// .content(asJsonString(mockUser)))
	//
	// .andExpect(status().isOk());
	// verify(userService, times(2)).deleteUser(mockUser);
	//
	// }

	// @Test
	// public void testUpdateuser() throws Exception {
	//
	// when(userService.updateUserData(mockUser.getUserId(), restaurant))
	// }

	@Test
	public void testGetUserByID() throws Exception {

		when(userService.getUser(mockUser.getUserId())).thenReturn(mockUser);
		mockMvc.perform(
				get("/api/v1/getUser/5").contentType(MediaType.APPLICATION_JSON).content(asJsonString(mockUser)))
				.andExpect(status().isOk());
		verify(userService, times(2)).getUser(5);

	}

//	@Test
//
//	public void testUpdateUser() throws Exception {
//
//		User updateUser = new User(1, 20, "PsTheJohn",
//				"https://image.freepik.com/free-icon/male-user-profile-picture_318-37825.jpg",
//				"http://www.webgranth.com/wp-content/uploads/2013/11/computer-Game-Desktop-Wallpaper2.jpg", "Male",
//				"482- Forum Mall, near about here, Koramangala, Bangalore, PIN - 560059", 72, "Vertis", "I Am Good",
//				"Online", 1);
//
//		when(userService.updateUserData(1, mockUser)).thenReturn(mockUser.contentType(MediaType.APPLICATION_JSON)
//
//				.content(asJsonString(updateUser)))
//
//				.andExpect(status().isOk());
//		// verify(resturantService,
//		// times(1)).addRestaurant(Mockito.any(Restaurant.class));
//
//	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
