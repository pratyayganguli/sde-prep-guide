package com.interview.lld.SOLID.dependencyinversionexample;

class OauthSignInSession implements SignInSession {
    @Override
    public void signIn() {
        // client will sign in using third party authentication
    }
}
