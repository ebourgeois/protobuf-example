// Copyright (c) 2014 Erick Bourgeois, All Rights Reserved

package ca.jeb.gpb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.jeb.generated.proto.Message.Address;
import ca.jeb.generated.proto.Message.Person;

/**
 * @author <a href="mailto:erick@jeb.ca">Erick Bourgeois</a>
 */
public class GPBPersonExample
{
  private static final Logger LOGGER = LoggerFactory.getLogger(GPBPersonExample.class);

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    // 1. Setup the persons address
    LOGGER.info("Creating new Address object...");
    final Address address = Address.newBuilder().setStreet("1 Main Street").setCity("Foo Ville").setCountry("Canada")
            .setPostalCode("J0J 1H1").build();
    LOGGER.debug("address: " + address);

    // 2. Now setup the Person and assign the above address to them.
    LOGGER.info("Creating new Person object...");
    final Person person = Person.newBuilder().setName("Erick").setAge(22).setAddress(address).build();
    LOGGER.debug("person: " + person);
  }
}