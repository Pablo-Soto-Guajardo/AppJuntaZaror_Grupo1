package cl.duoc.juntazaror.navigation
sealed class Screen(val route: String) {


    open val destino: String get() = route

    data object Splash : Screen("splash")
    data object Login : Screen("login")
    data object Registro : Screen("registro")
    data object Inicio : Screen("inicio")
    data object Reservas : Screen("reservas")
    data object NuevaReserva : Screen("nueva_reserva")
    data object Finanzas : Screen("finanzas")
    data object NuevoMovimiento : Screen("nuevo_movimiento")
    data object Perfil : Screen("perfil")

    data class DetalleMovimiento(val movimientoId: Long) : Screen("detalle_movimiento/{movimientoId}") {
        override val destino: String get() = route.replace("{$ARGUMENTO}", movimientoId.toString())

        companion object {
            const val ARGUMENTO = "movimientoId"
            const val RUTA = "detalle_movimiento/{$ARGUMENTO}"
        }
    }
}
