// Copyright (c) 2014 Erick Bourgeois, All Rights Reserved

package ca.jeb.gpb.datamodel;

import ca.jeb.common.gpb.ProtoBufAttribute;
import ca.jeb.common.gpb.ProtoBufEntity;

/**
 * POJO representing an Person
 * 
 * @author <a href="mailto:erick@jeb.ca">Erick Bourgeois</a>
 */
@ProtoBufEntity(ca.jeb.generated.proto.Message.Person.class)
public class Person
{
  @ProtoBufAttribute
  private String  name;

  @ProtoBufAttribute
  private Integer age;

  @ProtoBufAttribute
  private Address address;

  /**
   * @param name the name to set
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * @param age the age to set
   */
  public void setAge(Integer age)
  {
    this.age = age;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(Address address)
  {
    this.address = address;
  }

  /**
   * @return the name
   */
  public String getName()
  {
    return name;
  }

  /**
   * @return the age
   */
  public Integer getAge()
  {
    return age;
  }

  /**
   * @return the address
   */
  public Address getAddress()
  {
    return address;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
  }
}