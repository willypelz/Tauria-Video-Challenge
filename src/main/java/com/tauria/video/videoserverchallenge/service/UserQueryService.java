package com.tauria.video.videoserverchallenge.service;

import com.tauria.video.videoserverchallenge.model.persistence.domain.User;
import java.util.List;

public interface UserQueryService {

  List<User> getAll();

  User getById(String id);

  List<User> findAllByIds(List<String> ids);
}
