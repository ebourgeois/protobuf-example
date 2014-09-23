// Copyright (c) 2014 Erick Bourgeois, All Rights Reserved

package ca.jeb.gpb.datamodel;

import ca.jeb.common.gpb.ProtoBufAttribute;
import ca.jeb.common.gpb.ProtoBufEntity;

/**
 * POJO representing an Address
 * 
 * @author <a href="mailto:erick@jeb.ca">Erick Bourgeois</a>
 */
@ProtoBufEntity(ca.jeb.generated.proto.Message.Address.class)
public class Address
{
  @ProtoBufAttribute
  private String street;

  @ProtoBufAttribute
  private String city;

  @ProtoBufAttribute
  private String stateOrProvince;

  @ProtoBufAttribute
  private String country;

  @ProtoBufAttribute
  private String postalCode;

  /**
   * @param street the street to set
   */
  public void setStreet(String street)
  {
    this.street = street;
  }

  /**
   * @param city the city to set
   */
  public void setCity(String city)
  {
    this.city = city;
  }

  /**
   * @param stateOrProvince the stateOrProvince to set
   */
  public void setStateOrProvince(String stateOrProvince)
  {
    this.stateOrProvince = stateOrProvince;
  }

  /**
   * @param country the country to set
   */
  public void setCountry(String country)
  {
    this.country = country;
  }

  /**
   * @param postalCode the postalCode to set
   */
  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  /**
   * @return the street
   */
  public String getStreet()
  {
    return street;
  }

  /**
   * @return the city
   */
  public String getCity()
  {
    return city;
  }

  /**
   * @return the stateOrProvince
   */
  public String getStateOrProvince()
  {
    return stateOrProvince;
  }

  /**
   * @return the country
   */
  public String getCountry()
  {
    return country;
  }

  /**
   * @return the postalCode
   */
  public String getPostalCode()
  {
    return postalCode;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Address [street=" + street + ", city=" + city + ", stateOrProvince=" + stateOrProvince + ", country=" + country
            + ", postalCode=" + postalCode + "]";
  }
}