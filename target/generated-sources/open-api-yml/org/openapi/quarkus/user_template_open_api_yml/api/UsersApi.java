package org.openapi.quarkus.user_template_open_api_yml.api;

import org.openapi.quarkus.user_template_open_api_yml.model.CreateUserRequest;
import org.openapi.quarkus.user_template_open_api_yml.model.ProblemDetails;
import org.openapi.quarkus.user_template_open_api_yml.model.UpdateUserRequest;
import org.openapi.quarkus.user_template_open_api_yml.model.User;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.openapi.quarkus.user_template_open_api_yml.api.auth.CompositeAuthenticationProvider;
import org.openapi.quarkus.user_template_open_api_yml.api.auth.AuthenticationPropagationHeadersFactory;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;

/**
  * Launch Template REST API
  * <p>The Launch Template solution is a polyglot application intended to showcase various capabilities Launch can provide clients. This REST API is an implementation of the API Gateway pattern providing a facade layer for the backend services utilized by the micro-frontend application.</p>
  */
@Path("/users")
@RegisterRestClient(baseUri="http://localhost:8088/launch-api-hex-template/v1", configKey="user_template_open_api_yml")
@GeneratedClass(value="user-template-open-api.yml", tag = "Users")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface UsersApi {

     /**
     * Adds a new User
     *
     * Create User.
     *
     * @param createUserRequest 
     */
    @POST
    @Consumes({"application/json"})
    @Produces({"application/json; charset=utf-8", "application/json"})
    @GeneratedMethod ("CreateUser")
    public User createUser(
        CreateUserRequest createUserRequest

    );

     /**
     * Updates User
     *
     * Update User details
     *
     * @param username 
     */
    @DELETE
    @Path("/{username}")
    @Produces({"application/json; charset=utf-8", "application/json"})
    @GeneratedMethod ("DeleteUser")
    public User deleteUser(
        @GeneratedParam("username") @PathParam("username") String username

    );

     /**
     * Get all Users details
     *
     * Get All Users.
     *
     */
    @GET
    @Produces({"application/json; charset=utf-8", "application/json"})
    @GeneratedMethod ("GetAllUsers")
    public List<User> getAllUsers(
        
    );

     /**
     * Gets User Details
     *
     * Retrieves Get User Details By username.
     *
     * @param username 
     */
    @GET
    @Path("/{username}")
    @Produces({"application/json; charset=utf-8", "application/json"})
    @GeneratedMethod ("GetUser")
    public User getUser(
        @GeneratedParam("username") @PathParam("username") String username

    );

     /**
     * Updates User
     *
     * Update User details
     *
     * @param username 
     * @param updateUserRequest 
     */
    @PUT
    @Path("/{username}")
    @Consumes({"application/json"})
    @Produces({"application/json; charset=utf-8", "application/json"})
    @GeneratedMethod ("UpdateUser")
    public User updateUser(
        @GeneratedParam("username") @PathParam("username") String username
, UpdateUserRequest updateUserRequest

    );

}
