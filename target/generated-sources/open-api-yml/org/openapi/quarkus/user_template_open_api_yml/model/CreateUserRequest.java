package org.openapi.quarkus.user_template_open_api_yml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Represents details about User to be used in create operations
 **/
public class CreateUserRequest  {

    /**
      * Represents details about User to be used in create operations
     **/
    private String username;
    /**
      * Represents details about User to be used in create operations
     **/
    private String name;
    /**
      * Represents details about User to be used in create operations
     **/
    private String email;

    /**
    * Represents a standard User identifier
    * @return username
    **/
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(String username) {
        this.username = username;
    }

    public CreateUserRequest username(String username) {
        this.username = username;
        return this;
    }

    /**
    * Represents the User first and lastname
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public CreateUserRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Represents the User email
    * @return email
    **/
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public CreateUserRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserRequest {\n");

        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    /**
      * Represents details about User to be used in create operations
     **/
    public static class CreateUserRequestQueryParam  {

        /**
          * Represents details about User to be used in create operations
         **/
        @jakarta.ws.rs.QueryParam("username")
        private String username;
        /**
          * Represents details about User to be used in create operations
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Represents details about User to be used in create operations
         **/
        @jakarta.ws.rs.QueryParam("email")
        private String email;

        /**
        * Represents a standard User identifier
        * @return username
        **/
        @JsonProperty("username")
        public String getUsername() {
            return username;
        }

        /**
         * Set username
         **/
        public void setUsername(String username) {
            this.username = username;
        }

        public CreateUserRequestQueryParam username(String username) {
            this.username = username;
            return this;
        }

        /**
        * Represents the User first and lastname
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public CreateUserRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Represents the User email
        * @return email
        **/
        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(String email) {
            this.email = email;
        }

        public CreateUserRequestQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CreateUserRequestQueryParam {\n");

            sb.append("    username: ").append(toIndentedString(username)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}