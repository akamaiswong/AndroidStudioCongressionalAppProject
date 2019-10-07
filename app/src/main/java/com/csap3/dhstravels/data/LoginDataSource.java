package com.csap3.dhstravels.data;

import com.csap3.dhstravels.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser user1 = new LoggedInUser(java.util.UUID.randomUUID().toString(), username, username);
            return new Result.Success<>(user1);
        }
            catch (Exception e){
                return new Result.Error (new IOException("Error logging in", e));
            }
    }


    public void logout() {
        // TODO: revoke authentication
    }
}
