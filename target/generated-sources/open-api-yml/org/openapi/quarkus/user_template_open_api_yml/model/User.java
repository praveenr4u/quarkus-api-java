package org.openapi.quarkus.user_template_open_api_yml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Represents details about User
 **/
public class User  {

    /**
      * Represents details about User
     **/
    private String username;
    /**
      * Represents details about User
     **/
    private String name;
    /**
      * Represents details about User
     **/
    private String email;
    /**
      * Represents details about User
     **/
    private LocalDate createdAt;
    /**
      * Represents details about User
     **/
    private LocalDate updatedAt;

    /**
    * Represents a standard User identifier
    * @return username
    **/
    @JsonProperty("username")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(String username) {
        this.username = username;
    }

    public User username(String username) {
        this.username = username;
        return this;
    }

    /**
    * Represents the User first and lastname
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Represents the User email
    * @return email
    **/
    @JsonProperty("email")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    /**
    * Creation date and time UTC ISO 8601 full-time format
    * @return createdAt
    **/
    @JsonProperty("createdAt")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    /**
     * Set createdAt
     **/
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public User createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
    * Updated at date and time UTC ISO 8601 full-time format
    * @return updatedAt
    **/
    @JsonProperty("updatedAt")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Set updatedAt
     **/
    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User updatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        
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
      * Represents details about User
     **/
    public static class UserQueryParam  {

        /**
          * Represents details about User
         **/
        @jakarta.ws.rs.QueryParam("username")
        private String username;
        /**
          * Represents details about User
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Represents details about User
         **/
        @jakarta.ws.rs.QueryParam("email")
        private String email;
        /**
          * Represents details about User
         **/
        @jakarta.ws.rs.QueryParam("createdAt")
        private LocalDate createdAt;
        /**
          * Represents details about User
         **/
        @jakarta.ws.rs.QueryParam("updatedAt")
        private LocalDate updatedAt;

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

        public UserQueryParam username(String username) {
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

        public UserQueryParam name(String name) {
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

        public UserQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * Creation date and time UTC ISO 8601 full-time format
        * @return createdAt
        **/
        @JsonProperty("createdAt")
        public LocalDate getCreatedAt() {
            return createdAt;
        }

        /**
         * Set createdAt
         **/
        public void setCreatedAt(LocalDate createdAt) {
            this.createdAt = createdAt;
        }

        public UserQueryParam createdAt(LocalDate createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
        * Updated at date and time UTC ISO 8601 full-time format
        * @return updatedAt
        **/
        @JsonProperty("updatedAt")
        public LocalDate getUpdatedAt() {
            return updatedAt;
        }

        /**
         * Set updatedAt
         **/
        public void setUpdatedAt(LocalDate updatedAt) {
            this.updatedAt = updatedAt;
        }

        public UserQueryParam updatedAt(LocalDate updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserQueryParam {\n");

            sb.append("    username: ").append(toIndentedString(username)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
            sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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