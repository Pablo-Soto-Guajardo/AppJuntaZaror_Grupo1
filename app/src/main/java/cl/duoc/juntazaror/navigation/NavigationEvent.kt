package cl.duoc.juntazaror.navigation

sealed class NavigationEvent {
    data class NavigateTo(
        val route: Screen,
        val popUpToRoute: Screen? = null,
        val inclusive: Boolean = false,
        val singleTop: Boolean = false,
        val limpiarPila: Boolean = false
    ) : NavigationEvent()

    data object PopBackStack : NavigationEvent()

    data object NavigateUp : NavigationEvent()
}
