package com.interview.lld.SOLID.dependencyinversionexample;

class OTPSignInSession implements SignInSession{
    @Override
    public void signIn() {
        // client will sign in using the otp
    }
}
