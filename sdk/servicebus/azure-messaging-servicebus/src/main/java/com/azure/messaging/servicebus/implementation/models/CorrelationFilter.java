// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

/** The CorrelationFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CorrelationFilter")
@JacksonXmlRootElement(localName = "CorrelationFilter")
@Fluent
public final class CorrelationFilter extends RuleFilter {
    /*
     * The CorrelationId property.
     */
    @JacksonXmlProperty(
            localName = "CorrelationId",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String correlationId;

    /*
     * The MessageId property.
     */
    @JacksonXmlProperty(
            localName = "MessageId",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String messageId;

    /*
     * The To property.
     */
    @JacksonXmlProperty(
            localName = "To",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String to;

    /*
     * The ReplyTo property.
     */
    @JacksonXmlProperty(
            localName = "ReplyTo",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String replyTo;

    /*
     * The Label property.
     */
    @JacksonXmlProperty(
            localName = "Label",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String label;

    /*
     * The SessionId property.
     */
    @JacksonXmlProperty(
            localName = "SessionId",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String sessionId;

    /*
     * The ReplyToSessionId property.
     */
    @JacksonXmlProperty(
            localName = "ReplyToSessionId",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String replyToSessionId;

    /*
     * The ContentType property.
     */
    @JacksonXmlProperty(
            localName = "ContentType",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String contentType;

    private static final class PropertiesWrapper {
        @JacksonXmlProperty(localName = "KeyValueOfstringanyType")
        private final List<KeyValue> items;

        @JsonCreator
        private PropertiesWrapper(@JacksonXmlProperty(localName = "KeyValueOfstringanyType") List<KeyValue> items) {
            this.items = items;
        }
    }

    /*
     * The Properties property.
     */
    @JacksonXmlProperty(
            localName = "Properties",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private PropertiesWrapper properties;

    /**
     * Get the correlationId property: The CorrelationId property.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: The CorrelationId property.
     *
     * @param correlationId the correlationId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the messageId property: The MessageId property.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The MessageId property.
     *
     * @param messageId the messageId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the to property: The To property.
     *
     * @return the to value.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Set the to property: The To property.
     *
     * @param to the to value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the replyTo property: The ReplyTo property.
     *
     * @return the replyTo value.
     */
    public String getReplyTo() {
        return this.replyTo;
    }

    /**
     * Set the replyTo property: The ReplyTo property.
     *
     * @param replyTo the replyTo value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * Get the label property: The Label property.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: The Label property.
     *
     * @param label the label value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the sessionId property: The SessionId property.
     *
     * @return the sessionId value.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The SessionId property.
     *
     * @param sessionId the sessionId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the replyToSessionId property: The ReplyToSessionId property.
     *
     * @return the replyToSessionId value.
     */
    public String getReplyToSessionId() {
        return this.replyToSessionId;
    }

    /**
     * Set the replyToSessionId property: The ReplyToSessionId property.
     *
     * @param replyToSessionId the replyToSessionId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setReplyToSessionId(String replyToSessionId) {
        this.replyToSessionId = replyToSessionId;
        return this;
    }

    /**
     * Get the contentType property: The ContentType property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The ContentType property.
     *
     * @param contentType the contentType value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the properties property: The Properties property.
     *
     * @return the properties value.
     */
    public List<KeyValue> getProperties() {
        if (this.properties == null) {
            this.properties = new PropertiesWrapper(new ArrayList<KeyValue>());
        }
        return this.properties.items;
    }

    /**
     * Set the properties property: The Properties property.
     *
     * @param properties the properties value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter setProperties(List<KeyValue> properties) {
        this.properties = new PropertiesWrapper(properties);
        return this;
    }
}