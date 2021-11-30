package com.datastax.mapper.udt.entity;

import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.datastax.oss.driver.api.mapper.annotations.Entity;

/**
 * Maps to campaign UDT
 */
@Entity
@CqlName("campaign")
public class Campaign {

    @CqlName("partner_id")
    private int partnerId;

    @CqlName("campaign_id")
    private int campaignId;

    public Campaign() {}

    public Campaign(int partnerId, int campaignId) {
        this.partnerId = partnerId;
        this.campaignId = campaignId;
    }

    public int getPartnerId() {
        return this.partnerId;
    }

    public int getCampaignId() {
        return this.campaignId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }
}