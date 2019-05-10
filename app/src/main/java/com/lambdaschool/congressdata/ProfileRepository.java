package com.lambdaschool.congressdata;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.graphics.Bitmap;
import android.util.Log;

import com.lambdaschool.congressdataapiaccess.CongressDao;

public class ProfileRepository {
    public static LiveData<CongresspersonProfile> getProfile(final String id) {
        Log.i("Repository", "Retreiving Data");
        final MutableLiveData<CongresspersonProfile> profileLiveData = new MutableLiveData<>();

        CongresspersonProfile profile = new CongresspersonProfile(CongressDao.getMemberDetails(id));
//        profile.setImage(CongressDao.getImage(profile.getId()));
        profileLiveData.setValue(profile);

        return profileLiveData;
    }
    public static LiveData<Bitmap> getImage (final String id){
        final MutableLiveData<Bitmap> imageLiveData = new MutableLiveData<>();

        Bitmap image = CongressDao.getImage(id);

        imageLiveData.setValue(image);

        return imageLiveData;
    }
}
