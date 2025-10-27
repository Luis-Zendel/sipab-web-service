package mx.com.telcel.sipab.response;

import lombok.Data;

public @Data class Response<T> {
	
	private String message;
    private T data;
    private int code;

    public Response(String message, T data){
        this.message = message;
        this.data = data;
        this.code = 200;
    }
    
    public Response(int code, String message, T data){
        this.message = message;
        this.data = data;
        this.code = 200;
        this.code = code;
    }
    
    public Response() {
    }

}
