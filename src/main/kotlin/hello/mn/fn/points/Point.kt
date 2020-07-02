package hello.mn.fn.points

import com.fasterxml.jackson.annotation.JsonProperty

data class Point(
        @JsonProperty("id") val id: Int,
        @JsonProperty("message") val message: String
)