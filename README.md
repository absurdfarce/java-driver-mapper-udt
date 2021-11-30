# What Is This?
A simple example of using the [mapping features](https://github.com/datastax/java-driver/tree/4.x/manual/mapper) of the DataStax Java driver when using UDTs

# What's The Schema?
```
CREATE KEYSPACE mapper WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

CREATE TYPE mapper.campaign (
    partner_id int,
    campaign_id int
);

CREATE TABLE mapper.profile (
    id int primary key,
    campaigns list<frozen<campaign>>
);

insert into mapper.profile (id, campaigns) values (1, [{partner_id: 1, campaign_id: 1}]);
insert into mapper.profile (id, campaigns) values (2, [{partner_id: 1, campaign_id: 2}]);
insert into mapper.profile (id, campaigns) values (3, [{partner_id: 2, campaign_id: 3}]);
```

# How Do You Run It?
Should be as simple as:

> ./gradlew run

Output should be something like:

> Found it: com.datastax.mapper.udt.entity.Profile@4961f6af, (1 [com.datastax.mapper.udt.entity.Campaign@5aebe890]) 
