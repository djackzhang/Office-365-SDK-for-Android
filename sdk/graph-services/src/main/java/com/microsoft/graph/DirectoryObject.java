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

import com.microsoft.services.orc.ODataBaseEntity;


/**
 * The type Directory Object.
*/
public class DirectoryObject extends ODataBaseEntity {

    public DirectoryObject(){
        setODataType("#Microsoft.Graph.DirectoryObject");
    }
            
    private String objectType;
     
    /**
    * Gets the object Type.
    *
    * @return the String
    */
    public String getObjectType() {
        return this.objectType; 
    }

    /**
    * Sets the object Type.
    *
    * @param value the String
    */
    public void setObjectType(String value) { 
        this.objectType = value; 
        valueChanged("objectType", value);

    }
            
    private String objectId;
     
    /**
    * Gets the object Id.
    *
    * @return the String
    */
    public String getObjectId() {
        return this.objectId; 
    }

    /**
    * Sets the object Id.
    *
    * @param value the String
    */
    public void setObjectId(String value) { 
        this.objectId = value; 
        valueChanged("objectId", value);

    }
            
    private java.util.Calendar deletionTimestamp;
     
    /**
    * Gets the deletion Timestamp.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getDeletionTimestamp() {
        return this.deletionTimestamp; 
    }

    /**
    * Sets the deletion Timestamp.
    *
    * @param value the java.util.Calendar
    */
    public void setDeletionTimestamp(java.util.Calendar value) { 
        this.deletionTimestamp = value; 
        valueChanged("deletionTimestamp", value);

    }
}

