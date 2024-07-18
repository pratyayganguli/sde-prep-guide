package com.interview.lld.SOLID;

class LiskovDemo {

    /**
     *
     * Here we have two things to do.
     * 1. Save the plain user data.
     * 2. Save the encrypted user data too.
     */

    void execute(User user) {
        UserDAO userDAO = new UserDAOImpl();
        userDAO.save(user);
        UserDAO encUserDAO = new EncryptedUserDAOImpl();
        encUserDAO.save(user);
    }
}
