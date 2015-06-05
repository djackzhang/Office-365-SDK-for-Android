/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;



/**
 * The type Directory Link Change.
*/
public class DirectoryLinkChange extends DirectoryObject {

    public DirectoryLinkChange(){
        setODataType("#Microsoft.Graph.DirectoryLinkChange");
    }
            
    private String associationType;
     
    /**
    * Gets the association Type.
    *
    * @return the String
    */
    public String getAssociationType() {
        return this.associationType; 
    }

    /**
    * Sets the association Type.
    *
    * @param value the String
    */
    public void setAssociationType(String value) { 
        this.associationType = value; 
        valueChanged("associationType", value);

    }
            
    private String sourceObjectId;
     
    /**
    * Gets the source Object Id.
    *
    * @return the String
    */
    public String getSourceObjectId() {
        return this.sourceObjectId; 
    }

    /**
    * Sets the source Object Id.
    *
    * @param value the String
    */
    public void setSourceObjectId(String value) { 
        this.sourceObjectId = value; 
        valueChanged("sourceObjectId", value);

    }
            
    private String sourceObjectType;
     
    /**
    * Gets the source Object Type.
    *
    * @return the String
    */
    public String getSourceObjectType() {
        return this.sourceObjectType; 
    }

    /**
    * Sets the source Object Type.
    *
    * @param value the String
    */
    public void setSourceObjectType(String value) { 
        this.sourceObjectType = value; 
        valueChanged("sourceObjectType", value);

    }
            
    private String sourceObjectUri;
     
    /**
    * Gets the source Object Uri.
    *
    * @return the String
    */
    public String getSourceObjectUri() {
        return this.sourceObjectUri; 
    }

    /**
    * Sets the source Object Uri.
    *
    * @param value the String
    */
    public void setSourceObjectUri(String value) { 
        this.sourceObjectUri = value; 
        valueChanged("sourceObjectUri", value);

    }
            
    private String targetObjectId;
     
    /**
    * Gets the target Object Id.
    *
    * @return the String
    */
    public String getTargetObjectId() {
        return this.targetObjectId; 
    }

    /**
    * Sets the target Object Id.
    *
    * @param value the String
    */
    public void setTargetObjectId(String value) { 
        this.targetObjectId = value; 
        valueChanged("targetObjectId", value);

    }
            
    private String targetObjectType;
     
    /**
    * Gets the target Object Type.
    *
    * @return the String
    */
    public String getTargetObjectType() {
        return this.targetObjectType; 
    }

    /**
    * Sets the target Object Type.
    *
    * @param value the String
    */
    public void setTargetObjectType(String value) { 
        this.targetObjectType = value; 
        valueChanged("targetObjectType", value);

    }
            
    private String targetObjectUri;
     
    /**
    * Gets the target Object Uri.
    *
    * @return the String
    */
    public String getTargetObjectUri() {
        return this.targetObjectUri; 
    }

    /**
    * Sets the target Object Uri.
    *
    * @param value the String
    */
    public void setTargetObjectUri(String value) { 
        this.targetObjectUri = value; 
        valueChanged("targetObjectUri", value);

    }
}

