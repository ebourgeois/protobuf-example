// Copyright (c) 2014 Erick Bourgeois, All Rights Reserved

package ca.jeb.gpb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.jeb.common.gpb.ProtobufSerialization;
import ca.jeb.gpb.datamodel.Address;

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
    // 1. Setup the a Pojo Address
    LOGGER.info("Creating new Address object...");
    final Address addy = new Address();

    final ProtobufSerialization<ca.jeb.generated.proto.Message.Address, Address> serializer = new ProtobufSerialization<>();
    // Person.newBuilder().getAllFields()
    try
    {
      final ca.jeb.generated.proto.Message.Address protoBufAddress = serializer.toProtoBuf(addy);
      // Person.newBuilder().
    }
    catch (Exception e)
    {
      LOGGER.error("Can not serialize Address to protoBuf: " + e, e);
    }
  }
}