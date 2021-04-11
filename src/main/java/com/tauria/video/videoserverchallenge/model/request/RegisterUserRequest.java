package com.tauria.video.videoserverchallenge.model.request;

import lombok.Getter;

@Getter
public class RegisterUserRequest {
  private String firstName;
  private String lastName;
  private String username;
  private String password;
}
