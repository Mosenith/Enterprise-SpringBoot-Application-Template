package com.projecttemplate.template1.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projecttemplate.template1.Dao.DataAccess.DataLayer.Dao;
import com.projecttemplate.template1.Dao.DataAccess.DataLayer.IUserDao;
import com.projecttemplate.template1.Dao.Model.User;


@RestController
@RequestMapping("/user")
public class UserController {
    private IUserDao _userDao;

    public UserController() {
        this._userDao = Dao.factory.GetUserDao();
        //this._userDao = new SqlServerUserDao();
    }
 
    /* api call =>  http://localhost:8080/user/1 */
    @GetMapping("/{userid}")
    public String getUserName(@PathVariable int userid) {
        // Call GetUser function
        User urs = this._userDao.getUser(userid);

        return urs.UserName;
    }

    /* api call => 
          valid username and password: http://localhost:8080/user/johncena/cenapassword
          invalid password http://localhost:8080/user/johncena/invalidpassword */

    @GetMapping("/{username}/{password}")
    public ResponseEntity Login(@PathVariable String username,
                                @PathVariable String password) {
 
        // create a new user object
        User urs = new User(username, password);

        // validate user name and password
        boolean isUserValid = urs.validate();

        if (!isUserValid) {
            // return all validation error messages
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(String.join(", ", urs.getValidationErrors()));
        }
 
        if (this._userDao.Login(username, password)) {
            return ResponseEntity.ok("Login successful.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid user name and/or password.");
        }
    }
}