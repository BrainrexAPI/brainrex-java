/*
 * BrainRex API
 * The Brainrex API is a collection of analytics tools and data integrations made for blockchain developers. In particular we offer Natural Language Processing and Anomaly detection algorithms that have been fine tune to understand text data and time series in the domain speficic setting of cryptocurrency and blockchain technology. This technology is intended to be use as building blocks to bigger applications, we offer examples on how to use them for Trading Backtesting and Smart Contract anomaly monitoring.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package brainrex;

import invalidPackageName.ApiCallback;
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.ApiResponse;
import invalidPackageName.Configuration;
import invalidPackageName.Pair;
import invalidPackageName.ProgressRequestBody;
import invalidPackageName.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Text;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LanguageApi {
    private ApiClient apiClient;

    public LanguageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LanguageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for languageGetCryptoEntities
     * @param text String of text to be analyze for investor sentiment. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call languageGetCryptoEntitiesCall(Text text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = text;

        // create path and map variables
        String localVarPath = "/entity/get_crypto_entities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "APIKeyHeader" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call languageGetCryptoEntitiesValidateBeforeCall(Text text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException("Missing the required parameter 'text' when calling languageGetCryptoEntities(Async)");
        }
        

        com.squareup.okhttp.Call call = languageGetCryptoEntitiesCall(text, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Extracts known crypto entities like coin names, exchanges, media from text.
     * The Crypto Entities endpoint ingests written MIT Digital Currency Initiative Paper A paper describing how our sentiment and entity analyzer are built. And how the can be used for trading several cryptocurrencies successfully  We prove that using sentiment only as a input to a trading algorithm can be profitable. If combined with other machine learning models. We descri This Paper could be published in MIT Crypto Economics Journal . . &lt;br&gt;&lt;br&gt; Our AI selects from several models, choosing the one that fits the given data best, and we give you the avality to customize the sensitivy of the model. Our model has been trained to recognize anomalies in popular blockchain networks e.g. Bitcoin, Ethereum, learning from past events.
     * @param text String of text to be analyze for investor sentiment. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void languageGetCryptoEntities(Text text) throws ApiException {
        languageGetCryptoEntitiesWithHttpInfo(text);
    }

    /**
     * Extracts known crypto entities like coin names, exchanges, media from text.
     * The Crypto Entities endpoint ingests written MIT Digital Currency Initiative Paper A paper describing how our sentiment and entity analyzer are built. And how the can be used for trading several cryptocurrencies successfully  We prove that using sentiment only as a input to a trading algorithm can be profitable. If combined with other machine learning models. We descri This Paper could be published in MIT Crypto Economics Journal . . &lt;br&gt;&lt;br&gt; Our AI selects from several models, choosing the one that fits the given data best, and we give you the avality to customize the sensitivy of the model. Our model has been trained to recognize anomalies in popular blockchain networks e.g. Bitcoin, Ethereum, learning from past events.
     * @param text String of text to be analyze for investor sentiment. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> languageGetCryptoEntitiesWithHttpInfo(Text text) throws ApiException {
        com.squareup.okhttp.Call call = languageGetCryptoEntitiesValidateBeforeCall(text, null, null);
        return apiClient.execute(call);
    }

    /**
     * Extracts known crypto entities like coin names, exchanges, media from text. (asynchronously)
     * The Crypto Entities endpoint ingests written MIT Digital Currency Initiative Paper A paper describing how our sentiment and entity analyzer are built. And how the can be used for trading several cryptocurrencies successfully  We prove that using sentiment only as a input to a trading algorithm can be profitable. If combined with other machine learning models. We descri This Paper could be published in MIT Crypto Economics Journal . . &lt;br&gt;&lt;br&gt; Our AI selects from several models, choosing the one that fits the given data best, and we give you the avality to customize the sensitivy of the model. Our model has been trained to recognize anomalies in popular blockchain networks e.g. Bitcoin, Ethereum, learning from past events.
     * @param text String of text to be analyze for investor sentiment. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call languageGetCryptoEntitiesAsync(Text text, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = languageGetCryptoEntitiesValidateBeforeCall(text, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for languageGetGeneralSentiment
     * @param text String of text to be analyze for general sentiment. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call languageGetGeneralSentimentCall(Text text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = text;

        // create path and map variables
        String localVarPath = "/sentiment/get_general_sentiment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "APIKeyHeader" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call languageGetGeneralSentimentValidateBeforeCall(Text text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException("Missing the required parameter 'text' when calling languageGetGeneralSentiment(Async)");
        }
        

        com.squareup.okhttp.Call call = languageGetGeneralSentimentCall(text, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a -1 to 1 score, depending on positive/negative sentiment
     * This endpoints returns a score from -1 to +1 where depending on negative or positive attitude in the text.
     * @param text String of text to be analyze for general sentiment. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String languageGetGeneralSentiment(Text text) throws ApiException {
        ApiResponse<String> resp = languageGetGeneralSentimentWithHttpInfo(text);
        return resp.getData();
    }

    /**
     * Returns a -1 to 1 score, depending on positive/negative sentiment
     * This endpoints returns a score from -1 to +1 where depending on negative or positive attitude in the text.
     * @param text String of text to be analyze for general sentiment. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> languageGetGeneralSentimentWithHttpInfo(Text text) throws ApiException {
        com.squareup.okhttp.Call call = languageGetGeneralSentimentValidateBeforeCall(text, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a -1 to 1 score, depending on positive/negative sentiment (asynchronously)
     * This endpoints returns a score from -1 to +1 where depending on negative or positive attitude in the text.
     * @param text String of text to be analyze for general sentiment. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call languageGetGeneralSentimentAsync(Text text, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = languageGetGeneralSentimentValidateBeforeCall(text, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for languageGetPriceSentiment
     * @param text String of text to be analyze for investor sentiment. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call languageGetPriceSentimentCall(Text text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = text;

        // create path and map variables
        String localVarPath = "/language/get_price_sentiment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "APIKeyHeader" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call languageGetPriceSentimentValidateBeforeCall(Text text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException("Missing the required parameter 'text' when calling languageGetPriceSentiment(Async)");
        }
        

        com.squareup.okhttp.Call call = languageGetPriceSentimentCall(text, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Sentiment analysis score using a model trained for buy signals.
     * Gives a 0 to 1 score, depending on buy/sell sentiment
     * @param text String of text to be analyze for investor sentiment. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String languageGetPriceSentiment(Text text) throws ApiException {
        ApiResponse<String> resp = languageGetPriceSentimentWithHttpInfo(text);
        return resp.getData();
    }

    /**
     * Sentiment analysis score using a model trained for buy signals.
     * Gives a 0 to 1 score, depending on buy/sell sentiment
     * @param text String of text to be analyze for investor sentiment. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> languageGetPriceSentimentWithHttpInfo(Text text) throws ApiException {
        com.squareup.okhttp.Call call = languageGetPriceSentimentValidateBeforeCall(text, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sentiment analysis score using a model trained for buy signals. (asynchronously)
     * Gives a 0 to 1 score, depending on buy/sell sentiment
     * @param text String of text to be analyze for investor sentiment. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call languageGetPriceSentimentAsync(Text text, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = languageGetPriceSentimentValidateBeforeCall(text, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}