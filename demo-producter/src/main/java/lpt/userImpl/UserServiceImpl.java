package lpt.userImpl;

import lpt.user.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String name) {
        return "producterValue:"+name;
    }
}
