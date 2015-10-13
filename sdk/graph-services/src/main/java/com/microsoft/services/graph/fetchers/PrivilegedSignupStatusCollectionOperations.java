

/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import com.microsoft.services.orc.serialization.JsonSerializer;
import static com.microsoft.services.orc.core.Helpers.*;

/**
 * The type PrivilegedSignupStatusCollectionOperations
 */
public class PrivilegedSignupStatusCollectionOperations extends OrcOperations{

    /**
     * Instantiates a new PrivilegedSignupStatusCollectionOperations.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
    public PrivilegedSignupStatusCollectionOperations(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public PrivilegedSignupStatusCollectionOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public PrivilegedSignupStatusCollectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }
 
     
    /**
     * SignUp listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<PrivilegedSignupStatus> signUp() { 
              
          
        
        ListenableFuture<String> future = signUpRaw();
        return transformToEntityListenableFuture(future, PrivilegedSignupStatus.class, getResolver());
        
    }

     /**
     * SignUpRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> signUpRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("SignUp");
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


                
 
     
    /**
     * CompleteSetup listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> completeSetup() { 
              
          
        
        ListenableFuture<String> future = completeSetupRaw();
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * CompleteSetupRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> completeSetupRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("CompleteSetup");
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


                
 
     
    /**
     * SkipSetup listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> skipSetup() { 
              
          
        
        ListenableFuture<String> future = skipSetupRaw();
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * SkipSetupRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> skipSetupRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("SkipSetup");
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


                
 
     
    /**
     * IsSignedUp listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Boolean> isSignedUp() { 
              
          
        
        ListenableFuture<String> future = isSignedUpRaw();
        return transformToEntityListenableFuture(future, Boolean.class, getResolver());
        
    }

     /**
     * IsSignedUpRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> isSignedUpRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("IsSignedUp");
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


                
 
     
    /**
     * CanSignUp listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Boolean> canSignUp() { 
              
          
        
        ListenableFuture<String> future = canSignUpRaw();
        return transformToEntityListenableFuture(future, Boolean.class, getResolver());
        
    }

     /**
     * CanSignUpRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> canSignUpRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("CanSignUp");
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


                
}