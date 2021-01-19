package com.dsh.thingkinginjava.annotation;

import java.util.List;

/**
 * @author dongshuhuan
 * date 2020-01-20
 * version
 */
public class PasswordUtils {

    @UseCase(id=47,description = "Password must contain at least one numeric")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d*\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id=49,description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords,String password){
        return !prevPasswords.contains(password);
    }

}
