package com.datastax.mapper.udt.entity;

import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;
import com.datastax.oss.driver.shaded.guava.common.collect.ImmutableList;

import java.util.List;

@Entity
@CqlName("profile")
public class Profile {

    @PartitionKey private int id;

    @CqlName("campaigns")
    private List<Campaign> campaigns;

    public Profile() {}

    public Profile(int id, List<Campaign> campaigns) {

        this.id = id;
        this.campaigns = ImmutableList.copyOf(campaigns);
    }

    public int getId() { return this.id; }

    public void setId(int id) {
        this.id = id;
    }

    public List<Campaign> getCampaigns() { return this.campaigns; }

    public void setCampaigns(List<Campaign> campaigns) { this.campaigns = ImmutableList.copyOf(campaigns); }
}