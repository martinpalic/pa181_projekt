package cz.pa181.project.controllers;

import lombok.Data;

@Data
public class EvaluateResponse {
    private String result;
    private String price;

    public EvaluateResponse() {
    }

    public EvaluateResponse(String result, String price) {
        this.result = result;
        this.price = price;
    }
}
