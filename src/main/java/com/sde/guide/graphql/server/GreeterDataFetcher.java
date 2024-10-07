package com.sde.guide.graphql.server;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

@Component
public class GreeterDataFetcher {
    public DataFetcher<String> getGreeterDataFetcher() {
        return response-> "hello";
    }
}
