package com.csap3.dhstravels.data;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.csap3.dhstravels.Schedule;
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

    private class HomeActivity extends AppCompatActivity {
        public void onClick() {
            Intent i = new Intent(this, Schedule.class);
            startActivity(i);
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
