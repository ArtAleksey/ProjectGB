package ru.JavaCoreLessonSix;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class Weather {

    // http://dataservice.accuweather.com/forecasts/v1/daily/5day/332287?apikey=uDwZv8qkhj5HzAdroQ2n6SspRmL5ootW

    private static final String HTTP = "http";
    private static final String HOST = "dataservice.accuweather.com";
    private static final String SEGMENT1 = "forecasts";
    private static final String SEGMENT2 = "v1";
    private static final String SEGMENT3 = "daily";
    private static final String SEGMENT4 = "5day";
    private static final String SEGMENT5 = "332287";
    private static final String PARAMETER1 = "uDwZv8qkhj5HzAdroQ2n6SspRmL5ootW";


    public static void main(String[] args) throws IOException {

        // Экземпляр класса OkHttpClient выполняет всю работу по созданию и отправке запросов
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme(HTTP)
                .host(HOST)
                .addPathSegment(SEGMENT1)
                .addPathSegment(SEGMENT2)
                .addPathSegment(SEGMENT3)
                .addPathSegment(SEGMENT4)
                .addPathSegment(SEGMENT5)
                .addQueryParameter("apikey", PARAMETER1)
                .build();


        // Экземпляр класса Request создается через Builder (см. паттерн проектирования "Строитель")
        Request request = new Request.Builder()

                .url(url)
                .build();

        // Получение объекта ответа от сервера
        Response response = client.newCall(request).execute();

        // Тело сообщения возвращается методом body объекта Response
        String body = Objects.requireNonNull(response.body()).string();

//        System.out.println(response.code());
//        System.out.println(response.headers());
//        System.out.println(response.isRedirect());
//        System.out.println(response.isSuccessful());
//        System.out.println(response.protocol());
//        System.out.println(response.receivedResponseAtMillis());
        System.out.println(body);
    }

}
