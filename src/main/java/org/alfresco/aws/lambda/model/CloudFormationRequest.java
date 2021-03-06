/*
 * #%L
 * Alfresco Lambda Java Utils
 * %%
 * Copyright (C) 2005 - 2017 Alfresco Software Limited
 * %%
 * License rights for this program may be obtained from Alfresco Software, Ltd.
 * pursuant to a written agreement and any use of this program without such an
 * agreement is prohibited.
 * #L%
 */
package org.alfresco.aws.lambda.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Object to hold incoming cloudformation request data.
 *
 * NOTE: Due to the use of property names beginning with uppercase
 *       characters, public member variables are being used
 */
public class CloudFormationRequest implements Serializable {

    private static final long serialVersionUID = 2655343319582749084L;
    
    public static String CREATE = "Create";
    public static String UPDATE = "Update";
    public static String DELETE = "Delete";
    
    public String RequestType;
    public String ResponseURL;
    public String StackId;
    public String RequestId;
    public String ResourceType;
    public String LogicalResourceId;
    public Map<String, Object> ResourceProperties;
    public Map<String, Object> OldResourceProperties;

    public CloudFormationRequest() 
    {
    }

    @Override
    public String toString() 
    {
        StringBuffer buffer = new StringBuffer("{");
        
        buffer.append("RequestType='");
        buffer.append(RequestType);
        buffer.append("', ResponseURL='");
        buffer.append(ResponseURL);
        buffer.append("', StackId='");
        buffer.append(this.StackId);
        buffer.append("', RequestId='");
        buffer.append(RequestId);
        buffer.append("', ResourceType='");
        buffer.append(ResourceType);
        buffer.append("', LogicalResourceId='");
        buffer.append(LogicalResourceId);
        buffer.append("', ResourceProperties=");
        buffer.append(ResourceProperties);
        buffer.append(", OldResourceProperties=");
        buffer.append(OldResourceProperties);
        buffer.append("}");
        
        return buffer.toString();
    }
}

