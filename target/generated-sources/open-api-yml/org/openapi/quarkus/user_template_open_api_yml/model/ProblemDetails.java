package org.openapi.quarkus.user_template_open_api_yml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
 **/
public class ProblemDetails  {

    /**
      * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
     **/
    private Map<String, String> detail;
    /**
      * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
     **/
    private URI instance;
    /**
      * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
     **/
    private Integer status;
    /**
      * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
     **/
    private String title;
    /**
      * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
     **/
    private URI type = URI.create("about:blank");

    /**
    * A human readable explanation specific to this occurrence of the problem.
    * @return detail
    **/
    @JsonProperty("detail")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getDetail() {
        return detail;
    }

    /**
     * Set detail
     **/
    public void setDetail(Map<String, String> detail) {
        this.detail = detail;
    }

    public ProblemDetails detail(Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public ProblemDetails putDetailItem(String key, String detailItem) {
           if (this.detail == null){
                detail = new HashMap<>();
            }
        this.detail.put(key, detailItem);
        return this;
    }

    /**
    * An absolute URI that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced.
    * @return instance
    **/
    @JsonProperty("instance")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public URI getInstance() {
        return instance;
    }

    /**
     * Set instance
     **/
    public void setInstance(URI instance) {
        this.instance = instance;
    }

    public ProblemDetails instance(URI instance) {
        this.instance = instance;
        return this;
    }

    /**
    * The HTTP status code generated by the origin server for this occurrence the problem.
    * minimum: 100
    * maximum: 600
    * @return status
    **/
    @JsonProperty("status")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProblemDetails status(Integer status) {
        this.status = status;
        return this;
    }

    /**
    * A short, summary of the problem type. Written in english and readable for engineers (usually not suited for non technical stakeholders and not localized);
    * @return title
    **/
    @JsonProperty("title")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public ProblemDetails title(String title) {
        this.title = title;
        return this;
    }

    /**
    * An absolute URI that identifies the problem type.  When dereferenced, it SHOULD provide human-readable documentation for the problem type (e.g., using HTML).
    * @return type
    **/
    @JsonProperty("type")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public URI getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(URI type) {
        this.type = type;
    }

    public ProblemDetails type(URI type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProblemDetails {\n");

        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
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
      * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
     **/
    public static class ProblemDetailsQueryParam  {

        /**
          * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
         **/
        @jakarta.ws.rs.QueryParam("detail")
        private Map<String, String> detail = null;
        /**
          * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
         **/
        @jakarta.ws.rs.QueryParam("instance")
        private URI instance;
        /**
          * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
         **/
        @jakarta.ws.rs.QueryParam("status")
        private Integer status;
        /**
          * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
         **/
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        /**
          * Represents the details of a problem that occurred while processing a request. This object is consistent with RFC 7807, “Problem Details for HTTP APIs” (https://tools.ietf.org/html/rfc7807).
         **/
        @jakarta.ws.rs.QueryParam("type")
        private URI type = URI.create("about:blank");

        /**
        * A human readable explanation specific to this occurrence of the problem.
        * @return detail
        **/
        @JsonProperty("detail")
        public Map<String, String> getDetail() {
            return detail;
        }

        /**
         * Set detail
         **/
        public void setDetail(Map<String, String> detail) {
            this.detail = detail;
        }

        public ProblemDetailsQueryParam detail(Map<String, String> detail) {
            this.detail = detail;
            return this;
        }
        public ProblemDetailsQueryParam putDetailItem(String key, String detailItem) {
            this.detail.put(key, detailItem);
            return this;
        }

        /**
        * An absolute URI that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced.
        * @return instance
        **/
        @JsonProperty("instance")
        public URI getInstance() {
            return instance;
        }

        /**
         * Set instance
         **/
        public void setInstance(URI instance) {
            this.instance = instance;
        }

        public ProblemDetailsQueryParam instance(URI instance) {
            this.instance = instance;
            return this;
        }

        /**
        * The HTTP status code generated by the origin server for this occurrence the problem.
        * minimum: 100
        * maximum: 600
        * @return status
        **/
        @JsonProperty("status")
        public Integer getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(Integer status) {
            this.status = status;
        }

        public ProblemDetailsQueryParam status(Integer status) {
            this.status = status;
            return this;
        }

        /**
        * A short, summary of the problem type. Written in english and readable for engineers (usually not suited for non technical stakeholders and not localized);
        * @return title
        **/
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public ProblemDetailsQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * An absolute URI that identifies the problem type.  When dereferenced, it SHOULD provide human-readable documentation for the problem type (e.g., using HTML).
        * @return type
        **/
        @JsonProperty("type")
        public URI getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(URI type) {
            this.type = type;
        }

        public ProblemDetailsQueryParam type(URI type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProblemDetailsQueryParam {\n");

            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
            sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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