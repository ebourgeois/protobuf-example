gpb-example
===========

Google Protobuf Example project

This project contains a couple examples of how to use Google Protobuf and integrating
this into a Maven based project.

The following examples assume you have a working <code>protoc</code> program for
generatingyour Protobuf classes.

## Simple <code>Person</code> Example

### Create a proto file

The convention we use is ${groupId}.${outerClassName}.proto, e.g. <code>ca.jeb.Message.proto</code>.

```protobuf
option java_package = "ca.jeb.generated.proto";
option java_outer_classname = "Message";

message Address
{
    optional string street = 1;
    optional string city = 2;
    optional string stateOrProvince = 3;
    optional string country = 4;
    optional string postalCode = 5;
}
message Person
{
    required string name = 1;
    required int32 age = 2;
    optional Address address = 3; 
}
```

This will generate the file <code>Message.class</code> in the package area <code>

### Create Person and Address objects

Now that you have the classes generated, let's start using them! Protobuf setters 
all return <code>this</code>, allowing you to chain your setters all together and 
since they use the concept of a "builder", this makes building an object relatively 
simple. For example, if here is how you could create an Address object, then set 
this to a Person object:

```java
// 1. Setup the persons address
final Address address = Address.newBuilder().setStreet("1 Main Street").setCity("Foo Ville").setCountry("Canada")
        .setPostalCode("J0J 1H1").build();

// 2. Now setup the Person and assign the above address to them.
final Person person = Person.newBuilder().setName("Erick").setAge(22).setAddress(address).build();
```

