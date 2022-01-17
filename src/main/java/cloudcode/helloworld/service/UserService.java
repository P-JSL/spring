package cloudcode.helloworld.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import cloudcode.helloworld.vo.User;

public interface UserService {

    List<User> getUsers() throws ExecutionException, InterruptedException;

}