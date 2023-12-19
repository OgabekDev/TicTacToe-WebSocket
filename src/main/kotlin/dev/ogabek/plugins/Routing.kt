package dev.ogabek.plugins

import dev.ogabek.models.TicTacToeGame
import dev.ogabek.socket
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}
