package model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-23T23:25:05")
@StaticMetamodel(OnTransit.class)
public class OnTransit_ { 

    public static volatile SingularAttribute<OnTransit, Integer> id;
    public static volatile SingularAttribute<OnTransit, Integer> amount;
    public static volatile SingularAttribute<OnTransit, String> zip;
    public static volatile SingularAttribute<OnTransit, BigInteger> date;
    public static volatile SingularAttribute<OnTransit, String> type;

}