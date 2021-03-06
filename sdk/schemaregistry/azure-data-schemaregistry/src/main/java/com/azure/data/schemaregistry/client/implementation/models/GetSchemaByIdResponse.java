// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.schemaregistry.client.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getSchemaById operation. */
public final class GetSchemaByIdResponse extends ResponseBase<GetSchemaByIdHeaders, String> {
    /**
     * Creates an instance of GetSchemaByIdResponse.
     *
     * @param request the request which resulted in this GetSchemaByIdResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public GetSchemaByIdResponse(
            HttpRequest request, int statusCode, HttpHeaders rawHeaders, String value, GetSchemaByIdHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public String getValue() {
        return super.getValue();
    }
}
