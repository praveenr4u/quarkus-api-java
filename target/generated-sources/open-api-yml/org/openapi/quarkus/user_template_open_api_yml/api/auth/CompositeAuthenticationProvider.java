package org.openapi.quarkus.user_template_open_api_yml.api.auth;

import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.Priorities;

import jakarta.annotation.Priority;

import io.quarkiverse.openapi.generator.OpenApiGeneratorConfig;

import io.quarkiverse.openapi.generator.providers.ApiKeyAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.ApiKeyIn;
import io.quarkiverse.openapi.generator.providers.AbstractCompositeAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.OperationAuthInfo;

import java.util.Optional;

@Priority(Priorities.AUTHENTICATION)
public class CompositeAuthenticationProvider extends AbstractCompositeAuthenticationProvider {

    @jakarta.inject.Inject
    OpenApiGeneratorConfig generatorConfig;


    @PostConstruct
    public void init() {

        ApiKeyAuthenticationProvider apiKeyHeaderProvider0 = new ApiKeyAuthenticationProvider("user_template_open_api_yml", sanitizeAuthName("apiKeyHeader"), ApiKeyIn.header, "Ocp-Apim-Subscription-Key", generatorConfig);
        this.addAuthenticationProvider(apiKeyHeaderProvider0);
        apiKeyHeaderProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users")
            .withId("createUser")
            .withMethod("POST")
            .build());
        apiKeyHeaderProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users/{username}")
            .withId("deleteUser")
            .withMethod("DELETE")
            .build());
        apiKeyHeaderProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users")
            .withId("getAllUsers")
            .withMethod("GET")
            .build());
        apiKeyHeaderProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users/{username}")
            .withId("getUser")
            .withMethod("GET")
            .build());
        apiKeyHeaderProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users/{username}")
            .withId("updateUser")
            .withMethod("PUT")
            .build());
        ApiKeyAuthenticationProvider apiKeyQueryProvider1 = new ApiKeyAuthenticationProvider("user_template_open_api_yml", sanitizeAuthName("apiKeyQuery"), ApiKeyIn.query, "subscription-key", generatorConfig);
        this.addAuthenticationProvider(apiKeyQueryProvider1);
        apiKeyQueryProvider1.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users")
            .withId("createUser")
            .withMethod("POST")
            .build());
        apiKeyQueryProvider1.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users/{username}")
            .withId("deleteUser")
            .withMethod("DELETE")
            .build());
        apiKeyQueryProvider1.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users")
            .withId("getAllUsers")
            .withMethod("GET")
            .build());
        apiKeyQueryProvider1.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users/{username}")
            .withId("getUser")
            .withMethod("GET")
            .build());
        apiKeyQueryProvider1.addOperation(OperationAuthInfo.builder()
            .withPath("/launch-api-hex-template/v1/users/{username}")
            .withId("updateUser")
            .withMethod("PUT")
            .build());
    }

}