package com.interview.lld.SOLID.dependencyinversionexample;

/**
 *
 * Dependency inversion
 * depend on interfaces rather than concrete classes.
 */
class DemoApp {

    // we are not taking the concrete classes rather we are doing constructor injection
    // by passing the object of the interface

    private final SignUpSession signUpSession;
    private final SignInSession signInSession;

    public DemoApp(SignUpSession signUpSession, SignInSession signInSession) {
        this.signUpSession = signUpSession;
        this.signInSession = signInSession;
    }

    void signUp() {
        signUpSession.signUp();
    }

    void signIn() {
        signInSession.signIn();
    }

    // here we are trying to sign up and sign in inside the app using third party authentication.

    DemoApp demoApp = new DemoApp(new OauthSignUpSession(), new OauthSignInSession());
}


