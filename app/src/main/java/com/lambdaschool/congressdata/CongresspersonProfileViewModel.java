package com.lambdaschool.congressdata;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.graphics.Bitmap;

public class CongresspersonProfileViewModel extends ViewModel {
    private LiveData<CongresspersonProfile> profile;
    private LiveData<Bitmap> profileImage;
    private String                          id;

    public void init(String id) {
        this.id = id;
    }

    public LiveData<CongresspersonProfile> getProfile() {
        if (profile == null) {
            loadProfile();
        }
        return profile;
    }
    public LiveData<Bitmap> getProfileImage(){
        if(profileImage == null){
            loadProfileImage();
        }
        return profileImage;
    }

    private void loadProfile() {
        profile = ProfileRepository.getProfile(id);
    }

    private void loadProfileImage(){ profileImage = ProfileRepository.getImage(id);}
}
