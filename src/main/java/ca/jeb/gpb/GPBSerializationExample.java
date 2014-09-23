// Copyright (c) 2014 Erick Bourgeois, All Rights Reserved

package ca.jeb.gpb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.jeb.common.gpb.ProtobufSerialization;
import ca.jeb.gpb.datamodel.Address;
import ca.jeb.gpb.datamodel.Person;

/**
 * @author <a href="mailto:erick@jeb.ca">Erick Bourgeois</a>
 */
public class GPBSerializationExample
{
  private static final Logger LOGGER = LoggerFactory.getLogger(GPBSerializationExample.class);

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    try
    {
      // 1. Setup the a Pojo Address
      LOGGER.info("Creating new Address object...");
      final Address addy = new Address();

      addy.setStreet("1 Main Street");
      addy.setCity("Foo Ville");
      addy.setStateOrProvince("Ontario");
      addy.setPostalCode("123456");
      addy.setCountry("Canada");

      final ProtobufSerialization<ca.jeb.generated.proto.Message.Address, Address> serializer = new ProtobufSerialization<>();
      final ca.jeb.generated.proto.Message.Address protoBufAddress = serializer.toProtoBuf(addy);
      LOGGER.debug("protoBufAddress: " + protoBufAddress);

      final Person person = new Person();
      person.setName("Erick");
      person.setAge(22);
      person.setAddress(addy);

      final ProtobufSerialization<ca.jeb.generated.proto.Message.Person, Person> pSerializer = new ProtobufSerialization<>();
      final ca.jeb.generated.proto.Message.Person protoBufPerson = pSerializer.toProtoBuf(person);
      LOGGER.debug("protoBufPerson: " + protoBufPerson);
    }
    catch (Exception e)
    {
      LOGGER.error("Can not serialize Address to protoBuf: " + e, e);
    }
  }
}