/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.daisuzz.sampleapiclient.api;

import com.daisuzz.sampleapiclient.invoker.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SampleHelloControllerApi
 */
@Ignore
public class SampleHelloControllerApiTest {

    private final SampleHelloControllerApi api = new SampleHelloControllerApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void helloTest() throws ApiException {
        String response = api.hello();

        // TODO: test validations
    }
    
}
