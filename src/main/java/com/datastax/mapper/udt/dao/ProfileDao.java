package com.datastax.mapper.udt.dao;

import com.datastax.mapper.udt.entity.Profile;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;

@Dao
public interface ProfileDao {

    @Select
    Profile profileById(int id);
}
