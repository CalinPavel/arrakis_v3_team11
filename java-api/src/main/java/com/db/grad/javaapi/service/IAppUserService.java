package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.AppUser;

import java.util.List;

public interface IAppUserService {

    public AppUser saveAppUser(AppUser appUser);
    public AppUser getAppUserById(Integer userId);
    public List<AppUser> getAllAppUsers();
    public void deleteAppUser(Integer userId);
}
