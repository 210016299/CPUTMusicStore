package com.joseph.california.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-21T18:47:20")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Long> id;
    public static volatile SingularAttribute<Account, BigDecimal> balance;
    public static volatile SingularAttribute<Account, String> name;

}