package com.datastax.mapper.udt;

import com.datastax.mapper.udt.dao.ProfileDao;
import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.DaoKeyspace;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

@Mapper
public interface AppMapper {
    @DaoFactory
    ProfileDao profileDao(@DaoKeyspace CqlIdentifier keyspace);
}
