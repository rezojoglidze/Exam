package com.example.demo.storage.ftpstorage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("ftp_storage")
public class FTPConnectionFactory {

  public Object getInstance() {
    return null;
  }
}
