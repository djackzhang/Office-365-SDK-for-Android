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
package com.microsoft.fileservices.orc;

import com.microsoft.fileservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.*;
import com.microsoft.services.orc.interfaces.*;
import static com.microsoft.services.orc.Helpers.*;

/**
 * The type CurrentUserRequestContextOperations.
 */
public class CurrentUserRequestContextOperations extends OrcOperations {

     /**
      * Instantiates a new CurrentUserRequestContextOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public CurrentUserRequestContextOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public CurrentUserRequestContextOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public CurrentUserRequestContextOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

}
