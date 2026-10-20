package cl.duoc.juntazaror.data.repository

import cl.duoc.juntazaror.data.local.SesionDataStore
import kotlinx.coroutines.flow.first

class SesionRepository(private val sesionDataStore: SesionDataStore) {

    suspend fun obtenerUsuarioId(): Long? = sesionDataStore.usuarioId.first()

    suspend fun notificacionesActivas(): Boolean = sesionDataStore.notificacionesActivas.first()

    suspend fun iniciarSesion(usuarioId: Long) = sesionDataStore.guardarSesion(usuarioId)

    suspend fun cerrarSesion() = sesionDataStore.cerrarSesion()

    suspend fun guardarNotificaciones(activas: Boolean) =
        sesionDataStore.guardarNotificaciones(activas)
}
