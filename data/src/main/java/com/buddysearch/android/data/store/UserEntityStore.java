package com.buddysearch.android.data.store;

import com.buddysearch.android.data.entity.UserEntity;
import com.buddysearch.android.library.data.store.EntityStore;

import java.util.List;

import rx.Observable;

public interface UserEntityStore extends EntityStore {

    Observable<String> createUser(UserEntity userEntity);

    Observable<List<UserEntity>> getUsers();

    Observable<UserEntity> getUser(String userId);
}