package com.datastax.mapper.udt;

import com.datastax.mapper.udt.dao.ProfileDao;
import com.datastax.mapper.udt.entity.Profile;
import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.core.CqlSession;

public class App {

    public static void main(String[] args) {

        CqlSession session = CqlSession.builder().build();
        AppMapper mapper = new AppMapperBuilder(session).build();
        ProfileDao dao = mapper.profileDao(CqlIdentifier.fromInternal("mapper"));
        Profile p = dao.profileById(1);
        System.out.println(String.format("Found it: %s, (%s %s)", p, p.getId(), p.getCampaigns()));
        session.close();
    }
}
