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
 * The type Assigned License.
*/
public class AssignedLicense extends ODataBaseEntity {

    public AssignedLicense(){
        setODataType("#Microsoft.Graph.AssignedLicense");
    }

    private java.util.List<String> disabledPlans;

    /**
    * Gets the disabled Plans.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getDisabledPlans() {
        return this.disabledPlans; 
    }

    /**
    * Sets the disabled Plans.
    *
    * @param value the java.util.List<String>
    */
    public void setDisabledPlans(java.util.List<String> value) { 
        this.disabledPlans = value;
        valueChanged("disabledPlans", value);

    }

    private java.util.UUID skuId;

    /**
    * Gets the sku Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getSkuId() {
        return this.skuId; 
    }

    /**
    * Sets the sku Id.
    *
    * @param value the java.util.UUID
    */
    public void setSkuId(java.util.UUID value) { 
        this.skuId = value;
        valueChanged("skuId", value);

    }
}
