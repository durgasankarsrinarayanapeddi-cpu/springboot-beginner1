package com.dssn.spring_begin.services;
import java.util.*;

import org.springframework.stereotype.Service;

import com.dssn.spring_begin.model.Users;
@Service
public class UserService {

    private Map<Integer, Users> userMap;
    private int curId;
    
    public UserService() {
        userMap = new HashMap<>();
        
        // Add initial users
        userMap.put(1, new Users(1, "JohnDoe", "male", 22, "/images/john.png"));
        userMap.put(2, new Users(2, "JaneDoe", "Female", 22, "/images/jane.png"));
      
        // Initialize curId to one greater than current max id
        int maxId = 0;
        for (Integer id : userMap.keySet()) {
            if (id > maxId) {
                maxId = id;
            }
        }
        curId = maxId + 1;
    }
    
    public List<Users> getAllUser(){
        // Convert HashMap values to List
        return new ArrayList<>(userMap.values());
    }
    
    public Users getUserById(int id){
        // O(1) lookup instead of O(n)
        return userMap.get(id);
    }
    
    public Users addNewUser(Users user){
        user.setId(curId);
        userMap.put(curId, user);
        curId++;
        return user;
    }
    
    public Users randomUser(){
        // Get all user IDs
        List<Integer> ids = new ArrayList<>(userMap.keySet());
        int size = ids.size();
        int randomIndex = (int)(Math.random() * size);
        int randomId = ids.get(randomIndex);
        return userMap.get(randomId);
    }
    
}
//old code
// package com.dssn.spring_begin.services;
// import java.util.*;

// import org.springframework.stereotype.Service;

// import com.dssn.spring_begin.model.Users;
// @Service
// public class UserService {

//     private List<Users> allUser;
//     private int curId;
//     public UserService() {

//         allUser=new ArrayList<>();
//         allUser.add(new Users(1,"JohnDoe","male",22,"/images/john.png" ));
//         allUser.add(new Users(2,"JaneDoe","Female",22,"/images/jane.png" ));
      
//         // initialize curId to one greater than current max id
//         int maxId = 0;
//         for (Users u : allUser) {
//             if (u.getId() > maxId) {
//                 maxId = u.getId();
//             }
//         }
//         curId = maxId + 1;
//     }
//     public List<Users> getAllUser(){
//         return allUser;
//     }
//     public Users getUserById(int id){
//         for (int i=0;i<allUser.size();i++){
//                 if(allUser.get(i).getId()==id)
//                     return allUser.get(i);

//         }
//         return null;

//     }
//     public Users addNewUser(Users user){
//         user.setId(curId++);
//         allUser.add(user);
//         return user;
        
//     }
//     public Users randomUser(){
//         int size=allUser.size();
//         int randomid=(int)((Math.random()*size));
//         return allUser.get(randomid);
        
//     }
    
// }
