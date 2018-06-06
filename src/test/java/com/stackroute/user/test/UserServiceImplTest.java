package com.stackroute.user.test;
//package com.stackroute.user;
//
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//
//import com.stackroute.user.domain.User;
//import com.stackroute.user.repository.UserRepository;
//import com.stackroute.user.service.UserServiceImpl;
//
//public class UserServiceImplTest {
//    
//    @Mock
//    UserRepository userRepository;
//    
//    @InjectMocks
//    private UserServiceImpl userService;
//    
//    @Before
//    public void setup(){
//        MockitoAnnotations.initMocks(this);
//    }
//    
//    @Test
//    public void testAddUser() throws Exception {
//        
//        User mockUser = new User(4,"quizine", "imageURL","bangalore");
//        
//        Mockito.when(userRepository.save(mockUser))
//                .thenReturn(mockUser);
//        User result = userService.addUser(mockUser);
//        assertEquals(4, result.getId());
//        assertEquals("quizine", result.getName());
//        assertEquals("imageURL", result.getImage());
//        assertEquals("bangalore", result.getLocation());      
//    }
//    
//    @Test
//    public void testShowAllUsers() {
//        
//    User mockUser = new User(4,"teetam", "imageURLTeetam","bangalore");
//    User mockUser1 = new User(5, "hughh", "imageURLHugh", "Delhi");
//    
//    List<User> userList = new ArrayList<>();
//    userList.add(mockUser);
//    userList.add(mockUser1);
//    
//    Iterable<User> itr = userList;
//    
//    Mockito.when(userRepository.findAll())
//            .thenReturn((List<User>) itr);
//    Iterable<User> result = userService.getAllUsers();
//    
//    assertEquals(2, ((List<User>) result).size());
//    }
//    
//    @Test
//    public void testFindUserById() {
//        
//        User mockUser = new User(4,"teetam", "imageURLTeetam","bangalore");
//        Optional<User> optional = Optional.of(mockUser);
//        
//        Mockito.when(userRepository.findById(4))
//                .thenReturn(optional);
//        
//        Optional<User> result = userService.findUserById(4);
//    
//        assertEquals(4, result.get().getId());
//        
//    }
//    
//    @Test
//    public void testUpdateuserById() {
//        
//        User mockUser = new User(7, 20, "Psthejohn", "image", "cover", "gender", "location", 69,
//				"levelName", "aboutMe", "status", 8, null);
//        //User mockUser1 = new User(4,"teetam1", "imageURLTeetam1","bangalore1");
//        
//        Mockito.when(userRepository.save(mockUser))
//            .thenReturn(mockUser);
//        User result = userService.updateUserById(mockUser);
//        assertEquals(mockUser, result);
//    }
//    
//    
//    @Test
//    public void testDeletebyId() {
//        
//        //User mockUser = new User(4,"teetam", "imageURLTeetam","bangalore");
//        Mockito.doNothing().when(userRepository).deleteById(4);
//        userService.deleteUserById(4);
//        verify(userRepository, times(1)).deleteById(4);
//    }
//}
