package com.joseph.california.domain;

import com.joseph.california.domain.Account;
import com.joseph.california.domain.Club;
import com.joseph.california.domain.Contact;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-21T18:47:20")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Long> id;
    public static volatile ListAttribute<Person, Account> accounts;
    public static volatile SingularAttribute<Person, String> email;
    public static volatile SingularAttribute<Person, Integer> age;
    public static volatile SingularAttribute<Person, String> lastname;
    public static volatile SingularAttribute<Person, String> firstname;
    public static volatile SingularAttribute<Person, Contact> contact;
    public static volatile ListAttribute<Person, Club> clubs;

}