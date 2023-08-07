package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.AppUser;
import com.db.grad.javaapi.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppUserHandler implements IAppUserService {

    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserHandler(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public AppUser saveAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }


    @Override
    public AppUser getAppUserById(Integer userId) {
        return appUserRepository.findById(userId).orElse(null);
    }
    @Override
    public List<AppUser> getAllAppUsers() {
        return appUserRepository.findAll();
    }
    @Override
    public void deleteAppUser(Integer userId) {
        appUserRepository.deleteById(userId);
    }

    public boolean checkIfEmailAlreadyExist(String currentUser){

        List<AppUser> all = appUserRepository.findAll();

        if(all.isEmpty())
            return true;

            for (AppUser user : all) {
                if (user.getUser_email_address().equals(currentUser)) {
                    return true;
                }
            }
        return false;
    }


}
