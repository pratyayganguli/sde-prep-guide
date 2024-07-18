package com.interview.lld.SOLID.dependencyinversionexample;

class OauthSignUpSession implements SignUpSession {
    @Override
    public void signUp() {
        // signing up using a third party authentication
    }
}
