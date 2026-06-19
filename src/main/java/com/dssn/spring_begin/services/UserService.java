package com.dssn.spring_begin.services;
import java.util.*;

import org.springframework.stereotype.Service;

import com.dssn.spring_begin.model.Users;
@Service
public class UserService {

    private List<Users> allUser;
    private int curId;
    public UserService() {

        allUser=new ArrayList<>();
        allUser.add(new Users(1,"JohnDoe","male",22,"/images/john.png" ));
        allUser.add(new Users(2,"JaneDoe","Female",22,"/images/jane.png" ));
      
        // initialize curId to one greater than current max id
        int maxId = 0;
        for (Users u : allUser) {
            if (u.getId() > maxId) {
                maxId = u.getId();
            }
        }
        curId = maxId + 1;
    }
    public List<Users> getAllUser(){
        return allUser;
    }
    public Users getUserById(int id){
        for (int i=0;i<allUser.size();i++){
                if(allUser.get(i).getId()==id)
                    return allUser.get(i);

        }
        return null;

    }
    public Users addNewUser(Users user){
        user.setId(curId++);
        allUser.add(user);
        return user;
        
    }
    
}
