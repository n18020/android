class HttpUtil {
    //叩きたいREST APIのURLを引数とします
        fun httpGET1(url : String): String? {
                val client = OkHttpClient()
                    val request = Request.Builder()
                                .url(url)
                                            .build()
                                        
                                                val response = client.newCall(request).execute()
                                                    val body = response.body?.string()
                                                        return body
                                                        }
                                                    }
