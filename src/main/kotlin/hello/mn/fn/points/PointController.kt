package hello.mn.fn.points

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post

@Controller("/board")
class PointController {

    @Get("/{boardId}/points")
    fun getPoints(@PathVariable("boardId") boardId: Int): Array<Point> {
        return arrayOf(Point(102, "hello"), Point(103, "world"))
    }

    @Post("/{boardId}/point")
    fun createPoint(@PathVariable boardId: Int): Point {
        return Point(104, "created")
    }

    @Get("/{boardId}/points/{pointId}")
    fun getPoint(boardId: Int, pointId: Int): Point {
        return Point(pointId, "hello")
    }

}