# SampleHelloControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hello**](SampleHelloControllerApi.md#hello) | **GET** / | 


<a name="hello"></a>
# **hello**
> String hello()



### Example
```java
// Import classes:
import com.daisuzz.sampleapiclient.invoker.ApiClient;
import com.daisuzz.sampleapiclient.invoker.ApiException;
import com.daisuzz.sampleapiclient.invoker.Configuration;
import com.daisuzz.sampleapiclient.invoker.models.*;
import com.daisuzz.sampleapiclient.api.SampleHelloControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    SampleHelloControllerApi apiInstance = new SampleHelloControllerApi(defaultClient);
    try {
      String result = apiInstance.hello();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SampleHelloControllerApi#hello");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

