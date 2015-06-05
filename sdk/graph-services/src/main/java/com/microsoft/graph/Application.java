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
 * The type Application.
*/
public class Application extends DirectoryObject {

    public Application(){
        setODataType("#Microsoft.Graph.Application");
    }
            
    private String appId;
     
    /**
    * Gets the app Id.
    *
    * @return the String
    */
    public String getAppId() {
        return this.appId; 
    }

    /**
    * Sets the app Id.
    *
    * @param value the String
    */
    public void setAppId(String value) { 
        this.appId = value; 
        valueChanged("appId", value);

    }
    
        
    private java.util.List<AppRole> appRoles = null;
    
    
     
    /**
    * Gets the app Roles.
    *
    * @return the java.util.List<AppRole>
    */
    public java.util.List<AppRole> getAppRoles() {
        return this.appRoles; 
    }

    /**
    * Sets the app Roles.
    *
    * @param value the java.util.List<AppRole>
    */
    public void setAppRoles(java.util.List<AppRole> value) { 
        this.appRoles = value; 
        valueChanged("appRoles", value);

    }
            
    private Boolean availableToOtherTenants;
     
    /**
    * Gets the available To Other Tenants.
    *
    * @return the Boolean
    */
    public Boolean getAvailableToOtherTenants() {
        return this.availableToOtherTenants; 
    }

    /**
    * Sets the available To Other Tenants.
    *
    * @param value the Boolean
    */
    public void setAvailableToOtherTenants(Boolean value) { 
        this.availableToOtherTenants = value; 
        valueChanged("availableToOtherTenants", value);

    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
            
    private String errorUrl;
     
    /**
    * Gets the error Url.
    *
    * @return the String
    */
    public String getErrorUrl() {
        return this.errorUrl; 
    }

    /**
    * Sets the error Url.
    *
    * @param value the String
    */
    public void setErrorUrl(String value) { 
        this.errorUrl = value; 
        valueChanged("errorUrl", value);

    }
            
    private String groupMembershipClaims;
     
    /**
    * Gets the group Membership Claims.
    *
    * @return the String
    */
    public String getGroupMembershipClaims() {
        return this.groupMembershipClaims; 
    }

    /**
    * Sets the group Membership Claims.
    *
    * @param value the String
    */
    public void setGroupMembershipClaims(String value) { 
        this.groupMembershipClaims = value; 
        valueChanged("groupMembershipClaims", value);

    }
            
    private String homepage;
     
    /**
    * Gets the homepage.
    *
    * @return the String
    */
    public String getHomepage() {
        return this.homepage; 
    }

    /**
    * Sets the homepage.
    *
    * @param value the String
    */
    public void setHomepage(String value) { 
        this.homepage = value; 
        valueChanged("homepage", value);

    }
    
        
    private java.util.List<String> identifierUris = null;
    
    
     
    /**
    * Gets the identifier Uris.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getIdentifierUris() {
        return this.identifierUris; 
    }

    /**
    * Sets the identifier Uris.
    *
    * @param value the java.util.List<String>
    */
    public void setIdentifierUris(java.util.List<String> value) { 
        this.identifierUris = value; 
        valueChanged("identifierUris", value);

    }
    
        
    private java.util.List<KeyCredential> keyCredentials = null;
    
    
     
    /**
    * Gets the key Credentials.
    *
    * @return the java.util.List<KeyCredential>
    */
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this.keyCredentials; 
    }

    /**
    * Sets the key Credentials.
    *
    * @param value the java.util.List<KeyCredential>
    */
    public void setKeyCredentials(java.util.List<KeyCredential> value) { 
        this.keyCredentials = value; 
        valueChanged("keyCredentials", value);

    }
    
        
    private java.util.List<String> knownClientApplications = null;
    
    
     
    /**
    * Gets the known Client Applications.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getKnownClientApplications() {
        return this.knownClientApplications; 
    }

    /**
    * Sets the known Client Applications.
    *
    * @param value the java.util.List<String>
    */
    public void setKnownClientApplications(java.util.List<String> value) { 
        this.knownClientApplications = value; 
        valueChanged("knownClientApplications", value);

    }
            
    private byte[] mainLogo;
     
    /**
    * Gets the main Logo.
    *
    * @return the byte[]
    */
    public byte[] getMainLogo() {
        return this.mainLogo; 
    }

    /**
    * Sets the main Logo.
    *
    * @param value the byte[]
    */
    public void setMainLogo(byte[] value) { 
        this.mainLogo = value; 
        valueChanged("mainLogo", value);

    }
            
    private String logoutUrl;
     
    /**
    * Gets the logout Url.
    *
    * @return the String
    */
    public String getLogoutUrl() {
        return this.logoutUrl; 
    }

    /**
    * Sets the logout Url.
    *
    * @param value the String
    */
    public void setLogoutUrl(String value) { 
        this.logoutUrl = value; 
        valueChanged("logoutUrl", value);

    }
            
    private Boolean oauth2AllowImplicitFlow;
     
    /**
    * Gets the oauth2Allow Implicit Flow.
    *
    * @return the Boolean
    */
    public Boolean getOauth2AllowImplicitFlow() {
        return this.oauth2AllowImplicitFlow; 
    }

    /**
    * Sets the oauth2Allow Implicit Flow.
    *
    * @param value the Boolean
    */
    public void setOauth2AllowImplicitFlow(Boolean value) { 
        this.oauth2AllowImplicitFlow = value; 
        valueChanged("oauth2AllowImplicitFlow", value);

    }
            
    private Boolean oauth2AllowUrlPathMatching;
     
    /**
    * Gets the oauth2Allow Url Path Matching.
    *
    * @return the Boolean
    */
    public Boolean getOauth2AllowUrlPathMatching() {
        return this.oauth2AllowUrlPathMatching; 
    }

    /**
    * Sets the oauth2Allow Url Path Matching.
    *
    * @param value the Boolean
    */
    public void setOauth2AllowUrlPathMatching(Boolean value) { 
        this.oauth2AllowUrlPathMatching = value; 
        valueChanged("oauth2AllowUrlPathMatching", value);

    }
    
        
    private java.util.List<OAuth2Permission> oauth2Permissions = null;
    
    
     
    /**
    * Gets the oauth2Permissions.
    *
    * @return the java.util.List<OAuth2Permission>
    */
    public java.util.List<OAuth2Permission> getOauth2Permissions() {
        return this.oauth2Permissions; 
    }

    /**
    * Sets the oauth2Permissions.
    *
    * @param value the java.util.List<OAuth2Permission>
    */
    public void setOauth2Permissions(java.util.List<OAuth2Permission> value) { 
        this.oauth2Permissions = value; 
        valueChanged("oauth2Permissions", value);

    }
            
    private Boolean oauth2RequirePostResponse;
     
    /**
    * Gets the oauth2Require Post Response.
    *
    * @return the Boolean
    */
    public Boolean getOauth2RequirePostResponse() {
        return this.oauth2RequirePostResponse; 
    }

    /**
    * Sets the oauth2Require Post Response.
    *
    * @param value the Boolean
    */
    public void setOauth2RequirePostResponse(Boolean value) { 
        this.oauth2RequirePostResponse = value; 
        valueChanged("oauth2RequirePostResponse", value);

    }
    
        
    private java.util.List<PasswordCredential> passwordCredentials = null;
    
    
     
    /**
    * Gets the password Credentials.
    *
    * @return the java.util.List<PasswordCredential>
    */
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this.passwordCredentials; 
    }

    /**
    * Sets the password Credentials.
    *
    * @param value the java.util.List<PasswordCredential>
    */
    public void setPasswordCredentials(java.util.List<PasswordCredential> value) { 
        this.passwordCredentials = value; 
        valueChanged("passwordCredentials", value);

    }
            
    private Boolean publicClient;
     
    /**
    * Gets the public Client.
    *
    * @return the Boolean
    */
    public Boolean getPublicClient() {
        return this.publicClient; 
    }

    /**
    * Sets the public Client.
    *
    * @param value the Boolean
    */
    public void setPublicClient(Boolean value) { 
        this.publicClient = value; 
        valueChanged("publicClient", value);

    }
    
        
    private java.util.List<String> replyUrls = null;
    
    
     
    /**
    * Gets the reply Urls.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getReplyUrls() {
        return this.replyUrls; 
    }

    /**
    * Sets the reply Urls.
    *
    * @param value the java.util.List<String>
    */
    public void setReplyUrls(java.util.List<String> value) { 
        this.replyUrls = value; 
        valueChanged("replyUrls", value);

    }
    
        
    private java.util.List<RequiredResourceAccess> requiredResourceAccess = null;
    
    
     
    /**
    * Gets the required Resource Access.
    *
    * @return the java.util.List<RequiredResourceAccess>
    */
    public java.util.List<RequiredResourceAccess> getRequiredResourceAccess() {
        return this.requiredResourceAccess; 
    }

    /**
    * Sets the required Resource Access.
    *
    * @param value the java.util.List<RequiredResourceAccess>
    */
    public void setRequiredResourceAccess(java.util.List<RequiredResourceAccess> value) { 
        this.requiredResourceAccess = value; 
        valueChanged("requiredResourceAccess", value);

    }
            
    private String samlMetadataUrl;
     
    /**
    * Gets the saml Metadata Url.
    *
    * @return the String
    */
    public String getSamlMetadataUrl() {
        return this.samlMetadataUrl; 
    }

    /**
    * Sets the saml Metadata Url.
    *
    * @param value the String
    */
    public void setSamlMetadataUrl(String value) { 
        this.samlMetadataUrl = value; 
        valueChanged("samlMetadataUrl", value);

    }
    
        
    private java.util.List<ExtensionProperty> extensionProperties = null;
    
    
     
    /**
    * Gets the extension Properties.
    *
    * @return the java.util.List<ExtensionProperty>
    */
    public java.util.List<ExtensionProperty> getExtensionProperties() {
        return this.extensionProperties; 
    }

    /**
    * Sets the extension Properties.
    *
    * @param value the java.util.List<ExtensionProperty>
    */
    public void setExtensionProperties(java.util.List<ExtensionProperty> value) { 
        this.extensionProperties = value; 
        valueChanged("extensionProperties", value);

    }
            
    private DirectoryObject createdOnBehalfOf;
     
    /**
    * Gets the created On Behalf Of.
    *
    * @return the DirectoryObject
    */
    public DirectoryObject getCreatedOnBehalfOf() {
        return this.createdOnBehalfOf; 
    }

    /**
    * Sets the created On Behalf Of.
    *
    * @param value the DirectoryObject
    */
    public void setCreatedOnBehalfOf(DirectoryObject value) { 
        this.createdOnBehalfOf = value; 
        valueChanged("createdOnBehalfOf", value);

    }
    
        
    private java.util.List<DirectoryObject> owners = null;
    
    
     
    /**
    * Gets the owners.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getOwners() {
        return this.owners; 
    }

    /**
    * Sets the owners.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setOwners(java.util.List<DirectoryObject> value) { 
        this.owners = value; 
        valueChanged("owners", value);

    }
}

