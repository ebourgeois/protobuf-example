// Copyright (c) 2014 Erick Bourgeois, All Rights Reserved

package ca.jeb.protobuf.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.jeb.protobuf.ProtobufSerializer;
import ca.jeb.protobuf.example.datamodel.Address;

/**
 * @author <a href="mailto:erick@jeb.ca">Erick Bourgeois</a>
 */
public class ProtobufSerializerExample
{
  private static final Logger LOGGER = LoggerFactory.getLogger(ProtobufSerializerExample.class);

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    // 1. Setup the a Pojo Address
    LOGGER.info("Creating new Address object...");
    final Address address = new Address();
    address.setStreet("1 Main St");
    address.setCity("Foo Ville");
    address.setStateOrProvince("Bar");
    address.setPostalCode("J0J 1J1");
    address.setCountry("Canada");

    try
    {
      final ProtobufSerializer<ca.jeb.generated.proto.Message.Address, Address> serializer = new ProtobufSerializer<>();
      final ca.jeb.generated.proto.Message.Address protoBufAddress = serializer.toProtoBuf(address);
      LOGGER.debug("protoBufAddress: " + protoBufAddress);
    }
    catch (Exception e)
    {
      LOGGER.error("Can not serialize Address to protoBuf: " + e, e);
    }
  }
}