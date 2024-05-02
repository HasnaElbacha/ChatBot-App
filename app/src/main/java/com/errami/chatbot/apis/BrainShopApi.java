package com.errami.chatbot.apis;

import com.errami.chatbot.models.BrainShopResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface BrainShopApi {
    @GET
    Call<BrainShopResponse> getResponse(@Url String url);
}
