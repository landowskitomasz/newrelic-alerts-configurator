package com.ocadotechnology.newrelic.apiclient.internal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ocadotechnology.newrelic.apiclient.model.conditions.AlertsCondition;
import lombok.Value;

@Value
public class AlertsConditionWrapper {
    @JsonProperty
    AlertsCondition condition;
}
