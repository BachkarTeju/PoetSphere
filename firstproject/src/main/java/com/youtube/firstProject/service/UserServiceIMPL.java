package com.youtube.firstProject.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.youtube.firstProject.model.User;
import com.youtube.firstProject.repository.RegistrationRep;
import com.youtube.firstProject.service.UserServiceIMPL;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    RegistrationRep obj;

    @Override
    public User addUser(User user) {
     User a=obj.save(user);
     return a;
    }

    @Override
public void deleteUser(int id) {
    obj.deleteById(id);
}
@Override
        public List<User> getAllSignup() {
                return obj.findAll ();
        }

// @Override
// public Optional<User> getuserData(int id) {
  
//     throw new UnsupportedOperationException("Unimplemented method 'getuserData'");
// }
       
       
       
        //@Override
        // public User updateUserByEmail(String email,User updatedUser) {
        //  User existingUser=obj.findByEmail(email);
        //  if(existingUser !=null)
        //  {
        //     existingUser.setName(updatedUser.getName());
        //     existingUser.setPassword(updatedUser.getPassword());
        //     existingUser.setContact(updatedUser.getContact());
        //     return obj.save(existingUser);
        //  }
        //  return null;

        // }
        // public User updateUserByEmail(int userid)
        // {
        //     return null;
        // }

}

