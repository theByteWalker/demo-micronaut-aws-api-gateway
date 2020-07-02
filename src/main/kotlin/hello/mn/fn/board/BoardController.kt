package hello.mn.fn.board

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*

@Controller("/board")
class BoardController {

    @Get
    fun getAllBoards(): Array<Board> {
        return arrayOf(Board(1, "test-board", "sagar", "Dos, Donts "))
    }

    @Post
    fun createBoard(@Body board: Board): HttpResponse<Board> {
        return HttpResponse.created(board)
    }

    @Get("/{boardId}")
    fun getBoard(@PathVariable boardId: Int): Board {
        return Board(boardId, "Board- found", "user", "1,2,3")
    }
}