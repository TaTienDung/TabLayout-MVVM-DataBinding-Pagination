package com.task.blog.sample.model;

import java.util.List;

/**
 * Created by Priyank Jain on 26-01-2019.
 */
public class BlogResponse {
    private List<ApiResponse> apiResponses;

    public List<ApiResponse> getApiResponses() {
        return apiResponses;
    }

    public void setApiResponses(List<ApiResponse> apiResponses) {
        this.apiResponses = apiResponses;
    }

    @Override
    public String toString() {
        return "BlogResponse{" +
                "apiResponses=" + apiResponses +
                '}';
    }
}
