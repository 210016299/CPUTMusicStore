package com.joseph.california.domain;

import com.joseph.california.domain.Account;
import com.joseph.california.domain.Contact;
import com.joseph.california.domain.Horse;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-21T18:47:20")
@StaticMetamodel(Owner.class)
public class Owner_ { 

    public static volatile SingularAttribute<Owner, Long> id;
    public static volatile SingularAttribute<Owner, String> sex;
    public static volatile ListAttribute<Owner, Account> accounts;
    public static volatile SingularAttribute<Owner, String> email;
    public static volatile SingularAttribute<Owner, Integer> age;
    public static volatile ListAttribute<Owner, Horse> horse;
    public static volatile SingularAttribute<Owner, String> lastname;
    public static volatile SingularAttribute<Owner, String> firstname;
    public static volatile SingularAttribute<Owner, Contact> contact;

}