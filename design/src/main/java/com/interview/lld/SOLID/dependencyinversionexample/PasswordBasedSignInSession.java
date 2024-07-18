package com.interview.lld.SOLID.dependencyinversionexample;

class PasswordBasedSignInSession implements SignInSession{
    @Override
    public void signIn() {
        // client will sign in using username and password.
    }
}
