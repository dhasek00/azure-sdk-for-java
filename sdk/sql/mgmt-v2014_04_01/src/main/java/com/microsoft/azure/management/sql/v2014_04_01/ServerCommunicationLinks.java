/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ServerCommunicationLinksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServerCommunicationLinks.
 */
public interface ServerCommunicationLinks extends SupportsCreating<ServerCommunicationLink.DefinitionStages.Blank>, HasInner<ServerCommunicationLinksInner> {
    /**
     * Returns a server communication link.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param communicationLinkName The name of the server communication link.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerCommunicationLink> getAsync(String resourceGroupName, String serverName, String communicationLinkName);

    /**
     * Gets a list of server communication links.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerCommunicationLink> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Deletes a server communication link.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param communicationLinkName The name of the server communication link.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String communicationLinkName);

}