package hello.mn.fn.board

import com.fasterxml.jackson.annotation.JsonProperty

data class Board(
        @JsonProperty("id") val id: Int,
        @JsonProperty("name") val name: String,
        @JsonProperty("createdBy") val createdBy: String,
        @JsonProperty("sections") val sections: String
)