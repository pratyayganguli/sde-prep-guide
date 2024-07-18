package com.interview.lld.SOLID.dependencyinversionexample;

class PasswordBasedSignUpSession implements SignUpSession {
    @Override
    public void signUp() {
        // you will be required to create a username and then a password for this signup session.
    }
}
