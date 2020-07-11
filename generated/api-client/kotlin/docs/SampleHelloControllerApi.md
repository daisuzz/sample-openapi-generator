# SampleHelloControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hello**](SampleHelloControllerApi.md#hello) | **GET** / | 


<a name="hello"></a>
# **hello**
> kotlin.String hello()



### Example
```kotlin
// Import classes:
//import com.daisuzz.sampleapiclient.infrastructure.*
//import com.daisuzz.sampleapiclient.model.*

val apiInstance = SampleHelloControllerApi()
try {
    val result : kotlin.String = apiInstance.hello()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SampleHelloControllerApi#hello")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleHelloControllerApi#hello")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

