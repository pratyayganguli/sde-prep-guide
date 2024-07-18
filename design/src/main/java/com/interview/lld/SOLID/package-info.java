package com.interview.lld.SOLID;

/**
 * 
 * <p>
 *     SOLID principles
 *
 *     Single Responsibility Principle: A class should have one responsibility to change.
 *     In our example, User class should have only reason to be modified and should have only one responsibility
 *     to exist.
 *     Here if only the properties of the user are changed then only the User class will be changed.
 *
 *     Open/Closed principle: Open for extension but closed for modification.
 *     Let's understand that with a simple example.
 *     Suppose you have a class User which resembles the data you are collecting from the client and then you have a
 *     task of saving that data into a MySQL database and for that reason you have a class called UserDAO.
 *     Now, the requirement has changed the data that you are storing needs to be encrypted before storing it in the
 *     database and for that reason you need to make some changes in the UserDAO class which is already there in the
 *     production code base.
 *
 *     Solution:
 *     Extend the existing class create a new class for meeting the requirement but that cannot be considered
 *     as a fully fledged solution, the best way to do that will be to create an interface called UserData and have
 *     a method called save. Both the classes EncryptedUserDAOImpl and UserDAOImpl will implement UserDAO.
 *
 *     Liskov substitution principle:
 *     If class A is a sub class of class B, then we can replace the object of A with B without breaking the behaviour.
 *     It should expand the capability of the parent and should not narrow it down.
 *     let's understand with an example mentioned in the LiskovDemo class.
 *
 *     Interface segmentation principle:
 *     Interface should be such that, the client should not implement unnecessary functions which they do not need.
 *     For example, let's consider the UserDAO interface has two functions/methods
 *     1. encrypting the data.
 *     2. storing the data in the database.
 *     Now, it will be convenient for people who are working with the EncryptedUserDAOImpl class, because they now have
 *     two separate methods. But, UserDAOImpl class will have an extra unnecessary method which is of no use as we are
 *     storing the data in plain text format.
 *
 *     Dependency Inversion principle: A class should depend on interfaces rather than concrete classes.
 *     Please refer to the dependency-inversion-example package to understand better.
 * </p>
 */